class AnotherMarker private (val color: String, val shape: String) {
  println("Creating " + this)
  override def toString(): String = "marker color " + color + "  shape " + shape
}

object AnotherMarker extends App {
  private val markers = Map(
    "red" -> new AnotherMarker("red", "square"),
    "blue" -> new AnotherMarker("blue", "triangle"),
    "green" -> new AnotherMarker("green", "oval"))

  def getMarker(color: String, shape: String) =
    if (markers.contains(color)) markers(color) else null
    
    println(AnotherMarker getMarker("blue","square" ))
} 
  