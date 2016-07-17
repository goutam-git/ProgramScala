

object ScalaTuple {
  def main(args: Array[String]): Unit = {
   // val(firstName, lastName, emailAddress) = getPersonInfo(1)
    val(firstName, lastName, _) = getPersonInfo(1)
    println("First Name is " + firstName)
    println("Last Name is " + lastName)
    //println("Email Address is " + emailAddress)
    

  }

  def getPersonInfo(primaryKey: Int) = {
    // Assume primaryKey is used to fetch a person's info...
    // Here response is hard-coded
    ("Venkat", "Subramaniam", "venkats@agiledeveloper.com")
  }

}