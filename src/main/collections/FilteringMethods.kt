package main.collections

fun main(args: Array<String>) {
    // Filtering Methods
    val nums = listOf(10, 20, 30, 40, 50)
        /**
     * What is it in Kotlin?
     *  it is the implicit parameter of a lambda expression.
     * In Kotlin:
     * When a lambda has only ONE parameter
     *
     * Kotlin automatically names that parameter it
     */
    println("\n ++++ filter - Returns elements > 25:   ++++")
    println(nums.filter { it > 25 })
    println("\n ++++ filterNot - Excludes elements > 25:  ++++")
    println(nums.filterNot { it > 25 })
    println("\n ++++ filterIndexed - Filters based on index:  ++++")
    println(nums.filterIndexed { index, _ -> index % 2 == 0 })

}