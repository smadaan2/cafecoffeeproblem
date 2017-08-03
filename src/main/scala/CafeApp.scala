import scala.io.Source
import scala.util.{Failure, Success, Try}

/**
  * Created by hai on 6/20/2017.
  */
object CafeApp extends App {

  val itemsOrdered = List("Cola", "Coffee", "Sandwich")
  val cafeService: CafeService = DefaultCafeService
  println("ToatalBill:: " + cafeService.generateTotalBill(itemsOrdered))


}
