object Q_3 {
  def main(args : Array[String]) : Unit ={
    print("Enter the number : ")
    var number = scala.io.StdIn.readInt()

    println(s"Sum of the numbers upto ${number} is "+sum(number))
  }

  def sum(i: Int): Int = {
    if (i==1)
      {return i }
    else {
      return i+sum(i-1)
    }
  }

}
