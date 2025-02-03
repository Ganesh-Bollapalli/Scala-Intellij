
object Scope{
  val name="ganesh" // field
  def age():String={
    val height = 40  // local variable
    println(s"$height")
    "outside function"
  }
  // println(s"$height")
  println("function outside main", age())
  println("name accessing outside", name) // For outside var or func we can use Obj.
  // println(clg, loc())

  def main(args: Array[String]): Unit = {
    val clg="rvr" // local varaible
    def loc():String={
      "Function inside main method"
    }
    println("inside function inside", loc())
    println("clg accessing inside main", clg) // For inside var or func we cannot use obj
    println("outside function inside", age())
    println("name accessing inside", name) // Outside main values we can use Obj.
    // println(height)
  }
  // loc()
  // println("clg accessing outside", clg)
}



/* class Features(val n:Int){   // cons args can be val or var
  var name="fury"  // field
  val age=25
  def work(height:Int): Unit = { // method parameter // don't give var (or) val to method parameter
    val org = "lit"  // local variable
    println(org)
    println(name)
    println(height)
  }
  // println(org)
  println(age)
  // println(height)
}

object Scope{
  def main(args: Array[String]): Unit = {
    var obj = new Features(2)  // obj can be val or var
    println(obj.name, obj.age) // cannot give obj.org, obj.height
    println(obj.work(6))
  }
} */