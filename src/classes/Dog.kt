package classes

//class with no constructor
class Dog {

    var name: String = "Doge"
    var leg: Int = 4
    var color: String = "Brown"

    fun bark() {
        println("$name is Barking")
    }

    fun eat(hungry: Boolean) {
        if (hungry)
            println("$name is eating")
        else println("$name is not hungry")
    }

}

//class with primary constructor
class Cat constructor(name: String, leg: Int, color: String) {

    var name: String
    var leg: Int
    var color: String

    init {
        this.name = name
        this.leg = leg
        this.color = color
    }

    fun meow() {
        println("$name is Meowing")
    }

    fun eat(hungry: Boolean) {
        if (hungry)
            println("$name is eating")
        else println("$name is not hungry")
    }

}

//class with primary constructor code reduced
class Horse constructor(private var name: String, var leg: Int, var color: String) {

    fun running() {
        println("$name is Running")
    }

    fun eat(hungry: Boolean) {
        if (hungry)
            println("$name is eating")
        else println("$name is not hungry")
    }

}

//class with secondary constructor
class Insect {
    var name: String
    var leg: Int
    var color: String

    constructor(name: String, leg: Int, color: String) {
        this.name = name
        this.leg = leg
        this.color = color
    }

    fun biting() {
        println("$name is biting")
    }
}

//class with both primary and secondary constructor
class Panda(var name: String, var leg: Int, var color: String) {

    var age: Int? = null

    constructor(name: String, leg: Int, color: String, age: Int) : this(name, leg, color) {
        this.age = age
    }

    fun biting() {
        println("$name is biting")
    }
}

//data class : classes whose main purpose is to hold data
data class Restaurant(var name: String, var rating: Double)

fun main() {

    val dog: Dog = Dog()

    dog.name = "Cheems"
    dog.bark()
    dog.eat(true)

    val cat = Cat("Cat1", 4, "black")
    cat.meow()
    cat.eat(false)

    val horse = Horse("Gorse1", 4, "brown")
    horse.running()
    horse.eat(true)

    val panda1 = Panda("Panda1", 2, "black&white");
    val panda2 = Panda("Panda2", 2, "black&white", 30);

    var res1 = Restaurant("Pominos", 4.0)
    var res2 = Restaurant("Qizza Hut", 3.8)
    var res3 = Restaurant("Qizza Hut", 3.8)

    var restaurantList = mutableListOf(res1, res2)

    for (res in restaurantList)
        println(res)

    //compare 2 objects
    if (res2 == res3)
        println("Same")
    else println("Not same")
}