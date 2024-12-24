object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + "" + b
  }

  println(aFunction("hey", 5))

  def aParameterlessFunction(): Int = 43

  println(aParameterlessFunction())

  def aRepeatedFunction(a:String, b: Int): String =
    if (b==1) a else a + aRepeatedFunction(a, b-1)
// Instead of loops, learn how to use recursion. It is beautiful
// recursion is nice, for loops are bad
// the worst thing a scala programmer can do is to use imperative language
// For recursive functions it is needed the return type, otherwise
// the compiler cannot distinguish what the function will return
  println(aRepeatedFunction("hello",3))


  def aFunctionWithSideEffects(aString: String): Unit = {
  println(aString)
  }
  def aBigFunction(n:Int): Int = {
    def aSmallerFunction(a:Int,b:Int):Int = {
    a*b
    }
    aSmallerFunction(n,n-1)
  }

/* Exercises
* 1. Write a greeting function for kids, take a name and age, return a phrase.
* 2. Write a factorial function. 1*2*3*4*5*6*7... recursive function.
* 3. Fibonacci number. f(n) = f(n-1) + f(n-2).
* 4. Test if a number is prime.
* */
  def Greeting(name:String, age: Int): Unit = {
    println(s"hello my name is $name and I am $age years old.")
  }
  Greeting("Mateus",
  28)
  def Factorial(n: Int): Int = {
    if (n==1) 1 else n * Factorial(n - 1)
  }
  println(Factorial(3))
  def Fibonacci(n: Int):Int = {
    if (n==0 | n==1) 1 else Fibonacci(n-1) + Fibonacci(n-2)
  }
  println(Fibonacci(45))
  def isPrime(n:Int): Boolean = {
    def isPrimeUntil(t:Int): Boolean = {
      if (t <=1) true
      else n % t != 0  && isPrimeUntil(t-1)
    }
    isPrimeUntil(n/2)}
  println(isPrime(68))
  // The study of mathematical functions and algorithms in programming is
  // very good for the mind and exercise our intelligence.
  // Programmers are getting lazier and lazier with chatgpt.
}