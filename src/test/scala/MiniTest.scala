import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class MiniTest extends FlatSpec with ShouldMatchers {

  "the MiniTest constructor" should "throw if it is instantiated with a 0-length string" in {
    intercept[AssertionError] {
      val mini = new Mini("")
    }
  }

  val m = new Mini("Alice")
  "a" should "b" in {

    val stream = new java.io.ByteArrayOutputStream()
    Console.withOut(stream) {
      m.sayMyName()
    }

    (stream.toString) should include ("Alice")
  }

  it should "c" in {
    val stream = new java.io.ByteArrayOutputStream()
    Console.withOut(stream) {
      m.sayMyNameXTimes(3)
    }

    (stream.toString) should include ("My name is Alice\nMy name is Alice\nMy name is Alice")
  }
}

