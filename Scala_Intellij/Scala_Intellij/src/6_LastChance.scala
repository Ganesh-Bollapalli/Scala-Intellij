object LastChance {
  def main(args: Array[String]): Unit = {
    val Lifes: List[Int] = List(1, 2, 3, 4, 5, 6, 7);

    def getSTK(pyaar: List[Int]): Unit = {
      val hero = "fury"
      val heroine = "stk"
      val (villain, comedian) = ("mnk", "Tej")
      println(s"You stupid $villain and idiot $comedian dont disturb $hero$heroine")
      println("")
      def Janam(i: Int): String = i match {
        case 1 => return s"Life $i : Senorita & Raj Love story"
        case 2 => return s"Life $i : Anjali & Rahul Pyaar Kahani"
        case 3 => return s"Life $i : Taani & Raj Kapoor rab ne banadiya Jodi"
        case 4 => return s"Life $i : Zara & Veer ishq"
        case 5 => return s"Life $i : Megha & Raj Malhotra mohobattein"
        case 6 => return s"Life $i : Meghana & Amarverma ka Dil se pyaar"
        case 7 => return s"Life $i : STK & Fury Friendship"
        case _ => return "Asshole only 7 lifes"
      }
      for (i <- Lifes) {
        val Kahani=Janam(i)
        println(Kahani)
        }
    }
    getSTK(Lifes)
    println("")
    val current_life = Lifes.last
    val people : Map[String, String]=Map("Killer"-> "MNK", "Rowdy"->"Tej", "Hero"->"Fury", "Heroine"->"STK")
    for(i <- people.keys){
      val flw=people(i)
      println(s"This life $i is $flw")
    }




    /*
    val m = Lifes.map(x => List.range(1, x + 1))
    println(m)
    val y = 10
    val n: List[Int] = List.range(1, y + 1)
    println(n)
    val str = "furyganesh"
    val o = str.toList
    println(o)*/
  }
}