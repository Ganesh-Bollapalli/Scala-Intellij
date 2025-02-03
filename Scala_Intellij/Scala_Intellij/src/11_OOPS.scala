/* class Demo11{
  def working(a:Int, b:Int):Int={
    return a+b
  }
  def working(a:Int, b:Double):Double={
    return a+b
  }
}

object OOPS {
  def main(args: Array[String]): Unit = {
    println("Hello world!")
    val obj = new Demo11()
    println(obj.working(4,5))
    println(obj.working(2,3.0))
  }
} */

/* class Demo(val x:Int, val y:Int){
  val a = x
  val b = y
  def work(dx:Int, dy:Int):Int={
    val m = a+dx
    val n = b+dy
    val h=m+n
    return h
  }
}

object OOPS{
  def main(args: Array[String]): Unit = {
    println("welcome to oops bsdk")
    val obj=new Demo(2,3)
    val result=obj.work(5,6)
    println(result)
  }
}
*/

/* class Venkat(var x:String, var y:String){
  println("this is venkateswarlu")
  val initial=x
  val character=y
  def work():Unit={
    println("Farmer")
  }
}
class Ganesh(x:String, y:String, var age:Int, var loc:String) extends Venkat(x,y){
  println("this is fury")
  val job="software"
  val behaviour="worst"
  override def work():Unit={
    //super.work()
    println("Software")
  }
}

object OOPS {
  def main(args: Array[String]): Unit = {
    val v = new Venkat("bollapalli", "good")
    val g = new Ganesh("bolla", "bad", 24, "Hyd")
    println(v.initial, v.character)
    println(g.job, g.behaviour, g.initial, g.character)
    v.work()
    g.work()
  }
} */

/*
trait fury{
  def add(x:Int,y:Int): Int
  def mul(x:Int, y:Int):Int={x*y}
}
class Demo1 extends fury{
  def add(x:Int, y:Int):Int={x+y}
}

object OOPS{
  def main(args: Array[String]): Unit = {
    var obj=new Demo1()
    println(obj.add(2,3))
    println(obj.mul(3,4))
  }
} */
// No construtors
// should be inherited into class
// no object
// traits can contain abstract and nonabstract methods


package OOPS
class xyz{
  private val x=2
  protected val y=3
  val z=4
  println(x,y,z)
}

class mno extends xyz{
  // println(x) // will get error x is private to xyz class
  println(y)
  println(z)
}
object OOPS {
  def main(args: Array[String]): Unit = {
    //val xyz=new xyz()
    val m=new mno()
    // println(m.y) // we should use inside child class scope
    println(m.z)
  }
}












