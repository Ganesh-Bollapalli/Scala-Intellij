object util{
  def eat():Unit={println("i am eating")}
  def work(name:String):Unit={println(s"working in $name")}
  def main(args: Array[String]): Unit = {
    util.eat()
    util.work("LTI")
  }
  eat()
}
