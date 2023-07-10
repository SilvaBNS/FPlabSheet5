object Q_6 {
  def main(args: Array[String]): Unit = {
    print("Enter the number : ")
    val number = scala.io.StdIn.readInt()
    FibonacciSeq(number)
  }

  def FibonacciSeq(number: Int): Unit = {
    for (i <- 0 until number) {
      print(fibonacci(i) + " ")
    }
  }

  def fibonacci(number: Int): Int = {
    if (number <= 1) number
    else fibonacci(number - 1) + fibonacci(number - 2)
  }
}
