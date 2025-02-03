
object Unconditional{
  def main(args: Array[String]): Unit = {
    // sum of even numbers between 1 to 100(including)
    var sum=0
    for(i <- 1 to 100){
      if(i%2==0) sum=sum+i
    }
    println(sum)

    // prime or not for 2 to 10 numbers
    for(n <- 2 to 10){
      def primeornt(n:Int):Boolean={
        if(n<=1) return false
        else{
          for(i<- 2 until n){
            if(n%i==0) return false
          }
          true
        }
      }
      val res=primeornt(n)
      if(res==true) println(s"$n is prime")
      else println(s"$n is not prime")
    }

    // factorial of numbers from 1 to 10
    def factorial(n:Int):Int= {
      if(n<=1) return 1
      else n*factorial(n-1)
    }
    for(i<- 1 to 10){
      println(s"factorial of $i is "+ factorial(i))
    }

    // factorial of a number normally without recursion
    val number = 5 // You can change this number to calculate the factorial of a different number
    var result = 1
    var i = number
    while (i > 1) {
      result *= i
      i -= 1
    }
    println(s"The factorial of $number is $result")

    // List operations
    val L : List[Int]=List(1,2,3,4,5,6,7,8,9)
    val newList= L.map(n=>n+n)
    println(newList)
    println(newList(1))
    val evenList= L.flatMap(n => {if(n%2==0) Some(n) else None}) // (or) L.filter(n=>n%2==0)
    println(evenList)
    println(evenList.max, evenList.min, evenList.head, evenList.tail, evenList.last, evenList.isEmpty)
    var summ=0
    for(i<-evenList){ summ=summ+i }
    println(summ)
    val oddList= L.filter(n=>n%2!=0)
    println(oddList)
    //L.foreach(n=>println(n*2)) // similar to loop

    val m : Map[String, Any]= Map("name"-> "fury", "age"->24, "lst_name"-> "fury")
    println(m.keys)
    println(m.values)
    println(m.get("name"))

    val s=Set(1,2,3,4,5)
    println(s(1))  // unordered so don't access like this, convert toList (or) use forEach
  }
}