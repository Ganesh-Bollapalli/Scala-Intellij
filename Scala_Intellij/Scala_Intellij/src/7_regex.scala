
import scala.util.matching.Regex
/* class Regex(x:String){
  def r():Unit={}
  def findFirstIn......
  def findAllIN......
} */

object regex{
  def main(args: Array[String]): Unit = {
    //val pattern="scala".r
    val pattern=new Regex("S|scala") // which is nothing but object of imported Regex class
    val str="scala is a scalable language"
    println(pattern.findFirstIn(str))
    println((pattern.findAllIn(str)).mkString(","))
    println(pattern.replaceFirstIn(str, "java"))
    println(pattern.replaceAllIn(str, "java"))
  }
}