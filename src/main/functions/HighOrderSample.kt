package main.functions
fun firstMethod(str: String):String {
    println("Inside the firstMethod")
    return "firstMethod returning"
}

fun secondMethod(arg1String: String, arg2Function: (String) -> String) : String {
    println("Inside the secondMethod")
    return arg2Function(arg1String)
}

fun main(args: Array<String>) {

//   println(firstMethod("first"))
    val returnValue = secondMethod("First argument of the secondMethod", ::firstMethod) // Passing the function
    println(returnValue)
}