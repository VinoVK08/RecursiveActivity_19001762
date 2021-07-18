//19001762
import scala.io.StdIn._
object Q6_fibonacci extends App{
  def fibonacci(n:Int):Unit={

    if(n>0){
      k = i + j;
      i=j
      j=k
      print(", "+ k )
      fibonacci(n-1)
    }
  }
  var i= 0
  var j = 1
  var k= 0


  println("Enter the value for n: ")
  var n = scala.io.StdIn.readInt()
  print("Fibonacci series of " + n + " : 0, 1 " )
  fibonacci(n-2)
}
