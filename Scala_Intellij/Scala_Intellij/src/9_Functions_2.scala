import scala.annotation.tailrec

object Functions_2{
  def main(args: Array[String]): Unit = {
    val k=(x:Int, y:Int)=>{x*y} // function literal or anonmyous function
    //(ip)=>{op} in scala
    // lambda ip : op in python
    println(k(2,3))
    println(k(3, 4))
    // Any function in scala can be expressed as function literal


    /* def mul(y:Int):Int={y*100}
    def add(y:Int, z:Int):Int={z+y+100}
    def fac(x:Int, y:Int):Int={x*100+y*100}

    def Multiple(f:(Int,Int)=>Int, k:Int, m:Int):Int={f(k,m)} // mul(k) or mul(4)
    println(Multiple(fac, 4, 3))



    def hof(factor:Int):Int=>Int ={
      return (x:Int)=>x+factor
    }
    val k = hof(4) // val k = (x:Int)=>x+4
    println(k(2)) */


    //def add(x:Int, y:Int, z:Int):Unit={println(x+y+z)}
    //add(2,3,4)

    //def addition(x:Int)(y:Int)(z:Int):Unit={println(x+y+z)}
    //addition(2)(3)(4)

    /* def mul(x:Int)(y:Int)(z:Int):Int={x*y*z}
    val multiply = mul(6)_
    println(multiply(2)(3)) */

    def fac(n:Int):Int={
      if(n<=1) return 1 // base condition
      else return n*fac(n-1)  // recursion
    }
    println(fac(4))

    /*
    fac(4) --> 4*fac(3)     --> 4 should be stored
    fac(3) --> 3*fact(2)    --> 4*3
    fac(2) --> 2*fac(1)     --> 4*3*2
    fac(1) --> 1
     */
    def factorial(n:Int):Int={
      @tailrec
      def rec_fact(n:Int, acc:Int):Int={
        if(n<=1) return acc //base condition
        else return rec_fact(n-1, n*acc) // recursive
      }
      rec_fact(n,1)
    }
    println(factorial(5))
    /*
    factorial(n=5)
    rec_fact(n=5,acc=1) --> rec_fact(4, 5*1)
    rec_fact(n=4, acc=5) --> rec_fact(3, 4*5)
    rec_fact(n=3, acc=20) --> rec_fact(2, 60)
    rec_fact(n=2, acc=60) --> rec_fact(1, 120)
    rec_fact(n=1, acc=120) --> return 120
     */

// Closure





  }
}