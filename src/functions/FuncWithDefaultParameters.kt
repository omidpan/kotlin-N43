package functions

/**
 *Key  Point:
 * Default parameters reduce method overloading
 * Named arguments + defaults = clean APIs
 * using of vararg
 * combine vararg with other params
 */
fun printUser(
    username: String,
    password: String,
    isAdmin: Boolean = false,
    isActive: Boolean = true
) {
    println("User: $username, Admin: $isAdmin, Active: $isActive")
}
//vararg
fun calculateAverage(vararg numbers: Int): Double {
    var sum = 0
    for (n in numbers) {
        sum += n
    }
    return sum.toDouble() / numbers.size
}
//vararg with Other parameters
fun logMessages(vararg messages: String,level: String="INFO", ) {
    for (msg in messages) {
        println("[$level] $msg")
    }
}
fun main(args: Array<String>) {
    //named parameters
    println("++++++++++ Using named parameters +++")
    printUser("leo", "1234")
    printUser("admin", "root", isAdmin = true)
    printUser("admin", "root", isAdmin = true, isActive = false)

    println("++++++++++ Using vararg keyword if you don't know how many params you have +++")
    val res=calculateAverage(5, 15, 25)
    val res2=calculateAverage(5, 15, 25, 35)
    println(res)
    println(res2)
    println(calculateAverage())

    println("++++++++++ Combination of vararg and default param +++")
    logMessages( "Start app", "Loading data", "Done", level ="WARNING")


}

