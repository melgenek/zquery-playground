import zio.query.{DataSource, RQuery, Request, ZQuery}
import zio.{Chunk, Has, Runtime, ZIO}

import scala.util.Random

case class Bearer(value: String)

case class User(id: Long, name: String, addressId: Long, paymentId: Long)
case class Address(id: Long, street: String)
case class Payment(id: Long, name: String)

object Sources {

  val totalCount = 15000

  type HasToken = Has[Bearer]

  case class GetPayment(id: Long) extends Request[Nothing, Payment]
  val paymentSource: DataSource[HasToken, GetPayment] =
    DataSource.fromFunctionBatchedOptionM("PaymentSource") { requests: Chunk[GetPayment] =>
      ZIO.succeed(
        List.tabulate(totalCount)(Payment(_, "payment name"))
      ).map { payments =>
        requests.map(req => payments.find(_.id == req.id))
      }
    }

  def getPayment(id: Long): RQuery[HasToken, Payment] = {
    ZQuery.fromRequest(GetPayment(id))(paymentSource)
  }

  case class GetAddress(id: Long) extends Request[Nothing, Address]
  val addressSource: DataSource[HasToken, GetAddress] =
    DataSource.fromFunctionBatchedOptionM("AddressSource") { requests: Chunk[GetAddress] =>
      ZIO.succeed(
        List.tabulate(totalCount)(Address(_, "street"))
      ).map {
        addresses => requests.map(req => addresses.find(_.id == req.id))
      }
    }

  def getAddress(id: Long): RQuery[HasToken, Address] = {
    ZQuery.fromRequest(GetAddress(id))(addressSource)
  }

}

object Main extends App {

  val bearerToken = Bearer("any")
  val result = for {
    users <- ZQuery.fromEffect(ZIO.succeed(
      List.tabulate(Sources.totalCount)(id => User(id, "user name", id, id))
    ))
    richUsers <- ZQuery.foreachPar(users) { user =>
      Sources.getPayment(user.paymentId)
        .zipPar(Sources.getAddress(user.addressId))
        .map { case (payment, address) =>
          (user, payment, address)
        }
    }
  } yield richUsers.size

  println(Runtime.default.unsafeRun(result.run.provide(Has(bearerToken))))

}
