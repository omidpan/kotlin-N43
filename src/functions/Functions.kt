package functions
fun greet() {
    println("Hello, Kotlin!")
}
fun greetUser(name: String) {
    println("Hello, $name")
}
fun add(a: Int, b: Int): Int {
    return a + b
}
fun main(args: Array<String>) {
    greet()
    greetUser("Leo")
    val result= add(3,5)
    println(result)
}
