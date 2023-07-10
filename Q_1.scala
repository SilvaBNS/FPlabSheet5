object Q_1 {
  def main(args:Array[String]): Unit ={
    print("Enter a number : ")
    val number = scala.io.StdIn.readInt()

    println(prime(number))
  }

  def prime(number: Int): Boolean = {
    if ((number <= 1)) {
      false
    }
    else if (number == 2) {
        true
    }
    else{
      findPrimes(number, 2)
    }
  }

  def findPrimes(number: Int, divisor: Int): Boolean = {
    if (divisor <= Math.sqrt(number)) {
      if (number % divisor == 0) {
        false
      }
      else {
        findPrimes(number, divisor + 1)
      }
    }
    else {
      true
    }
  }

}
