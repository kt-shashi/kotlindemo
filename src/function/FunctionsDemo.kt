package function

fun main() {

    println(addTwoNum(20, 30))
    println(timesTwo(2))
}

fun printName(): Unit = println("Name")

fun printName(name: String): Unit {
    println(name)
}

fun addTwoNum(a: Int, b: Int): Int {
    return a + b
}

fun timesTwo(x: Int) = x * 2
