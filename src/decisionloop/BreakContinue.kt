package decisionloop
fun main(args: Array<String>) {
    println("++++++++++ break continue statement +++++++++++")
    for(i in 0 until 12 step 2){
        if (i == 6) break
        if (i == 2) continue
        println(i)
    }

}

