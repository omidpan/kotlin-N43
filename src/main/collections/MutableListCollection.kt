package main.collections

fun main(args: Array<String>) {
    val numbers: MutableList<Int> = mutableListOf(1, 2, 3) // `val` is used
     numbers.add(4) //  Works fine, the content change
     numbers.remove(1) //  Works fine, the content change
//    numbers = mutableListOf(5, 6, 7)//  ERROR: Val cannot be reassigned
    val intNumber: MutableList<Int> = mutableListOf(1, 2, 3);
//    val anyList: MutableList<Any> = intNumber //  ERROR: Type mismatch


    println("+++++++++ for each(iterate)+++++++++++/n")
    // Create a mutable list of Strings
    var mutableList = mutableListOf("Ajay", "Vijay", "Prakash", "Vijay")
    println("Iterating using for-each loop:")
    for (element in mutableList) {
        println(element)
    }
    println("Iterating using index-based loop:")
    for (index in 0 until mutableList.size) {
        println(mutableList[index])
    }

    println("++++++++++++ adding item to collection:+++++++++++++\n")
    // 1. Adding an element
    mutableList.add("Karan")
    println("After adding 'Karan': $mutableList")
// 2. Adding an element at a specific index
    mutableList.add(2, "Rahul")
    println("After adding 'Rahul' at index 2: $mutableList")
// 3. Removing an element by value
    mutableList.remove("Vijay")
    println("After removing first occurrence of 'Vijay': $mutableList")
// 4. Removing an element by index
    mutableList.removeAt(1)
    println("After removing element at index 1: $mutableList")
// 5. Checking if an element exists
    println("Does 'Ajay' exist in the list? ${mutableList.contains("Ajay")}")
    // 6. Finding index of an element
    println("Index of 'Prakash': ${mutableList.indexOf("Prakash")}")
// 7. Replacing an element at a specific index
    mutableList[0] = "Ravi"
    println("After replacing index 0 with 'Ravi': $mutableList")
// 8. Sorting the list
    mutableList.sort()
    println("After sorting: $mutableList")
// 9. Reversing the list
    mutableList.reverse()
    println("After reversing: $mutableList")
// 10. Clearing the list
    mutableList.clear()
    println("After clearing the list: $mutableList")

}