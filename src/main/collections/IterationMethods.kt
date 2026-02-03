package main.collections

fun main(args: Array<String>) {
    // Iteration Methods
    val names = listOf("Morteza", "Maryam", "Mahsa")
    println("\n forEach - Iterates through each element:")
    names.forEach { println(it) }
    println("\n forEachIndexed - Iterates with index:")
    names.forEachIndexed { index, name -> println("Index $index: $name") }

}