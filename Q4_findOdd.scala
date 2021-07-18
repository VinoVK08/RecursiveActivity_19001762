//19001762
import scala.io.StdIn._
object Q4_findOdd extends App{
def determineOdd(n:Int):Boolean={
   if(n==0){
     return false
   }else if(n==1){
     return true
   }else{
     return determineOdd(n%2)
   }
}

println("Enter the value for n: ")
var n = scala.io.StdIn.readInt()

   if(determineOdd(n)){
       println(n +" is odd number " )
   }else{
       println(n +" is even number " )
}

}
