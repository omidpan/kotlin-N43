package main.decisionloop

fun main(args: Array<String>) {
    println("++++++++ for with arrayOf function +++++++++++++++")
    val numbers = arrayOf(1, 2, 3, 4, 5)
    for (num in numbers) {
        println(num)
    }
    println("++++++++ for with listOf function +++++++++++++++")
    val names = listOf("Alice", "Bob", "Charlie")
    for (name in names) {
        println(name)
    }

    println("++++++++ for loop with in operator +++++++++++++++")
    for (i in 1..3) { // Iterates from 1 to 3 (inclusive)
        println(i)
    }
    println("++++++++ for loop with in operator with step  +++++++++++++++")
    for (i in 6 downTo 0 step 2) { // Iterates from 6 to 0, decreasing by 2
        println(i)
    }
    println("++++++++ for loop with in operator and until +++++++++++++++")
    for (i in 0 until 6) { // Iterates from 0 to 5 (exclusive)
        println(i)
    }

    println(" +++ for loop with range and (index , value) +++++++++++++++")
    val array = arrayOf("Apple", "Banana", "Cherry")
    for (i in array.indices) {
        println(array[i]) // Access element by index
    }
    for ((index, value) in array.withIndex()) {
        println("The element at $index is $value")
    }

}