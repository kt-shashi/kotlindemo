package string

fun main() {

    var name: String = "Shashi"

    println(name)
    println("Length: " + name.length)
    println("Char at 1st index : ${name.get(1)}")

    //Exclusive of end index
    println("Characters from 0-4 ${name.subSequence(0, 4)}")


}