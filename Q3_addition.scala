//19001762
import scala.io.StdIn._
object Q3_addition extends App{
  def sum(n:Int):Int= {
    if(n==0){
      return 0
    }else {
      return (n + sum(n-1))
    }
  }

  println("Enter the value for n: ")
  var n = scala.io.StdIn.readInt()

  println("Addition of numbers from 1 to n is: ")
  print(sum(n))
}
