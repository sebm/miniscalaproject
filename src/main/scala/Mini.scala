class Mini(name: String) {
  assert(name.length > 0, "name must be at least one character long")
  private var myName: String = name

  def sayMyName(): Unit =
    println("My name is " + myName)

  def setName(newName: String): Unit =
    myName = newName

  def sayMyNameXTimes(x: Integer) {
    assert(x > 0, "x must be greater than 0")
    (1 to x) foreach (x => sayMyName())
  }
}

object Mini {
  def main(args: Array[String]) {
    val mini = new Mini("Alice")
    mini.sayMyName()

    mini.setName("Bob")
    mini.sayMyName()

    mini.sayMyNameXTimes(5)
  }
}

