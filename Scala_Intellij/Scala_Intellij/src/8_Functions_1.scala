object Functions_1{
  def main(args: Array[String]): Unit = {
    // function defination
    def add(x:Int, y:Int=3):Int={
      println(s"x is $x")
      println(s"y is $y")
      val c=x+y
      c
    }
    // function calling
    val res=add(x=2)
    println(res)
    // Naming  > positional > default

    def mul(a : Int*):Unit={
      for(i <- a){
        println(i*2)
      }
    }
    var z:Array[Int]=new Array[Int](4)
    z(0)=1
    z(1)=2
    z(2)=3
    z(3)=4
    val k = Array(6,7,8,9)
    println(k(3))
    mul(z : _*)

  }
}