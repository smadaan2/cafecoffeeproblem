import scala.io.Source
import scala.util.{Success, Try}

/**
  * Created by hai on 6/22/2017.
  */
class FileReader(filename: String) {

  def readFile: List[String] = {
    Source.fromFile(filename).getLines().toList
  }
}
