package main.functions

fun main(args: Array<String>){

    println("+++++++++ anonymous function ++++++++++++++++++++++ ")
    val multiplyVerbose = fun(a: Int, b: Int): Int {
        println("Multiplying $a and $b")
        return a * b
    }
    println("+++++++++ anonymous function With Lambda ++++++++++++++++++++++ ")

    val lambdaMultiply: (Int , Int) -> Int = { a, b -> a * b }
    println(multiplyVerbose(4, 5))
    println("+++++++++ (Shortern Version)anonymous function With Lambda ++++++++++++++++++++++ ")
    val lambdaMultiplyShorterVersion = { a: Int, b: Int -> a * b }
    println(lambdaMultiplyShorterVersion(100, 10))
}