package main.classes

class Person4 {
    var name: String
    var age: Int
    // Secondary constructor with default age and initialization code
    constructor(name: String, age: Int = 18) {
        this.name = name
        this.age = age
        println("Person $name has been created!") // Initialization code
    }
}
fun main() {
    // Output: Person Charlie has been!
    val person1 = Person4("Charlie")
    // Output: Person Dave has been created!
    val person2 = Person4("Dave", 30)
    println("${person1.name} ${person1.age}") // Charlie 18
    println("${person2.name} ${person2.age}") // Dave 30
}
