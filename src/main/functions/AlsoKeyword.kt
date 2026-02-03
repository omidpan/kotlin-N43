package main.functions

val list = mutableListOf(1, 2, 3)
    .also { println("Before add: $it") }
    .also { it.add(4) }
    .also { println("After add: $it") }


fun main(){
    val list = mutableListOf(1, 2, 3)
        .also { println("Before add: $it") }
        .also { it.add(4) }
        .also { println("After add: $it") }
}