package collections

fun main(args: Array<String>) {
    // Creating a mutable set of Strings (Duplicates are automatically removed)
    var mutableSet = mutableSetOf("Ajay", "Vijay", "Prakash", "Vijay")
    println("Using for-each loop:")
    for (element in mutableSet) {
        println(element)
    }
    println("Using forEach method:")
    mutableSet.forEach { element -> println(element) }
// 1. Adding an element
    mutableSet.add("Karan")
    println("After adding 'Karan': $mutableSet")
// 2. Trying to add a duplicate element (Set does not allow duplicates)
    mutableSet.add("Vijay")
    println("After trying to add duplicate 'Vijay': $mutableSet")
// 3. Removing an element
    mutableSet.remove("Prakash")
    println("After removing 'Prakash': $mutableSet")
// 4. Checking if an element exists
    println("Does 'Ajay' exist in the set? ${mutableSet.contains("Ajay")}")
// 5. Checking size of the set
    println("Size of the set: ${mutableSet.size}")
// 6. Adding multiple elements using '+=' (Set remains unique)
    mutableSet += listOf("Morteza", "Emma")
    println("After adding [4, 5] using '+=': $mutableSet")
// 7. Converting set to list and sorting (sets do not support sorting)
    val sortedList = mutableSet.toList().sorted()
    println("Sorted set as list: $sortedList")
// 8. Converting list back to set (removes duplicates automatically)
    val newSet = sortedList.toSet()
    println("Converted list back to set: $newSet")
// 9. Clearing the set
    mutableSet.clear()
    println("After clearing the set: $mutableSet")
// 10. Checking if the set is empty
    println("Is the set empty? ${mutableSet.isEmpty()}")

}