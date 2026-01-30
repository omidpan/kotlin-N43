package decisionloop

import java.util.Scanner

fun main(args: Array<String>){
    var count = 0

    while (count < 5) {
        println(count)
        count++
    }

    println("++++++++++++++ do while loop in Kotlin ++++++++++++")
    var number = 0
    do{
        println(number)
        number++
    }while (number<6)

    println("++++++++++++ validation input with do while loop in Kotlin ++++++++++++++")
    var inputVar=0
    do{
        println("please enter a number in between 20 to 50: ")
        val input = Scanner(System.`in`)
        inputVar = input.nextInt()
        println(" your input is valid $inputVar")
    }while (!(20 <= inputVar && inputVar <=50))

}
