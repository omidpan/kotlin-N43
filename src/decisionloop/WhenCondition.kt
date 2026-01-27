package decisionloop

fun main() {

    println("++++++++++++++++++++++++ WHEN expression ++++++++++++++++++++")
    println("Enter a number:")
    val x = readLine()?.toIntOrNull() ?: 0
    /**
     * above expression is similar to
     * val readLine = readLine()
     * val x = (if (readLine != null) readLine.toIntOrNull() else null) ?: 0
     */

    when (x) {
        1 -> println("x is 1")
        2 -> println("x is 2")
        else -> {
            println("x is neither 1 nor 2")
        }
    }
    println(" ++++++++++++++++++ is operation and not is(!is) operation")
    when(x){
        is Int -> println("x is Int");
        !is Int -> println("x is neither Int");

    }
    println("++++++ when can be used as a replacement for an if-else if ++++++++++++")
    when {
        x % 2 != 0 -> println("x is odd")
        else -> println("x is even")
    }
    }
