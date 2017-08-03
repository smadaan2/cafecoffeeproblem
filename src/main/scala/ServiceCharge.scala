/**
  * Created by hai on 6/20/2017.
  */
object ServiceCharge {

  val maxServiceCharge: Double = 30.00

  def calculateServiceCharge(billamount: Int, percent: Double): Double = {
    val serviceCharge = percent * billamount
    if (percent == 0.20 && serviceCharge > maxServiceCharge) maxServiceCharge
    else serviceCharge
  }
}
