

class InterceptExample extends org.scalatest.Suite {
  def testGetOnEmptyList_Concise() {
    val list = new java.util.ArrayList[Integer]
    withClue("Expected exception for getting element from empty list") {
      intercept[IndexOutOfBoundsException] {
        list.get(0)
      }
    }
  }

}

