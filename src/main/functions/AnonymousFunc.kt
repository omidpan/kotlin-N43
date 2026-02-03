package main.functions
fun operate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main(args: Array<String>){
    val addition: (Int,Int)->Int={a,b->a+b}
    //Without Trailing Lambda
    val sum1 = operate(5, 3, addition)
    println(sum1) // Output: 8
//With Trailing Lambda
    val sum2 = operate(5, 3) { x, y -> x + y }
    println(sum2) // Output:
//
//    println("+++++++++ anonymous function ++++++++++++++++++++++ ")
//    val multiplyVerbose = fun(a: Int, b: Int): Int {
//        println("Multiplying $a and $b")
//        return a * b
//    }
//    println("+++++++++ anonymous function With Lambda ++++++++++++++++++++++ ")
//
//    val lambdaMultiply: (Int , Int) -> Int = { a, b -> a * b }
//    println(multiplyVerbose(4, 5))
//    println("+++++++++ (Shortern Version)anonymous function With Lambda ++++++++++++++++++++++ ")
//    val lambdaMultiplyShorterVersion = { a: Int, b: Int -> a * b }
//    println(lambdaMultiplyShorterVersion(100, 10))
}