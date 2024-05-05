object Hello {
  def main(args: Array[String]) = {
    println("Hello, world")
    println("What do you want to do...")
    println("Enter 1 for addition\nEnter 2 for even_odd\nEnter 3 for area of square")

    var choice = scala.io.StdIn.readLine().toInt

    if (choice == 1) {
      add()
    } else if (choice == 2) {
      even_odd()
    } else if (choice == 3) {
      println("Enter side of square: ")
      var side = scala.io.StdIn.readLine().toInt
      var area = area_of_square(side)
      println("Area of Square of side " + side + " is " + area)
    } else {
      println("Please Enter a Valid input.")
    }
  }

  def add() = {
    println("Enter Number 1: ")
    var a = scala.io.StdIn.readLine().toInt
    println("Enter Number 2: ")
    var b = scala.io.StdIn.readLine().toInt
    println("Addition is: " + (a + b))
  }

  def even_odd() = {
    println("Enter Number to check even or odd: ")
    var a = scala.io.StdIn.readLine().toInt
    if (a % 2 == 0) {
      println(a + " is Even Number")
    } else {
      println(a + " is Odd Number")
    }
  }

  def area_of_square(side: Float): Float = {
    return (side * side)
  }
}
