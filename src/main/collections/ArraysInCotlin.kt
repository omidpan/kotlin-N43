package main.collections

/**
 * ARRAYS
 * • arrayOf() – Creates Simple Array with Values
 * • arrayOfNulls() – Creates Null Array
 * • emptyArray() – Creates Empty Array
 */
fun main(args: Array<String>) {

    val simpleArray = arrayOf(1, 2, 3)
    println("+++++++++ joinToString() is used to print elements in a readable format. ++++++++++++++")
    println(simpleArray.joinToString()) // Output: 1, 2, 3


    val nullArray: Array<Int?> = arrayOfNulls(3)
    println(nullArray.joinToString()) // Output: null, null, null
    var exampleArray = emptyArray<String>()
    println(exampleArray.joinToString()) // Output: (empty)

    println("++++++++ += operator creates a new array, copies the old elements, and appends the new element +++++++")
    var riversArray = arrayOf("Nile", "Amazon", "Yangtze")
// Using += adds an element by creating a new array
    riversArray += "Mississippi"
    println(riversArray.joinToString()) // Output: Nile, Amazon, Yangtze, Mississippi


    println("+++++++++++ Array initialization +++++++++")
    // Initializing with Default Values
    val initArray1 = Array(3) { 0 } // Creates an array [0, 0, 0]
    println(initArray1.joinToString()) // Output: 0, 0, 0
// Initializing with Computed Values and lambda function
    val initArray2 = Array(5) { i -> (i * i).toString() }
    initArray2.forEach { print(it) } // Output: 014916

    println("+++++++ multi dimensional Arrays ++++++++++++")
    // Creates a two-dimensional array (2x2) initialized with zeros
    val twoDArray = Array(2) { Array(2) { 0 } }
    println(twoDArray.contentDeepToString())
// Creates a three-dimensional array (3x3x3) initialized with zeros
    val threeDArray = Array(3) { Array(3) { Array(3) { 0 } } }
    println(threeDArray.contentDeepToString())

 println("++++++ The data type of the elements in an array depends on the initial values.+++++++++")

    // 2D Array of Double (Default: 0.0)
    val doubleArray = Array(2) { Array(3) { 0.0 } } // 2x3 array initialized with 0.0
    println("2D Double Array:")
    println(doubleArray.contentDeepToString()) // Output: [[0.0, 0.0, 0.0], [0.0, 0.0, 0.0]]
// 2D Array of String (Default: "empty")
    val stringArray = Array(2) { Array(3) { "empty" } } // 2x3 array initialized with "empty"
    println("2D String Array:")
    println(stringArray.contentDeepToString()) // Output: [[empty, empty, empty], [empty, empty, empty]]
// 2D Array of Boolean (Default: false)
    val booleanArray = Array(2) { Array(3) { false } } // 2x3 array initialized with `false`
    println("2D Boolean Array:")
    println(booleanArray.contentDeepToString()) // Output: [[false, false, false], [false, false, false]]


    println("+++++++ using loop to iterate in an array ++++++++++\n")
    // Create a 2D array (2 rows, 3 columns) initialized with zeros
    val initArray2D = Array(2) { IntArray(3) }
// Initialize the 2D array with values (i + j)
    for (i in 0 until initArray2D.size) {
        for (j in 0 until initArray2D[i].size) {
            initArray2D[i][j] = i + j
        }
    }
// Print the 2D array elements
    println("2D Array Elements:")
    for (i in 0 until initArray2D.size) {
        for (j in 0 until initArray2D[i].size) {
            print("${initArray2D[i][j]} ") // Print values in the same row
        }
        println() // Move to the next line after each row
    }

    println(" ++++++++++++ Using forEach method (streaming data)++++++")
    val initArray2DSimple = Array(2) { row -> IntArray(3) { col -> row + col } }
// Print the 2D array elements
    println("2D Array Elements:")
    initArray2DSimple.forEach { row ->
        println(row.joinToString(" ")) // Print each row as a space-separated string
    }

    println("++++++++++ access and modify arrays++++++++\n")
    // Creating a simple 1D array
    val simpleArr = arrayOf(1, 2, 3)
    // Creating a 2D array (2x2) initialized with zeros
    val twoDArr = Array(2) { Array(2) { 0 } }
    // Modifying the 1D array
    simpleArr[0] = 10
    // Modifying the 2D array
    twoDArr[0][0] = 2
    // Printing the modified elements
    println(simpleArr[0].toString()) // Output: 10
    println(twoDArr[0][0].toString()) // Output: 2

    println("++++++++ compare arrays(shallow and deep ++++++++\n")
    // Comparing 1D Arrays Using `contentEquals()`
    val arr1D = arrayOf(1, 2, 3)
    val anotherArr1D = arrayOf(1, 2, 3)
    println("Are 1D arrays equal? ${arr1D.contentEquals(anotherArr1D)}")
    // Output: true
    // Comparing Nested (2D) Arrays Using `contentDeepEquals()`
    val twoDArray1 = arrayOf(arrayOf(1, 2), arrayOf(3, 4))
    val twoDArray2 = arrayOf(arrayOf(1, 2), arrayOf(3, 4))
    println("Are 2D arrays equal? ${twoDArray1.contentDeepEquals(twoDArray2)}")
    // Output: true
    // Summing Elements of an Array Using `.sum()`
    val sumArray = arrayOf(1, 2, 3)
    println("Sum of sumArray elements: ${sumArray.sum()}")
    // Output: 6

    println("+++++++ shuffling arrays++++++++\n")
    // Shuffling Elements in an Integer Array
    val numberArray = arrayOf(1, 2, 3)
    numberArray.shuffle() // Random shuffle
    println("Shuffled Array 1: ${numberArray.joinToString()}")
    numberArray.shuffle() // Shuffle again
    println("Shuffled Array 2: ${numberArray.joinToString()}")

    println("+++++++ transforming arrays++++++++\n")
    // Converting an Array to a Set and a List
    val strArray = arrayOf("a", "b", "c", "c")
// Convert array to a Set (removes duplicates)
    println("Array to Set: ${strArray.toSet()}") // Output: [a, b, c]
// Convert array to a List (keeps duplicates)
    println("Array to List: ${strArray.toList()}") // Output: [a, b, c, c

}