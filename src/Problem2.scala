object Problem2 {
    def main(args: Array[String]) = {
      println((take(4000000000l,fibonacci(1,2) filter(_%2==0)).sum))
    }
    def take(n: Long, seq:Stream[Long]):Stream[Long] = {
      if(n <= 0) Stream.Empty else Stream.cons(seq.head,take(n-1, seq.tail))
    }
    
    def fibonacci(x1:Long, x2:Long):Stream[Long] = (x1) #:: fibonacci(x2,x1+x2)
}