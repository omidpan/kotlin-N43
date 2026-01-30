package collections

fun main (args: Array<String>) {

    val numbers = listOf(10, 20, 30, 40, 50)
    // Searching & Checking
    println("\n find - Finds first element > 25:")
    println(numbers.find { it > 25 })
    println("\n First & Last elements:")
    println(numbers.first())
    println(numbers.last())
    println("\n Safe FirstOrNull & LastOrNull:")
    println(emptyList<Int>().firstOrNull())
  /*
     any - Checks if any element matches
     all - Checks if all elements match
     none - Checks if no elements match
  */
    println("\n ++++++++++ any, all, none: +++++++++++++++++")
    println(numbers.any { it > 30 })
    println(numbers.all { it > 5 })
    println(numbers.none { it > 100 })


  println("++++++++ sorting and ordering methods ++++++++++")
    val names = listOf("Morteza", "Maryam", "Mahsa")
    val unsorted = listOf(5, 2, 8, 1)
    println("\n sorted - Ascending order:")
    println(unsorted.sorted())
    println("\n sortedDescending - Descending order:")
    println(unsorted.sortedDescending())
    println("\n sortedBy - Sorts by string length:")
    println(names.sortedBy { it.length })
    println("\n reversed - Reverses order:")
    println(numbers.reversed())

    /*
    • sum - Sum of all numbers
    • average - Average of numbers
    • count - Counts elements matching a condition
    • maxOrNull & minOrNull - Maximum & minimum values
     */
    println("\n ++++++++++ aggregation methods +++++++++++++++")
    println("\n sum, average, count:")
    println(numbers.sum())
    println(numbers.average())
    println(numbers.count { it > 25 })
    println("\n maxOrNull & minOrNull:")
    println(numbers.maxOrNull())
    println(numbers.minOrNull())
    /*
        • groupBy - Groups elements into a Map<K, List<V>>
        • partition - Splits elements into two lists based on conditiont
     */
// Grouping & Partitioning
    println("\n groupBy - Group by length:")
    println(names.groupBy { it.length })
    println("\n partition - Split into evens and odds:")
    val (evens, odds) = numbers.partition { it % 2 == 0 }
    println(evens)
    println(odds)

    /*
    • union - Combines two sets (removes duplicates)
    • intersect - Finds common elements
    • subtract - Removes elements from first set that exist in second

     */

// Set Operation
    val set1 = setOf(1, 2, 3)
    val set2 = setOf(3, 4, 5)
    println("\n union - Combines sets:")
    println(set1.union(set2))
    println("\n intersect - Common elements:")
    println(set1.intersect(set2))
    println("\n subtract - Difference between sets:")
    println(set1.subtract(set2))

    /*
    • getOrDefault - Returns value if key exists, else default
    • keys, values, entries - Get map components
     */
    println("\n\n+++++++++++++ MAP-SPECIFIC METHODS +++++++++++++")

    val ageMap = mapOf("Morteza" to 32, "Maryam" to 28)
    println("\n getOrDefault - Get value or default:")
    println(ageMap.getOrDefault("Mahsa", 25))
    println("\n Keys, Values, Entries:")
    println(ageMap.keys)
    println(ageMap.values)
    println(ageMap.entries)

}