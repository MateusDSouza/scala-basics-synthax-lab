import scala.annotation.tailrec

object DefaultArgs extends App {
   @tailrec
    def factorial(x: Int, accumulator: BigInt = 1): BigInt = {
      if (x < 1) {
        accumulator
      } else factorial(x - 1, x * accumulator)
    }

    println(factorial(10))

    def savePicture(format:String = "jpeg", width: Int = 123, height: Int = 321): Unit = {println("save picture")}
}