/**
 * This file demonstrates various types of expressions in Scala, including arithmetic, logical, relational, block, and conditional expressions.
 * Each function below shows a different kind of expression and prints the results to the console.
 */
package Expressions

/**
 * Demonstrates arithmetic operations: addition, subtraction, multiplication, division, and modulus.
 */
def arithmeticExpressions() =
    val x = 10
    val y = 5
    println(s"$x + $y: ${x + y}")
    println(s"$x - $y: ${x - y}")
    println(s"$x * $y: ${x * y}")
    println(s"$x / $y: ${x / y}")
    println(s"$x % $y: ${x % y}")

/**
 * Demonstrates logical operations: AND, OR, and NOT.
 */
def logicalExpressions() =
    val a = true
    val b = false
    println(s"$a && $b: ${a && b}")
    println(s"$a || $b: ${a || b}")
    println(s"!$a: ${!a}")

/**
 * Demonstrates relational operations: <, >, <=, >=, ==, !=
 */
def relationalExpressions() =
    val x = 10
    val y = 20
    println(s"$x < $y: ${x < y}")
    println(s"$x > $y: ${x > y}")
    println(s"$x <= $y: ${x <= y}")
    println(s"$x >= $y: ${x >= y}")
    println(s"$x == $y: ${x == y}")
    println(s"$x != $y: ${x != y}")

/**
 * Demonstrates block expressions, where the last value is the result of the block.
 */
def blockExpressions() =
    val result =
        val x = 10
        val y = 20
        x + y
    println(s"Block expression result: $result")

/**
 * Demonstrates conditional expressions using if-else.
 */
def conditionalExpressions() =
    val x = 10
    val y = 20
    val max = if (x > y) x else y
    println(s"Max of $x and $y is: $max")
    val isEven = if (x % 2 == 0) "even" else "odd"
    println(s"$x is $isEven")
    val totalItems = 12
    val price = if (totalItems > 10)
        val pricePerItem = 100
        val tax = 0.1
        totalItems * pricePerItem * (1 + tax)
    else
        val pricePerItem = 150
        val comission = 0.2
        totalItems * pricePerItem * (1 + comission)
    println(s"Total price for $totalItems items is: $price")

/**
 * Entry point of the program.
 * Calls all demonstration functions above.
 */
@main def main() =
    println("Arithmetic Expressions:")
    arithmeticExpressions()
    println()
    println("Logical Expressions:")
    logicalExpressions()
    println()
    println("Relational Expressions:")
    relationalExpressions()
    println()
    println("Block Expressions:")
    blockExpressions()
    println()
    println("Conditional Expressions:")
    conditionalExpressions()
    println()