package main.classes

class Person1(var name: String, var age: Int) {//primary constructor

    fun greet() {
        println("Hello, my name is $name and I am $age years old.")
    }
}
class Person2 {
    var name: String
    var age: Int

    constructor(name: String, age: Int){//secondary constructor
        this.name = name
        this.age = age
    }
//primary constructor

    fun greet() {
        println("Hello, my name is $name and I am $age years old.")
    }
}

fun main(){
    var person = Person1("Jack", 12)
    val person2 = Person2("Jack", 12)
    person.greet()
    person2.greet()
}