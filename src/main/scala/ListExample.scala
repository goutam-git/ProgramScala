

object ListExample extends App {
  val feeds = List("blog.toolshed.com", "pragdave.pragprog.com",
    "dimsumthinking.com/blog")

  println("First feed: " + feeds.head)
  println("Second feed: " + feeds(1))

  val prefixedList = "forums.pragprog.com/forums/87" :: feeds
  println("First Feed In Prefixed: " + prefixedList.head)
  println("Prefixed List: " + prefixedList)

  println("Filter Feeds with blog: " + feeds.filter(_ contains "blog").mkString(", "))
  println("Forall Feeds with blog: " + feeds.forall(_ contains "blog"))
  println("Exists Feeds with blog: " + feeds.exists( _ contains "blog" ))
  
  val total = feeds.foldLeft(0){(total,feed)=> total + feed.length()}
  println("Total lengh of feeds url :" + total)
}