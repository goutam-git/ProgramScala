object Basics {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  for (i <- 1 until 3) {
    print(i + ",")                                //> 1,2,
  }
  
  (1 to 3).foreach(i => print(i + "," ))          //> 1,2,3,
  println()                                       //> 
}