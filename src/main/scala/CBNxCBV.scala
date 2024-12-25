object CBNxCBV extends App {

  //Time function in JVM return Long.

  // The system evaluates the nano-time and then use this guy in the entire definition.
def calledByValue(x:Long):Unit ={
  println("by value: " + x) //821012396797700
  println("by value: " + x) //821012396797700
}

  // This expression is evaluated each time. Not evaluated only once.
  def calledByName(x: => Long):Unit ={
    println("by name: " + x) //821012452518000
    println("by name: " + x) //821012453438500
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

//The arrow evaluated the expression each time. This is used for lazy stream.


def infinite(): Int = 1+infinite()
def printFirst(x: Int, y: => Int): Unit = println(x)

// This function works because the call by name is only computed when used. As it is
// not used in the function this means that it is not computed and the function works.
printFirst(34, infinite())

}
