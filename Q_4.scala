object Q_4 {
  def main (args : Array[String]) : Unit={
    print("Enter the number : ")
    val number = scala.io.StdIn.readInt()
    println(s"${number} is "+evenOrOdd(number))
  }

  def evenOrOdd(i: Int): String = {
    if (i == 0)
      {return "even"}
    else if (i==1)
      {return "odd"}
    else if (i<0)
      {
        evenOrOdd(i*(-1))
      }
    else
      {
        evenOrOdd(i-2)
      }

  }

}
