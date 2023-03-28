import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers.{an, be}

class FibonacciSeriesTest extends AnyFlatSpec {
  val objOfFibonacci = new FibonacciSeries()
  it should "check weather 0 == 0" in {
    assert(objOfFibonacci.inputFromUser(0) == 0)
  }
  it should "check weather 1 == 1" in {
    assert(objOfFibonacci.inputFromUser(1) == 1)
  }
  it should "check weather 5 == 5" in {
    assert(objOfFibonacci.inputFromUser(5) == 5)
  }
  it should "check weather 8 == 21" in {
    assert(objOfFibonacci.inputFromUser(8) == 21)
  }
  it should "check weather 20 == 6765" in {
    assert(objOfFibonacci.inputFromUser(20) == 6765)
  }
  it should "throw an Exception " in {
    an[IllegalArgumentException] should be thrownBy {
      objOfFibonacci.inputFromUser(-5)
    }
  }
}
