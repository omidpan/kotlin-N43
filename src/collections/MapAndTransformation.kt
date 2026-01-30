package collections

/**
 * map - Transforms each element
 * mapIndexed - Transforms each element with index reference
 *  flatMap - Flattens nested collections
 */
fun main(args: Array<String>) {
    val nums = listOf(10, 20, 30, 40, 50)
    println("\n map - Doubles each number:")
    println(nums.map { it * 2 })
    println("\n mapIndexed - Adds index to elements:")
    println(nums.mapIndexed { index, value -> "$index: $value" })
    val nested = listOf(listOf(1, 2), listOf(3, 4))
    println(nested)
    println(nested[1][1])
    println("\n flatMap - Flattens nested lists:")
    println(nested.flatMap { it })

}