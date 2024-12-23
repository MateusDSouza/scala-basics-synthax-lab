object ValuesVariablesTypes extends App {


val x: Int = 42 // 4 bytes
println(x)
// This is not going to work, because vals are immutable
//x = 23
// Type of vals are optional. To compile can infer types

val theString: String = "Strings are cool and semicolons are bad style."

val theBoolean: Boolean = true // or false
val theChar: Char = 's' // single letter between single quotes
val theShort: Short = 323 //2 bytes
val theLong: Long = 19030120 // 8 bytes
val theFloat: Float = 2.0f
val theDouble: Double = 3.12

//Variables

var theVariable = 4
theVariable = 5
// In scala is better to use vals to avoid side effects
}
