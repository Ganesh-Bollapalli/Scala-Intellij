/* object Conditional{
  def main(args: Array[String]): Unit = {
    val age=107;
    if(age<18){
      println(s"person of age $age is not eligible")
    }
    else if(age>18 && age<100){
      println(s"person of age $age is eligible")
    }
    else{
      println(s"old person please take care")
    }
  }
} */

object Conditions{
  def main(args: Array[String]): Unit = {
    val input = scala.io.StdIn.readLine()
    input match {
      case "ego" => println("its fury gani")
      case "balupu" => println("its stk")
      case "show fellow" => println("its yash")
      case _ => println("none")
    }
  }
}