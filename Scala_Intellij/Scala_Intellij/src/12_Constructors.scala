
 /* class abc(var x:Int, var y:String){ // Primary constructor
   val name=y;
   val age=x;
  println(s"my name is $name")
  println(f"my age is $age%.4f")
}

object Constructors{
  def main(args: Array[String]): Unit = {
  var obj1 = new abc(24, "ganesh")  // Primary Constructor will be called and "executes everything inside the class" except method
  printf("name name is %s and age is %d", obj1.name, obj1.age)
  }
} */


class abc(val name:String, val age:Int){
  println("yes auxilary constructor also runs everything in class")
  def this(name:String){ // this gets called first
    this(name, 0) // this will call primary constructor with default value 0 ( ntg inside this function except this call to primary constructor
  println("inside aux")
  }
}
object Constrcutors{
  def main(args: Array[String]): Unit = {
    val obj1=new abc("ganesh") // first evrything inside class runs so we get both println ahead of below values
    println(obj1.name, obj1.age)
  }
}