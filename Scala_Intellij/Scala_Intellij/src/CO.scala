class CO(name:String, age:Int){
  private val Name=name;
  private val Age=age;
  println(s"name is $Name")
  println(s"age is $Age")
}

object CO{
  def apply(): CO =new CO("ganesh", 24)
  def main(args: Array[String]): Unit = {
    val c1=CO()
    println(c1.Name, c1.Age)
  }
}
