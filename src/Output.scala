/**
 * This file demonstrates basic input/output operations in Scala, including println, string interpolation, and formatted output.
 * These are essential for displaying information to the user.
 */
package outputexamples

/**
 * Prints simple messages to the console using println.
 * @param message The message to print (not used in this example)
 */
def simplePrintln(message: String) =
    println("Hello, World!") // Prints a static message
    println("This is a simple Scala program.") // Prints another static message

/**
 * Demonstrates string interpolation with variables and expressions.
 */
def stringInterpolation() =
    val name = "Scala"
    println(s"Hello, $name!") // Interpolates the variable 'name' into the string
    println(s"Random number: ${scala.util.Random.nextInt(100)}") // Embeds an expression

/**
 * Demonstrates formatted string interpolation using 'f' interpolator.
 */
def formattedInterpolation() =
    println(f"Sine: ${math.sin(math.Pi / 2)}%.2f") // Formats the result to 2 decimal places
    println(f"Value of pi: ${math.Pi}%.4f") // Formats pi to 4 decimal places

/**
 * Entry point of the program.
 * Calls all demonstration functions above.
 */
@main def main() =
    println("Simple Println:")
    simplePrintln("Hello, World!")
    println("String Interpolation:")
    stringInterpolation()
    println("Formatted Interpolation:")
    formattedInterpolation()
