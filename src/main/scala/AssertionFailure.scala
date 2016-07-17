

class AssertionFailure extends org.scalatest.Suite {
  def testAssertFailure() {
    assert(2 == List().size)
  }
}