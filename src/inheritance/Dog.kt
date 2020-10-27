package inheritance

//Syntax: class Derived_Class_Name (primary constructor) : Base_Class_name (base_class_attributes) { behaviour.. }

class Dog(legs: Int, color: String) : Animals(legs, color) {

    //Overriding
    override fun sound() {
        println("Sound: Barking")
    }

    fun bark() {
        println("Barking")
    }

}