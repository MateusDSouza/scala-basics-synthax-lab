object StringOps extends App {
  val str: String = "Hello. I am learning scala."

  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ","-"))
  println(str.toLowerCase())
  println(str.length)

  val aNumberString: String = "2"
  val aNumber: Int = aNumberString.toInt
  println("a"+: aNumberString :+ "z")
  println(str.reverse)
  println(str.take(2))

  // SCALA SPECIFIC - INTERPOLATORS
  println(s"ashdihsiudhasuid $aNumberString woekdpowkdpowq $str")

val speed = 1.2f
val string2 = {
  f"thats speed $speed%2.2f"
}
println(string2)

println(raw"UWHUWOQKOWQMIWNWHBSJAS A \n")
val rawstr = "aijsaisajai \n"
println(raw"UWHUWOQKOWQMIWNWHBSJAS $rawstr A \n")
}