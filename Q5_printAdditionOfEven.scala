//19001762
import scala.io.StdIn._
import scala.language.postfixOps
object Q5_printAdditionOfEven extends App{
def sumOfEven(n:Int,i:Int):Int={
     if(i>=n){
       return 0;
     }else{
       return i+sumOfEven(n,i+2);
     }
      }



    var i = 2
    println("Enter the value for n: ")
    var n = scala.io.StdIn.readInt()
    println("Addition of even numbers less than " + n + " is " + sumOfEven(n,i))


}
