
// class with an object itself
// singleton object

object Demooo{
  def main(args: Array[String]): Unit = {
    println("hello world")
    // val/val name : DataType = value
    val age : Int = 24
    var height : Int = 175
    val name : String ="fury"
    height=180
    // age=25 ( we cannot reassign to val )
    println(age, name, height)
    println(s"i am $name of $age and of $height") // it substitues the values in the varibales
    printf("i am %s of %d of %d", name, age, height)
    println()
    println(f"i am $name%s of $age%d of $height%.1f")
    println(raw"i am $name of %d ")
  }
}