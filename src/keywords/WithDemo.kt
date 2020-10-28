package keywords

abstract class Dwelling(private var residents: Int) {
    abstract val buildingMaterial: String
    abstract val capacity: Int

    fun hasRoom(): Boolean {
        return residents < capacity
    }

}

class SquareCabin(residents: Int) : Dwelling(residents) {
    override val buildingMaterial = "Wood"
    override val capacity = 6
}

fun main() {
    val squareCabin = SquareCabin(6)

    println("\nSquare Cabin\n============")
    println("Capacity: ${squareCabin.capacity}")
    println("Material: ${squareCabin.buildingMaterial}")
    println("Has room? ${squareCabin.hasRoom()}")

    /*
    In the println() statements, every time you reference a
    property or function of squareCabin, notice how you have
    to repeat squareCabin. This becomes repetitive and can be
    a source of errors when you copy and paste print statements.

    When you are working with a specific instance of a class and
    need to access multiple properties and functions of that instance,
    you can say "do all the following operations with this instance object"
    using a with statement.
     */

    with(squareCabin) {
        println("\nSquare Cabin\n============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
    }
}

