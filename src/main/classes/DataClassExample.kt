package main.classes

data class User(val name: String, val age: Int)
fun main() {
    val user1 = User("Mori", 25)
    val user2 = user1.copy(age = 26) // Create a copy with a modified age
    println(user1) // Output: User(name=Mori, age=25)
    println(user2) // Output: User(name=Mori, age=26)
    println(user1 == user2) // Output: false
}
