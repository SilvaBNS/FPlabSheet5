import .primeSequence

object Q_2 {
  def main(args: Array[String]): Unit = {
    print("Enter the number n : ")
    val number = scala.io.StdIn.readInt()
    print(s"All prime numbers up to ${number} - ")
    primeSeq(number)
  }

  def primeSeq(number: Int): Unit = {
    def isPrime(n: Int, i: Int): Boolean = {
      if (i <= 1) true
      else if (n % i == 0) false
      else isPrime(n, i - 1)
    }

    if (number > 2) {
      primeSeq(number - 1)
    }

    if (isPrime(number, Math.sqrt(number).toInt)) {
      print(number + " ")
    }
  }
}

