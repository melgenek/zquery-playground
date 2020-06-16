import zio.query.{DataSource, Request, UQuery, ZQuery}
import zio.{Chunk, Runtime, ZIO}


case class Bearer(value: String)

case class User(id: Long, name: String, addressId: Long, paymentId: Long)
case class Address(id: Long, street: String)
case class Payment(id: Long, name: String)

object Http {
  val payments = ZIO.succeed(List.tabulate(10)(Payment(_, "payment name")))

  val addresses = ZIO.succeed(List.tabulate(15000)(Address(_, "street")))

  val users = ZIO.succeed(List.tabulate(15000)(id => User(id, "user name", id, 5)))
}

object Queries {

  case class GetPayment(id: Long) extends Request[Nothing, Payment]
  val paymentSource: DataSource[Any, GetPayment] =
    DataSource.fromFunctionBatchedOptionM("PaymentSource") { requests: Chunk[GetPayment] =>
      Http.payments.map { payments =>
        requests.map(req => payments.find(_.id == req.id))
      }
    }

  def getPayment(id: Long): UQuery[Payment] = {
    ZQuery.fromRequest(GetPayment(id))(paymentSource)
  }

  case class GetAddress(id: Long) extends Request[Nothing, Address]
  val addressSource: DataSource[Any, GetAddress] =
    DataSource.fromFunctionBatchedOptionM("AddressSource") { requests: Chunk[GetAddress] =>
      Http.addresses.map {
        addresses => requests.map(req => addresses.find(_.id == req.id))
      }
    }

  def getAddress(id: Long): UQuery[Address] = {
    ZQuery.fromRequest(GetAddress(id))(addressSource)
  }

  val allUsers: ZQuery[Any, Nothing, List[User]] = ZQuery.fromEffect(Http.users)
}

object Main extends App {

  val simpleResult = for {
    users <- Http.users
    addresses <- Http.addresses
    payments <- Http.payments
  } yield {
    val addressesMap = addresses.groupBy(_.id).view.mapValues(_.head)
    val paymentsMap = payments.groupBy(_.id).view.mapValues(_.head)
    users.map { user =>
      val payment = paymentsMap(user.paymentId)
      val address = addressesMap(user.addressId)
      (user, payment, address)
    }
  }

  val zQueryResult = for {
    users <- Queries.allUsers
    richUsers <- ZQuery.foreachPar(users) { user =>
      Queries.getPayment(user.paymentId)
        .zipPar(Queries.getAddress(user.addressId))
        .map { case (payment, address) =>
          (user, payment, address)
        }
    }
  } yield richUsers

  val before1 = System.currentTimeMillis()
  val result1 = Runtime.default.unsafeRun(simpleResult)
  val after1 = System.currentTimeMillis()
  println(after1 - before1)

  val before2 = System.currentTimeMillis()
  val result2 = Runtime.default.unsafeRun(zQueryResult.run)
  val after2 = System.currentTimeMillis()
  println(after2 - before2)

  println(s"Ratio: ${(after2 - before2).toDouble / (after1 - before1)}")
  assert(result1 == result2)

}
