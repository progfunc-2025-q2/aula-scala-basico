/**
 * This file demonstrates the use of immutable and mutable variables in Scala.
 *
 * Immutable variables are declared with 'val' and cannot be reassigned.
 * Mutable variables are declared with 'var' and can be reassigned.
 */
package variables

/**
 * Demonstrates immutable variables using 'val'.
 * 'x' is immutable; its value cannot be changed after assignment.
 */
def immutableVariables() =
    val x = 10
    // x = 20 // Compilation error: reassignment to val
    println(x)

/**
 * Demonstrates mutable variables using 'var'.
 * 'x' and 'y' are mutable and their values can be changed.
 */
def mutableVariables() =
    var x = 10
    x = 20
    println(x)
    
    var y = "Hello"
    y = "World"
    println(y)

/**
 * Entry point of the program.
 * Calls the functions to demonstrate immutable and mutable variables.
 */
@main def main() =
    println("Immutable Variables:")
    immutableVariables()
    println("Mutable Variables:")
    mutableVariables()