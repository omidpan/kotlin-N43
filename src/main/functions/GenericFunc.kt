package main.functions

fun <T> printItem(item: T) {
    println("Item: $item")
}


fun main(){
    printItem("Hello") // Output: Item: Hello
    printItem(10) // Output: Item: 10
}
