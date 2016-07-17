import java.io._


class WriteToFileClass{
    def fileWriter(fileName : String)(codeBlock :PrintWriter => Unit) = {
    val writer = new PrintWriter(new File(fileName));
    try{
      codeBlock(writer)
    }finally{
      writer.close()
    }
  }
}

object WriteToFile extends App {
  val fileWrite = new WriteToFileClass();
  fileWrite.fileWriter("D:\\ouput.txt")(writer => writer write "hello")
  
}

