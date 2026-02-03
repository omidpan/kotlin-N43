package main.functions
/*
Basic idea

In Kotlin, functions are first-class citizens.
You can pass a function as a parameter to another function.
 */
fun greet(name: String) {
    println("Hello, $name")
}
/*
   Look at the function signature of greet.
 */
fun runAction(action: (String) -> Unit) {
    action("Leo")
}

fun main() {
    runAction(::greet)  // pass the function reference
}
