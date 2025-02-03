
/* object Implicit{

  def main(args: Array[String]): Unit = {
    // Implicit parameter ( automatic arguments assigning if not passed )
    /* implicit val a=10;
    def add(x:Int)(implicit y:Int):Unit={
      println(x+y)
    }
    add(10) */

    // Implicit function ( automatic datatype conversion )
    /* implicit def StringtoInt(z:String):Int={z.toInt}
    def add(x:Int, y:Int):Unit={ x+y }
    val res=add(12, "10")
    println(res) */

    // Implicit Class
  }
} */

object Implicit{
  implicit class extenedfunc(s:String){
    def toUpper:String={ s.toUpperCase }
  }
  def main(args: Array[String]): Unit = {
    val message="hello fury"
    println(message.toUpper)
  }
}
// Implicit class should be within other class or singleton object
// Implicit class can take only 1 constructor parameter