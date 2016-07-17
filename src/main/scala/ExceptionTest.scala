

class ExceptionTest extends org.scalatest.Suite {
  def testGetOnEmptyList() {
    try {
      val list = new java.util.ArrayList[Integer]
      list.get(0)
      fail("Expected exception for getting element from empty list")
    } catch {
      case ex: IndexOutOfBoundsException => // :) Success
    }
  }
}