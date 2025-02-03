
import OOPS.xyz

// Define the Animal class
class Animal(val name: String, val weight: Double) extends xyz{
  println("protected can be accces in any subclass whethre it is in same package or in different package", + y)
  def shouting(): String = s"The $name is making a noise!"
}

// Define the singleton object Demo
object Demo {
  // Create instances of
  def main(args: Array[String]): Unit = {
    val dog = new Animal("Dog", 25.0)
    val cat = new Animal("Cat", 4.5)
    val elephant = new Animal("Elephant", 5000.0)

    // Access and print the properties and method results for each animal
    println(s"Animal: ${dog.name}, Weight: ${dog.weight}, Shouting: ${dog.shouting()}")
    println(s"Animal: ${cat.name}, Weight: ${cat.weight}, Shouting: ${cat.shouting()}")
    println(s"Animal: ${elephant.name}, Weight: ${elephant.weight}, Shouting: ${elephant.shouting()}")
  }

}
