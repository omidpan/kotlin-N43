package main.functions

fun <T> printItem(item: T) {
    println("Item: $item")
}


fun main() {
    printItem("Hello") // Output: Item: Hello
    printItem(10) // Output: Item: 10

    val greet: () -> Unit
    val square: (Int) -> Int
    val producePrinter: () -> () -> Unit

    greet = { println("hello world") }
    greet()

    var newProducer: () -> Unit = {
        println("this is a lambda declration and calling ")
    }
 newProducer()

}
