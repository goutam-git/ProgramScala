import scala.actors.Actor._

object MessagePassing extends App {
  var startTime: Long = 0
  val caller = self
  val engrossedActor = actor {
    println("Number of messages received so far? " + mailboxSize)
    caller ! "send"
    Thread.sleep(9000)
    println("Number of messages received while I was busy? " + mailboxSize)
    receive {
      case msg =>
        val receivedTime = System.currentTimeMillis() - startTime
        println("Received message " + msg + " after " + receivedTime + " ms")
    }
    caller ! "received"
  }
  println("Sending Message ")
  startTime = System.currentTimeMillis()
  engrossedActor ! "hello buddy"
  val endTime = System.currentTimeMillis() - startTime
  printf("Took less than %dms to send message\n", endTime)
  receive { case message => 
     
  }

  
}