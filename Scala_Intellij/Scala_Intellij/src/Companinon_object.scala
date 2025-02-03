 class Fury(val name:String, val age:Int){
   private val state :String ="AP"
   println(s"all states are $state")
  private def describe():Unit={println(s"My name is $name and age is $age")}
}
 /*
 -> companion object has same name as class and in same file
 -> which holds static fields and methods of class not of instances
 -> They can access the private members of class, but only with object
 -> We define method apply which creates instance of class without using new keyword
 -> method apply is called automatically */
object Fury{
  val height :Int = 175
  def work(company : String):Unit={println(s"working in $company")}
  def apply(name:String, age:Int):Fury= new Fury(name, age)// apply is called automatically and creates instance of above class
  def apply():Fury=new Fury("mnk", 24)
  def otherthan_apply():Fury=new Fury("yash", 26)
  // we can create factory method with any name other than apply, but apply runs automatically
  // where as for factory methods with other names we need to call explicitly
  def main(args: Array[String]): Unit = {
    val a1=Fury("ganesh", 24) // by this apply method will be called automatically and creates instance of the class
    val a2=Fury() // mnk apply will be called automatically
    val a3=Fury.otherthan_apply() // as factory method is not apply we need to call explicilty
    a1.describe() // accessing the private members of the class using companion object
    a2.describe()
    a3.describe()
    println(a1.state, a2.state, a3.state) // we can access private members of class but only with object
    println(s"height is $height") // not used object to access it, as filed height is static
    println(work("LTI")) // not used object to call work bcz, it is static it belongs to class not on instances
  }
}

/////////////////////////////////////////////////////////////

 /*class Fury(val name:String, val age:Int){
   def describe():Unit={println(s"Fury Gani name is $name and age is $age")}
 }
 object Fury{
   def apply(name:String, age:Int):Fury=new Fury(name, age)
 }
 object Main{
   def main(args: Array[String]): Unit = {
     val f1=Fury("ganesh", 25)
     f1.describe()
   }
 } */
