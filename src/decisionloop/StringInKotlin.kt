package decisionloop

fun main(args: Array<String>) {
    val str = "abcd 123"
// Character access in String
    println("Character access in String:")
    for (c in str) {
        println(c) // Prints each character in the string
    }
    println("\nString uppercase conversion:")
    val str2 = "abcd"
    println(str2.uppercase()) // Converts to uppercase
    println(str2) // Original string remains unchanged

    println("+++++++++++++++ string concatenation:++++++++++\n")

    val s1 = "abc" + 1
    println(s1 + "def") // Concatenation -> Output: "abc1def"
    println("\nString interpolation:")
    val s2 = "abc"
    println("$s2 length is ${s2.length}") // Output: "abc.length is 3"


    println("++++ Formatting an integer with leading zeroes to make it 7 characters long ++++")

    // Formatting an integer with leading zeroes to make it 7 characters long
    val integerNumber = String.format("%07d", 31416)
    println(integerNumber) // Output: 0031416
// Formatting a floating-point number with 4 decimal places and a sign
    val floatNumber = String.format("%+.4f", 3.141592)
    println(floatNumber) // Output: +3.1416
// Formatting strings to uppercase with two placeholders
    val helloString = String.format("%S %S", "hello", "world")
    println(helloString) // Output: HELLO WORLD

}