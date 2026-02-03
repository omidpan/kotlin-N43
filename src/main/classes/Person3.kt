package main.classes
class Person3(var name: String, var age: Int = 18) { // Primary constructor with default age
    init {
        println("Person $name has been created!") // Initialization code
    }
}
fun main() {
    val person1 = Person3("Charlie") // Output: Person Charlie has been created!
    val person2 = Person3("Dave", 30) // Output: Person Dave has been created!
    println(person1.name + " "+ person1.age) // Charlie 18
    println(person2.name + " "+ person2.age) // Dave 30
}
