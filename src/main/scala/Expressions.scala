object Expressions extends App {
  val x = 1 + 3 + 4 + 5 + 6 + 7 + 8 // this is an expression.
  // The compiler evaluate your result and already get the type.
  // + - * / & | ^  << >> >>>
  val logic = 1 == x
  // == != > >= < <=
  println(!logic)
  //IF expression
  val aCondition = true
  var Var = 3
  Var *= 12 // everytime you change a variable you are adding side effects
  println(Var)

  // Very important: INSTRUCTIONS VS EXPRESSIONS

  //INSTRUCTIONS is imperative. Java and Python.
  //EXPRESSIONS (value). functional programming.
  val aConditionValue = if (aCondition) 5 else 3 // IF EXPRESSION
  val code = {
    val y = 3
    val z = y * 9
    if (z < 298347 & y == 3) "HELLO" else "not HELLO"
  } //CODE BLOCKS ARE EXPRESSIONS. The value of the code block is its last expression.
  println(aConditionValue)
  println(if (aCondition) 5 else 3)
  // If a condition is true, the value is 5 otherwise is 3
  //1. What is the difference between the string "Hello world" and the console
  // message println("Hello world")?
  // 2. What is the value of this guy:
  val someValue = {
    2 < 3
  }
  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  } // NEVER DO THIS AGAIN. DONT WRITE IMPERATIVE CODE IN SCALA
  // EVERYTHING IN SCALA IS AN EXPRESSION

  //side effects are expressions returning units!

  // code blocks
  val someOtherValue = if (someValue) 345 else "asiod"
  println(someOtherValue)
  // vals inside the code block are visible only inside the code block
}
