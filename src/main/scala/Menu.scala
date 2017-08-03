/**
  * Created by hai on 6/20/2017.
  */
object Menu {

  case class Item(name: String, price: Int, category: Category)

  case class Category(itemCategory: String, itemType: String)

  case class ServiceCharge(category: Category, percent: Double)

  val serviceCharge20 = ServiceCharge(Category("Food", "Hot"), 0.20)
  val serviceCharge10 = ServiceCharge(Category("Food", "Cold"), 0.10)
  val noServiceCharge = 0
  lazy val fileReader = new FileReader("E:\\TestProject\\src\\main\\resources\\CafeData")
  val stockItems = fileReader.readFile.map(_.split(",")).map(a => Item(a(0), a(2).toInt, Category(a(1), a(3))))


}
