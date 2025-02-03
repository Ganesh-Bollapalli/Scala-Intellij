
object Options{
  def main(args: Array[String]): Unit = {
    def greet(name: Option[String]):Unit={
      name match{
        case Some(n)=> println(s"mu name is $n")
        case None => println("none")
      }
    }
    greet(Some("fury24"))
    //greet(None)

    val pos = 16
    val neg = -2

    def squareroot(x:Int):Option[Double]={
      if(x>0) Some(Math.sqrt(x))
      else None
    }
    println(squareroot(neg))


  }
}