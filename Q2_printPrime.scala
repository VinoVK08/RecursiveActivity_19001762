//19001762
import scala.io.StdIn._
object Q2_printPrime extends App{
  def isPrime(n:Int,i:Int):Boolean= {
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
  def primeSeq(n:Int):Unit={
    for(i <- 2  until n){
      if(isPrime(i,2)==true){
        print(i + " ")

      }
    }

}
println("Enter the value for n: ")
var n = scala.io.StdIn.readInt()

println("Prime Number Between 1 to n are: ")
primeSeq(n)
}
