package interfaces

class DerivedClass : MyInterface, SecondInterface {

    override fun hello() {
        println("Hello")
    }

    override fun secondInterface() {
        println("Second Interface")
    }
}

fun main() {
    var obj1 = DerivedClass()

    obj1.hello()
    obj1.greeting()
    obj1.secondInterface()
}