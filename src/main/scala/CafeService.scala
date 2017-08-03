import Menu._
import ServiceCharge._

/**
  * Created by hai on 6/22/2017.
  */
trait CafeService {
  def generateTotalBill(items: List[String]): Double
}

object DefaultCafeService extends CafeService {
  def generateTotalBill(items: List[String]): Double = {
    val orderedItems = items.flatMap(a => stockItems.find(_.name == a))
    val itemsType = orderedItems.map(a => a.category).distinct
    val findServiceCharge = (category: Category) => itemsType.contains(category)
    val serviceCharge: Double = {
      if (findServiceCharge(serviceCharge20.category)) serviceCharge20.percent
      else if (findServiceCharge(serviceCharge10.category)) serviceCharge10.percent
      else noServiceCharge
    }
    calculateTotalBill(orderedItems, serviceCharge)
  }

  def calculateTotalBill(items: List[Item], percent: Double): Double = {
    val calculateBillAmount = items.foldLeft(0)((res, curr) => res + curr.price)
    if (percent == noServiceCharge) calculateBillAmount
    else calculateBillAmount + ServiceCharge.calculateServiceCharge(calculateBillAmount, percent)
  }
}


