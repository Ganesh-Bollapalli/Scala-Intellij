
object Control_statements {
  def main(args: Array[String]): Unit = {

    // Lists ( Hetero(by default homo), Immutable, Dup, Order ) // scala
    // Lists ( Hetero by default, Mutable, Dup, Order ) // Python
    val L1 : List[Int]=List(1,2,3,4,5,6)
    // map, filter, foreach, splitAt
    val n=L1.map(n=>n*2)
    println(n)
    val m=L1.filter(x=>x%2==0)
    println(m)
    L1.foreach(y=>println((y / 2).asInstanceOf[Float]))


    val L2 = 9::(2::(3::Nil))
    println(L1, L2)
    println(L1(3), L2.apply(1)) // access
    println(L1.head, L1.tail, L1.last, L1.take(2), L1.isEmpty, L1.max, L1.min, L1.size)
    println(L1.reverse, L1.sorted(Ordering[Int].reverse), L1.length, List.fill(3)("LTI"))
    println(L1.indexOf(10), 22 :: L1, 23 +: L1, L2.:::(L1), L1:::L2, List.concat(L1, L2))
    println(L1.mkString("-"), L1.toString())
    println(L1.slice(2,3))


    // Tuples (Hetero, Immutable, Dup, Order)
    val tuple1 = ("fury", "ganesh", 5)
    println(tuple1)
    println(tuple1._1) // access

    // Map ( Key: Unq, val : Dup )
    var map1 : Map[String, Any] = Map("age" -> 22, "name" -> "fury")
    println(map1.keys)
    println(map1.get("age")) // access

    // Set ( Hetero, mut/immu, unq, unordered )
    val set1 = Set(1,2,3,4,5, "fury")
    println(set1)
    // println("my set value is" + set1(1)) unordered we cannot access

    // Strings ( immutable )
    val str1 : String ="ganeshbollapalli"
    val str2 : String ="furygani"
    println(str1)
    println(str1(3), str1.apply(4), str2.charAt(4))
    println(str1.length, str1.reverse, str1.sorted, str1.concat(str2))
    println(str1.substring(6,16), str1.indexOf("h"), str1.replace("ganesh", "gani"), str1.toUpperCase())
    println(str1.compareTo(str2), str1.endsWith("h"), str2.startsWith("fury"), str1.matches(".*boll.*"))
     val str ="fury-gani-bollapalli"
    println(str.split("-"))
    println(str.toList)

    // Arrays ( Homo, Mutable, order, Dup )
    val a : Array[Int] = Array(1,2,3,4)
    val b = new Array[Int](3)
    val c : Array[Int]= Array.range(0,10,3)
    // println(c)
    val d : Array[Array[Int]] = Array.ofDim[Int](3,4)



  }
}
