
object Calculator {

  def addition(num1: Double, num2: Double): Double = {
    num1 + num2
  }

  def subtraction(num1: Double, num2: Double): Double = {
    if (num1 > num2) {
      num1 - num2
    }
    else
      num2 - num1
  }

  def multiplication(num1: Double, num2: Double): Double = {
    num1 * num2
  }

  def division(num1: Double, num2: Double): Double = {
    num1 / num2
  }

  def power(num1: Double, num2: Double): Double = {
    scala.math.pow(num1, num2)
  }

  def absolute(num1: Double, num2: Double) {
    println("Absolute value of first value is: ")
    println(num1.abs)
    println("Absolute value of second number is: ")
    println(num2.abs)
  }

  def modulus(num1: Double, num2: Double): Double = {
    num1 % num2
  }

  def maxOfTwo(num1: Double, num2: Double): Double = {
    if (num1 > num2)
      num1
    else
      num2
  }

  def minOfTwo(num1: Double, num2: Double): Double = {
    if (num1 > num2)
      num2
    else
      num1
  }

  def main(args: Array[String]): Unit = {
    println( "For Addition type : 1 ")
    println("For Subtraction type : 2 ")
    println("For Multiplication type : 3 ")
    println("For Division type : 4 ")
    println("For Power type : 5 ")
    println("For Absolute value type : 6 ")
    println("For  Modulus type : 7 ")
    println("For Maximum of Two type : 8 ")
    println("For Minimum of Two type : 9 ")

    val choice = scala.io.StdIn.readInt()


    if (choice  == 1){
      val firstNum = scala.io.StdIn.readDouble()
      val secondNum = scala.io.StdIn.readDouble()

      println("Addition of the two numbers are : ")
      println(addition(firstNum,secondNum))
    }
    else if(choice == 2){
      val firstNum = scala.io.StdIn.readDouble()
      val secondNum = scala.io.StdIn.readDouble()

      println("Subtraction of two numbers is: ")
      println(subtraction(firstNum,secondNum))
    }
    else if(choice == 3){
      val firstNum = scala.io.StdIn.readDouble()
      val secondNum = scala.io.StdIn.readDouble()

      println("Multiplication of the two numbers : ")
      println(multiplication(firstNum,secondNum))
    }
    else if(choice == 4){
      val firstNum = scala.io.StdIn.readDouble()
      val secondNum = scala.io.StdIn.readDouble()

      println("Division of the two numbers : ")
      println(division(firstNum,secondNum))
    }
    else if(choice == 5){
      val firstNum = scala.io.StdIn.readDouble()
      val secondNum = scala.io.StdIn.readDouble()
      println("Power of the numbers : ")
      println(power(firstNum,secondNum))
    }
    else if(choice == 6){
      val firstNum = scala.io.StdIn.readDouble()
      val secondNum = scala.io.StdIn.readDouble()
      absolute(firstNum,secondNum)
    }
    else if(choice == 7){
      val firstNum = scala.io.StdIn.readDouble()
      val secondNum = scala.io.StdIn.readDouble()

      println("Modulus of the numbers : ")
      println(modulus(firstNum,secondNum))
    }
    else if(choice == 8){
      val firstNum = scala.io.StdIn.readDouble()
      val secondNum = scala.io.StdIn.readDouble()

      println("Maximum of two numbers: ")
      println(maxOfTwo(firstNum,secondNum))
    }
    else if(choice == 9){
      val firstNum = scala.io.StdIn.readDouble()
      val secondNum = scala.io.StdIn.readDouble()

      println("Minimum of two numbers: ")
      println(minOfTwo(firstNum,secondNum))
    }

  }
}