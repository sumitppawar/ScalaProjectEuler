

/**
 * @author sumit
 * Date 29-March-16
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
*/

object P_1 {
  def main(args:Array[String]) = {
    val sum = findSumOfMultipulOf3OrUntilN(1000)
    println(sum)
  }
  
  def findSumOfMultipulOf3OrUntilN(n: Int):Int = {
	  (for(x <- (3 until n) if isMultipleOfN(3,x) || isMultipleOfN(5,x)) yield x) sum
  }
  def isMultipleOfN(N: Int,x:Int): Boolean = {
      if(x%N == 0) true else false
  }
  
}