package main.classes
@Info(author="Omid Panahi", version="1.0.0")
class AnnotationExample {
    @Info(author="Omid Panahi", version="1.0.0")
    val name: String = "Kotlin"

    fun infoTest(name: String) {
        println("$name is $name")
    }
}

fun main(args: Array<String>) {
    val annotationExample = AnnotationExample()
    annotationExample.infoTest("test")

}


