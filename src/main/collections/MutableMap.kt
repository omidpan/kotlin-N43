package main.collections

fun main(args: Array<String>) {

    // Creating a mutable map with key-value pairs (Names and Ages)
    val mutableMap = mutableMapOf(
        "Morteza" to 32,
        "Maryam" to 28,
        "Mahsa" to 25
    )
// Printing all key-value pairs (Entry Set)
    println("Entries: " + mutableMap.entries)
// Printing all keys in the map
    println("Keys: " + mutableMap.keys)
// Printing all values in the map
    println("Values: " + mutableMap.values)
// Iterating through the mutable map using a Using for loop (Entry Set):
    println("Using for loop (Entry Set):")
    for (entry in mutableMap) {
        println("${entry.key}: ${entry.value}") // Prints each key-value pair
    }
// Iterating through the mutable map using a for-each loop (Entry Set)
    println("Using forEach  (Entry Set):")
    mutableMap.forEach { (key, value) -> println("${key}: ${value}") }

// Iterating through keys and values separately
    println("Using key-based iteration:")
    for (key in mutableMap.keys) {
        println("$key: ${mutableMap[key]}") // Accessing values using keys
    }
    println("Using value-based iteration:")
    for (value in mutableMap.values) {
        println(value) // Prints each value
    }
// 1. Accessing a value by key
    println("Age of Maryam: ${mutableMap["Maryam"]}")
// 2. Checking if a key exists
    println("Does Mahsa exist? ${mutableMap.containsKey("Mahsa")}")
// 3. Checking if a value exists
    println("Is there someone aged 30? ${mutableMap.containsValue(30)}")
// 4. Adding a new key-value pair
    mutableMap["Mehdi"] = 27
    println("After adding 'Mehdi': $mutableMap")
// 5. Updating an existing value
    mutableMap["Morteza"] = 33
    println("After updating 'Morteza's age: $mutableMap")
// 6. Removing an entry by key
    mutableMap.remove("Mahsa")
    println("After removing 'Mahsa': $mutableMap")
// 7. Filtering the map (only keep ages greater than 30)
    val filteredMap = mutableMap.filter { (_, value) -> value > 30 }
    println("\nFiltered map (Ages > 30): $filteredMap")
// 8. Sorting the map by keys
    val sortedByKey = mutableMap.toSortedMap()
    println("Sorted by keys: $sortedByKey")
// 9. Checking if map is empty
    println("Is the map empty? ${mutableMap.isEmpty()}")
// 10. Clearing the map
    mutableMap.clear()
    println("\nAfter clearing the map: $mutableMap")

}
