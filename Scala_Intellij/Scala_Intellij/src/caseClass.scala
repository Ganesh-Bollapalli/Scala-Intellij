
case class person(name:String, age:Int)

object caseClass{
  def main(args: Array[String]): Unit = {
    val p1=person("fury", 25)
    val p2=person("ganesh", 24) // we can create objects for case class without new keyword (bcz case class has inbuilt
    // --> apply method
    println(p1.name, p2.age) //access fields
    println(p1) // printing instances
    val p3=p1.copy(age=23) // copy method to create new instances, bcz as case classes are immutable we cannot modify instance
    println(p3)
    //pattern matching instances against case class
    def person_match(per: person):Unit=per match{  // case class has inbuilt unapply method
      case person("fury", 25) => println("fury gani")
      case person("ganesh", 24) => println("ganesh bollapalli")
      case person("fury", 23) => println("small fury")
    }
    person_match(p2)
  }
}
