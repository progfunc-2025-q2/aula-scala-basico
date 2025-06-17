/**
 * This file demonstrates the difference between explicit and inferred types in Scala.
 *
 * Explicit types are specified by the programmer, while inferred types are determined by the compiler.
 */
package typingvariants

/**
 * Demonstrates variables with explicit type annotations.
 * Each variable is declared with its type.
 * Prints the type and value of each variable.
 */
def explicitTypes() =
    val x: Int = 10
    val y: String = "Hello, World!"
    val z: Boolean = true
    val pi: Double = 3.14
    val list: List[Int] = List(1, 2, 3, 4, 5)
    val map: Map[String, Int] = Map("one" -> 1, "two" -> 2, "three" -> 3)
    List(x, y, z, pi, list, map)
        .foreach(item => println(s"${item.getClass.getSimpleName}: $item"))

/**
 * Demonstrates variables with types inferred by the compiler.
 * Each variable is declared without an explicit type.
 * Prints the type and value of each variable.
 */
def inferedTypes() =
    val x = 10
    val y = "Hello, World!"
    val z = true
    val pi = 3.14
    val list = List(1, 2, 3, 4, 5)
    val map = Map("one" -> 1, "two" -> 2, "three" -> 3)
    List(x, y, z, pi, list, map)
        .foreach(item => println(s"${item.getClass.getSimpleName}: $item"))

/**
 * Entry point of the program.
 * Calls both demonstration functions above.
 */
@main def main() =
    println("Explicit Types:")
    explicitTypes()
    println()
    println("Inferred Types:")
    inferedTypes()
