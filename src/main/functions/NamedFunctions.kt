package main.functions
fun calculateTotal(price: Double, quantity: Int, taxRate: Double): Double
{
    val taxResult=price * quantity * (1 + taxRate)
    return taxResult
}

fun main(args: Array<String>) {
    val total = calculateTotal(10.0, 3, 0.13)
    println(total)

    //Best practice
  val result= calculateTotal(
        price = 10.0,
        quantity = 3,
        taxRate = 0.13
    )
    println(total)
}
