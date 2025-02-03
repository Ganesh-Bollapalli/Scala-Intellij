class Pizza(val name:String, val toppings:String){
  private val price : Double = 300
  def describe():Unit={println(s"pizza is $name and $toppings")}
}

object PizzaFactory{         // not companion object, so we cannot access private members of pizza class
  val height=25
    def createMargarita(): Pizza = new Pizza("margarita", "corn") // Factory methods which creates instance of above class
    def createChicken(name:String, toppings:String): Pizza = new Pizza(name, toppings)
    // Factory methods can have names other than apply, but these need to be invoked explicitly
  def main(args: Array[String]): Unit = {
    val p1 = PizzaFactory.createMargarita()
    val p2 = PizzaFactory.createChicken("chicken", "mutton")
    val p3 = new Pizza("fish", "prawns") // General object
    p1.describe()
    p2.describe()
    p3.describe()
    println(height)
    // println(s"price is $price") // as its not companion object we cannot access it's private members
    println(s"height is $height") // these are static to PizzaFactory but doesn't belongs to Pizza class
  }
}

///////////////////////////////////////////////////////////

/* class Pizza(val name:String, val toppings:String){
  def describe():Unit={println(s"pizza is $name and $toppings")}
}
object PizzaFactory{
  def createMargarita(): Pizza = new Pizza("margarita", "corn")
  def createChicken(): Pizza = new Pizza("chicken", "mutton")
}
object Demoo{
  def main(args: Array[String]): Unit = {
    val p1=PizzaFactory.createMargarita()
    val p2=PizzaFactory.createChicken()
    p1.describe()
    p2.describe()
  }
} */