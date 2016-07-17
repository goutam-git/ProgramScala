import scala.actors._
import Actor._

object AskFortune extends App {
  val fortuneTeller = actor {
    for (i <- 1 to 4) {
      Thread.sleep(1000)
      receive {
        case msg => 
          println("Fortune teller received message" + msg)
          sender ! "your day will rock! " + i
        //case _ => reply("your day will rock! " + i) // same as above
      }
    }
  }
  println(fortuneTeller !? (2000, "1-what's ahead"))
  println(fortuneTeller !? (500, "2-what's ahead"))
  val aPrinter = actor {
    receive { case msg => println("Ah, fortune message for you-" + msg) }
  }
  fortuneTeller.send("3-What's up", aPrinter)
  fortuneTeller ! "4-How's my future?"
  receive { case msg: String => println("Received " + msg) }
  println("Let's get that lost message")
  receive { case !(channel, msg) => println("Received belated message " + msg) }
  Thread.sleep(3000)
}