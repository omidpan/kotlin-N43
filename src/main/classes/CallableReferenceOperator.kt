package main.classes
fun greet(name: String) {
    println("Hello, $name!")
}
val message = "Kotlin"
fun main (args:Array<String>){
    val ref = ::message // Property reference
    println(ref.get()) // Accesses the value of 'message' ("Kotlin")
    val greeter = ::greet // Function reference
    greeter("Mori") // Calls greet("Mori")

}