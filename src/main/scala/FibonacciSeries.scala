import scala.annotation.tailrec

//program that calculates fibonacci series till nth number
class FibonacciSeries {

  //calculateFiboSeries method used to calculate Fibonacci series of given number
  def calculateFiboSeries(number: Int): Int = {
    @tailrec
    def helperOfFiboSeries(num: Int, first: Int, sum: Int): Int = {
      if (num < 1) 0
      else if (num == 1) sum
      else helperOfFiboSeries(num - 1, sum, first + sum)
    }

    helperOfFiboSeries(number, 0, 1)
  }

  //Taking and validating the number
  def inputFromUser(inputNumber: Int): Int = {
    inputNumber match {
      case value if (value < 0) => throw new IllegalArgumentException
      case _ => calculateFiboSeries(inputNumber)
    }
  }
}