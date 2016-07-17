object Basics {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(46); 

  for (i <- 1 until 3) {
    print(i + ",")
  };$skip(48); 
  
  (1 to 3).foreach(i => print(i + "," ));$skip(12); 
  println()}
}
