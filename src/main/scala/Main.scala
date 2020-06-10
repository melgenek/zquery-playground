import zio.query.{DataSource, Request, UQuery, ZQuery}
import zio.{Chunk, Runtime, ZIO}

case class User(id: Long, name: String, addressId: Long, paymentId: Long)
case class Address(id: Long, street: String)
case class Payment(id: Long, name: String)

object Sources {

  case class GetPayment(id: Long) extends Request[Nothing, Payment]
  val paymentSource = DataSource.fromFunctionBatchedOptionM("PaymentSource") { requests: Chunk[GetPayment] =>
    ZIO.succeed(List(Payment(222, "sample222")))
      .map { payments =>
        requests.map(req => payments.find(_.id == req.id))
      }
  }

  def getPayment(id: Long): UQuery[Payment] = {
    ZQuery.fromRequest(GetPayment(id))(paymentSource)
  }

  case class GetAddress(id: Long) extends Request[Nothing, Address]
  val addressSource = DataSource.fromFunctionBatchedOptionM("AddressSource") { requests: Chunk[GetAddress] =>
    ZIO.succeed(List(Address(111, "sample111")))
      .map { addresses => requests.map(req => addresses.find(_.id == req.id)) }
  }

  def getAddress(id: Long): UQuery[Address] = {
    ZQuery.fromRequest(GetAddress(id))(addressSource)
  }

}

object Main extends App {

  val result = for {
    users <- ZQuery.fromEffect(ZIO.succeed(List(User(1, "user1", 111, 222))))
    richUsers <- ZQuery.foreachPar(users) { user =>
      Sources.getPayment(user.paymentId)
        .zipPar(Sources.getAddress(user.addressId))
        .map { case (payment, address) =>
          (user, payment, address)
        }
    }
  } yield richUsers

  println(Runtime.default.unsafeRun(result.run))

}
