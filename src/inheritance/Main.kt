package inheritance

//Syntax--
//Base class: open class Base_Class_Name (primary constructor){ behaviour.. }
//Derived class: class Derived_Class_Name (primary constructor) : Base_Class_name (base_class_attributes) { behaviour.. }

fun main() {

    var dog = Dog(4, "Brown")
    dog.eat()
    dog.sleep()
    dog.bark()
    dog.sound()

    var cat = Cats(4, "black")
    cat.eat()
    cat.sleep()
    cat.meow()
    cat.sound()

}