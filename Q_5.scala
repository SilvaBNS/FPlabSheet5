object Q_5 {
  def main(args: Array[String]): Unit = {
    print("Enter a number : ")
    val number = scala.io.StdIn.readInt()

    print(s"Sum of all even numbers which less than ${number} : " + sumofEven(number))
  }

  def sumofEven(i: Int) : Int ={
      if (i == 0) {
        0
      }
      else if (i % 2 == 0) {
        i + sumofEven(i - 2)
      }
      else {
        sumofEven(i - 1)
      }
  }

}

