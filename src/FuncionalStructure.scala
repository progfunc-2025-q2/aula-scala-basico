/**
 * This file demonstrates a simple functional structure in Scala.
 * It shows how to define functions and use them in a main entry point.
 */
package functionalstructure

/**
 * Returns a fixed name as a String.
 */
def sayName = "John Doe"

/**
 * Calculates the age based on the year of birth using the current year.
 * @param yearOfBirth The year of birth
 * @return The calculated age
 */
def getAge(yearOfBirth: Int) = 
    java.time.Year.now.getValue - yearOfBirth

/**
 * Entry point of the program.
 * Prints the name and calculated age.
 */
@main def main() = 
    println("Name: " + sayName)
    println("Age: " + getAge(2000))

