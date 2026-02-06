package main.classes

class Person5(var name: String, var age: Int = 18) { // Primary constructor with default age 18
    // First secondary constructor for logging behavior
    constructor(name: String, age: Int, shouldLog: Boolean) : this(name, age) {
        if (shouldLog) { // Logging initialization
            println("This is a log. Person $name has been created!")
        }
    }
    // Second secondary constructor when only age is provided
    constructor(age: Int) : this("Mori", age) // Default name set to "Mori
}
fun main(args: Array<String>) {
    val person5=Person5("Mori", 18)


    //with delegation
    val person6=Person5("Mori", 18,true)

}