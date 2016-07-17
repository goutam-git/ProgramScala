import java.util.ArrayList
import org.junit.Test
import org.junit.Assert._

class ScalaJunit extends App{
  @Test def listAdd() {
    val list = new ArrayList[String]
    list.add("Milk")
    list add "Sugar"
    assertEquals(2, list.size())
  }
}