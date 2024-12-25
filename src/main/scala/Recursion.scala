import scala.annotation.tailrec

object Recursion extends App {
  // This section is very important.
  // Sometimes people get used to the way they thing because they like the easy path.
  // In SCALA, FP, and this course in general, is not teaching me a language.
  // It is teaching me a new way to think and to solve real life problems.
  // The investment of the time to go thru all the exercises and theoretical
  // parts are way more important than just come API's and applications.
  // This is the true building blocks for real knowledge.

  def Factorial(n: Int): Int = {
    if (n <= 1) 1
    else {
      println("Computing factorial of %d - I fist need the factorial of %d".format(n,n-1))
      val result = n * Factorial(n - 1)
      println(s"Computed factorial of $n")

      result
    }
  }
  println(Factorial(10))

  //The recursive stack can create a stackoverflow for high number of recursion calls
  println(Factorial(5))

  // To solve this problem we can do recursion in a smarter way - use accumulators
  def anotherFactorial(n:Int): BigInt = {
    @tailrec // this guy tells the compiler should be tail recursive.
      // this helps the compiler to tell us how to implement
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x<1) {
        accumulator
      } else factHelper(x-1,x*accumulator) //tail recursion = use recursive call as the last expression
    } // WHEN YOU NEED LOOPS, YOU NEED TO USE TAIL RECURSION.
    factHelper(n,
      1)
  }
  /*
  Exercises
  1. Concatenate a string n times.
  2. IsPrime function tail recursive.
  3. Fibonacci function but tail recursive.
  The trick is to use the accumulators. Sometimes you will need more than one accumulator.
  * */
// OLD function without tail recursion
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(n / 2)
  }

  @tailrec
  def anotherStringConcat(n: Int, accumulator: String): String = {
    if (n<=1) accumulator else anotherStringConcat(n-1,accumulator+accumulator)
  }
  @tailrec
  def anotherFibonacci(n: Int, accumulator: BigInt = 1): BigInt = {
    if (n == 0 | n == 1) accumulator else anotherFibonacci(1,(n-1)+(n-2))
  }

  def anotherIsPrime(n: Int): Boolean = {
    //@tailrec
    //def helperN(t:Int, accumulator1: Int): Int = {
    //  if (t <=1) accumulator1 else helperN(t-(accumulator1),accumulator1+1)
    //}
    @tailrec
    def anotherIsPrimeHelper(t: Int, accumulator2: Boolean): Boolean = {
      if (accumulator2) accumulator2
      else anotherIsPrimeHelper(t - 1, (n % t == 0 | accumulator2))
    }
    anotherIsPrimeHelper(n-1,false)}


  println(anotherStringConcat(10, "SCALA IS NICE "))
  println(anotherFibonacci(2345678))
  println(anotherIsPrime(6))

}
