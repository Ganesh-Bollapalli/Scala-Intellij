object Personal{
  def main(args: Array[String]): Unit = {
    implicit val NAME=scala.io.StdIn.readLine()
    // define map for each person with keys(name, age, location, distance, company, height, Fav_Food, Food_Style)
    // and take them in array (Arrays of maps), pass it to below function
    def person_match(implicit name:String):Unit=name match{
      case "ganesh"=> // here name is ganesh ( From array take it as [ name match Array.map.keys ] )
        /* Using array of maps taken as parameter, take ganesh map and take his values and convert values to set
        * similary do for others and do union and insert for sets
        define these functions globally so that can be placed in all of them
        * Find the person with long distance and short distance ( This should be placed outside and called outside )
        * bcz we are doing is common irrespective of person
        * Only include person specific things in pattern matching and common things outside
         */
      case "stk"=>
      case "mnk"=>
      case "tej"=>
      case "shankar"=>
      case _=> println("who the fck r u asshole")
    }
  }
}