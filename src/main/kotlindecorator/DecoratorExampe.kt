package main.kotlindecorator

interface Pizza{
    fun description(): String
    fun cost(): Double
}
// simple Pizza
class SimplePizza : Pizza{
    override fun description(): String {
       return "Pizza"
    }

    override fun cost(): Double {
        return 8.0
    }
}
//First Wrapper

open class PizzaDecorator(private val pizza:Pizza) : Pizza{
    override fun description(): String {
       return pizza.description()
    }

    override fun cost(): Double {
        return pizza.cost()
    }
}
class MushroomDecorator(pizza: Pizza) : PizzaDecorator(pizza){
    override fun description(): String {
        return super.description()+" + Mushroom"
    }

    override fun cost(): Double {
        return super.cost() + 1.0
    }
}
/*
 I need a cheese pizza with olive and the price of cheese is 2$ and olive is 1$
 I also need a allDressed Pizza that the price must be 12$
 */
fun main(){


    // I need a class for a pizza to give me cost and description
    val pizza = PizzaDecorator(SimplePizza())

    println(pizza.description())
    println(pizza.cost())

    println("++++++++++ adding mushroom topping ++++++++++++++")

    val mushroomPizza = MushroomDecorator(pizza)

    println(mushroomPizza.description())
    println(mushroomPizza.cost())

}