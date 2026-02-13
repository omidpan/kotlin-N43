package main.classes
data class User(val name: String, val age: Int)

fun main() {
    //equal
    val user = User("Mori", 25)
    val userCopy = user.copy(age = 25) // Create a copy with a modified age
    println(user) // Output: User(name=Mori, age=25)
    println(userCopy) // Output: User(name=Mori, age=26)
    println(user == userCopy) // Output: false



    val user1 = User("Mori", 25)
    val user2 = user1.copy(age = 26) // Using the default copy() method
    val user3 = User("Mori", 25)
    // Using the default toString()
    println(user1.toString()) // Output: User(name=Mori, age=25)
    println(user2.toString()) // Output: User(name=Mori, age=26)
    // Using the default copy()
    val user4 = user1.copy(name = "Alex", age = 30)
    println(user4.toString()) // Output: User(name=Alex, age=30)
    // Using the default equals()
    println(user1.equals(user3)) // Output: true (compares property values)
    println(user1.equals(user2)) // Output: false (different age)
    // Using the default hashCode()
    println(user1.hashCode()) // Consistent hash code for equal objects
    println(user3.hashCode()) // Same as user1 because properties are equal
    println(user2.hashCode()) // Different hash code because of different age
}
