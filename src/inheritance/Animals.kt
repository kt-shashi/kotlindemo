package inheritance

//Syntax: open class Base_Class_Name (primary constructor){ behaviour.. }

open class Animals(private var legs: Int, private var color: String) {

    fun eat() {
        println("eating")
    }

    fun sleep() {
        println("sleeping")
    }

    //For overriding
    open fun sound() {
        println("making sound")
    }
}