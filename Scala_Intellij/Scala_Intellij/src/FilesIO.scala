import java.io.{BufferedReader, BufferedWriter, FileNotFoundException, FileReader, FileWriter, PrintWriter}
import scala.io.Source

object FilesIO{
  def main(args: Array[String]): Unit = {
    try {
      /* val br = new BufferedReader(new FileReader("src/input1.txt")) // just opens file
      var line=br.readLine()
        while(line!=null){
          println(line)
          line=br.readLine()
        }
      br.close() */
      //val br= Source.fromFile("src/input1.txt").getLines() // reads entire data
      //br.foreach(println)

      /*val bw= new BufferedWriter(new FileWriter("src/furygani.txt"))
      bw.write("hi fury")
      bw.close()
      val pw=new PrintWriter("src/gani.txt")
      pw.write("hello god")
      pw.close() */
    }
    catch{
      case ex : ArithmeticException => println("arthimetic error")
      case ex : FileNotFoundException => println("bosdike give correct path/file")
    }
  }
}