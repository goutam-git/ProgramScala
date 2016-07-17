

object ScalaInt {
  def main(args: Array[String]): Unit = {
    playWithInt()
  }

  def playWithInt() {
    val capacity: Int = 10
    val list = new java.util.ArrayList[String]
    list.ensureCapacity(capacity)
    print(list)
  }
}