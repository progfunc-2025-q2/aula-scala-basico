/**
 * This file demonstrates the use of lists in Scala, including creation, manipulation, and decomposition.
 * Lists are immutable sequences and are a fundamental data structure in functional programming.
 */
package lists

/**
 * Demonstrates different ways to create lists.
 */
def createLists() =
    val emptyList = Nil
    val numbers = List(1, 2, 3, 4, 5)
    val names = List("Alice", "Bob", "Charlie")
    val mixed = List(1, "two", 3.0)

    // Imprime as listas criadas
    println(s"Empty list: $emptyList")
    println(s"Numbers list: $numbers")
    println(s"Names list: $names")
    println(s"Mixed list: $mixed")

/**
 * Demonstrates how to create empty lists and print them.
 */
def emptyList() =
    val emptyList1 = List() // Another way to create an empty list
    val emptyList2 = Nil // Using Nil for empty list

    println(s"Empty list 1: $emptyList1")
    println(s"Empty list 2: $emptyList2")

/**
 * Demonstrates the use of the cons operator (::) to prepend elements to a list.
 */
def consOperator() =
    val numbers = List(2, 3, 4)
    println(s"Original numbers list: $numbers") // Prints: List(2, 3, 4)
    val newList = 1 :: numbers // Prepends 1 to the list
    println(s"After prepending 1: $newList") // Prints: List(1, 2, 3, 4)
    val anotherList = 0 :: 1 :: numbers // Prepends 0 and 1 to the list
    println(s"After prepending 0 and 1: $anotherList") // Prints: List(0, 1, 2, 3, 4)

/**
 * Recursively builds a list from n down to 1.
 * @param n The starting integer
 * @return A list of integers from n down to 1
 */
def buildList(n: Int): List[Int] = 
    if n <= 0 then
        Nil // Returns an empty list if n is less than or equal to 0
    else
        n :: buildList(n - 1) // Prepends n to the list recursively

/**
 * Demonstrates how to access the head and tail of a list.
 */
def decomposeList(): Unit =
    val aList = List(1, 2, 3, 4, 5)
    println(s"Full list: $aList")
    println(s"Head: ${aList.head}, Tail: ${aList.tail}") // Head is the first element, tail is the rest

/**
 * Entry point of the program.
 * Calls all demonstration functions above.
 */
@main def main() =
    println("Creating Lists:")
    createLists()

    println("\nEmpty Lists:")
    emptyList()
    
    println("\nUsing Cons Operator:")
    consOperator()

    println("\nBuilding List Recursively:")
    val n = 10
    val builtList = buildList(n)
    println(s"List built from $n: $builtList")

    println("\nDecomposing List:")
    decomposeList()