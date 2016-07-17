

object ResultOverRange extends App {
  
  def totalResultOverRange(number :Int,codeBlock :Int => Int ) : Int = {
    var result = 0;
    for(i <- 1 to number){
      result = result + codeBlock(i)
    }
    result
  }
  println(totalResultOverRange(4, i => if(i%2 == 0) 1 else 0))
}