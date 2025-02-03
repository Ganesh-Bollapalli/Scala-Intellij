object Common_programs{
  def main(args: Array[String]): Unit = {
    implicit val x=5
    // PRIME OR NOT
    def primeornot(implicit x:Int):Boolean={
      if(x<=1) return false
      else{
        for(i <- 2 until x){
          if(x%i==0) return false
          }
         }
      true
    }
    val res1=primeornot(x)
    if(res1==true) println(s"$x is prime")
    else println(s"$x is not prime")

    // PERFECT NUMBER OR NOT
    def perfectornot(implicit x:Int):Boolean={
      if(x<1) return false
      else{
        var sum:Int=0
        for(i<- 1 until x){
          var rem=x%i
          if(rem==0){sum+=i}
        }
        if(sum==x) return true
      }
      false
    }
    val res2=perfectornot(x)
    if(res2==true) println(s"$x is perfect number")
    else println(s"$x is not perfect number")

    // FACTORIAL
    def factorial(implicit x:Int):Int={
      if(x<=1) return 1
      else x*factorial(x-1)
    }
    val res3=factorial(x)
    println(s"factorial of $x is $res3")

    // Recursive Factorial
    def rec_factorial(implicit x:Int):Int={
      def fact(x:Int, a:Int):Int= {
        if (x <= 1) return a
        else fact(x - 1, a * x)
      }
      fact(x,1)
    }
    val res4=rec_factorial(x)
    println(s"rec factorial of $x is $res4")

    // GCD
    def gcd(a:Int, b:Int):Int={
      if(b==0) return a
      else gcd(b, a%b)
    }
    val res5=gcd(x, 3)
    println(s"gcd of $x and 3 is $res5")

    // FIBANOCCI
    def fib(x:Int):Int={
      if(x<=1) return x
      else return fib(x-1)+fib(x-2)
    }
    val res6=fib(x)
    println(s"fib series of $x is $res6")

    // Third highest in a list without using inbuilt functions
    def thirdHighest(list: List[Int]): Option[Int] = {
      if (list.size < 3) return None  // If the list has fewer than 3 elements, return None

      var highest = Int.MinValue
      var secondHighest = Int.MinValue
      var thirdHighest = Int.MinValue

      for (num <- list) {
        if (num > highest) {
          thirdHighest = secondHighest
          secondHighest = highest
          highest = num
        } else if (num > secondHighest) {
          thirdHighest = secondHighest
          secondHighest = num
        } else if (num > thirdHighest) {
          thirdHighest = num
        }
      }
      // If we couldn't find a valid third highest, return None
      if (thirdHighest == Int.MinValue) None else Some(thirdHighest)
    }
    // Example usage:
    val list = List(1, 5, 3, 7, 2, 9)
    val result = thirdHighest(list)

    result match {
      case Some(value) => println(s"The 3rd highest number is: $value")
      case None => println("There are fewer than 3 elements in the list.")
    }
  }
}