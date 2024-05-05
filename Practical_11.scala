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

/* Explanation: 
*The code begins by defining an object named Hello. In Scala, object is used to create a singleton object, which means there will only be one instance of this object created.

* " def main(args: Array[String]) = { "
This is the entry point of the program. The main method is where the execution of the program begins. It takes an array of strings args as input, which represents any command-line arguments passed to the program.

* hello world line etc :
These lines print a welcome message and a menu of options for the user to choose from. It prompts the user to enter a number corresponding to the desired operation.

* " var choice = scala.io.StdIn.readLine().toInt " 
if else statements : 
Here, the program reads the user's input, converts it to an integer, and then checks the value of choice. Depending on the value entered by the user, it calls one of three functions: add(), even_odd(), or calculates the area of a square. If the input doesn't match any of these options, it prints a message asking the user to enter a valid input.

* " def add() " 
This function prompts the user to enter two numbers, reads those numbers, calculates their sum, and then prints the result.

* " def even_odd() " 
This function prompts the user to enter a number, reads the number, checks if it's even or odd, and then prints the result.

* "def area_of_square(side: Float):"
This function takes the length of a side of a square as input, calculates the area of the square, and returns the result.

*/

