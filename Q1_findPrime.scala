//19001762
import scala.io.StdIn._
object Q1_findPrime extends App{
  def prime(n:Int,i:Int):Boolean= {
    if(n<=2){
      if(n==2){
        return true
      }else{
        return false
      }
    }
    if(n%i==0){
      return false
    }
    if(i*i>n){
      return true
    }

    return prime(n,i+1)
  }




      println( "Enter the number:" )
      var x = scala.io.StdIn.readInt()
      var i = 2
      if(prime(x,i)==false){
        println(x + " is not a prime number")
      }else{
        println(x + " is a prime number")
      }

}
