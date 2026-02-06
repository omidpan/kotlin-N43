package main.classes
class Printer {
    fun printMessage(msg: String) = println("Message: $msg")
}

class Person(val name: String)

fun main(args: Array<String>) {
// class reference
    val createPerson = ::Person // Constructor reference
    val person = createPerson("Mori")
    println(person.name) // Mori

    val printer = Printer()
    // Bound reference to an instance method
    val printRef = printer::printMessage
    printRef("Hello, Kotlin!")
    // Message: Hello, Kotlin!

}