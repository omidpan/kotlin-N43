package decisionloop

fun main(args: Array<String>) {

    /**
     * Any expression in Kotlin may be marked with a label
     * • In Kotlin, a label is a name followed by the @ symbol that you can use to
     * identify and control the flow of loops or function calls.
     * • Labels are particularly useful for breaking or continuing outer loops from
     * within nested loops.
     * • break@labelName: Terminates the loop or block identified by the label.
     * • continue@labelName: Skips the current iteration of the loop identified by the
     * label and proceeds to the next iteration
     */
    println(" +++++++++++++++ LABEL (@outer , @inner ) in Kotlin +++++++++++ ")
    outer@ for (i in 1..3) { // Outer loop with label 'outer'
        inner@ for (j in 1..5) { // Inner loop with label 'inner'
            if (j == 2) {
                println("Continue outer loop at i=$i, j=$j")
                continue@outer // Skips to the next iteration of the outer loop
            }
            if (i == 3) {
                println("Break outer loop at i=$i, j=$j")
                break@outer // Exits the outer loop completely
            }
            println("i=$i, j=$j")
        }
    }
    println("End of loops")
}