//19001762
import scala.io.StdIn._
object Q2_printPrime extends App{
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
  def primeSeq(n:Int):Unit={
    if(n>i){
      if(prime((n-1),2)){
        print(n-1 + " ,")
      }
      primeSeq(n-1)
    }
    }


println("Enter the value for n: ")
var n = scala.io.StdIn.readInt()
var i = 2
println("Prime Number Between 1 to n are: ")
primeSeq(n)
}
