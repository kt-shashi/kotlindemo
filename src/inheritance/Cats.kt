package inheritance

class Cats(legs: Int, color: String) : Animals(legs, color) {

    override fun sound() {
        println("Sound: Meow")
    }

    fun meow() {
        println("Meowing")
    }

}