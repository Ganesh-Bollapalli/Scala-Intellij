
object Exception_Handling{
  def main(args: Array[String]): Unit = {
    val x=10
    val y=0

    try{
      x/y
    }
    catch
      {
        case ex : ArithmeticException => println("pls handle arthimetic error")
        case ex : IllegalArgumentException => println("illegeal argument")
        case ex : NoSuchFieldError => println("no such file")
      }
    finally{
      println("it runs definetly whether we got error or not")
    }

    /* if(y==0) throw new ArithmeticException("y cannot be zero")
    else x/y */
  }
}