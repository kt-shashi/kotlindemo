package lambda

fun main() {
    //Lambda : Function with no name

    //Find sum of 2 numbers
    var data = { a: Int, b: Int -> a + b }
    println(data(12, 14))
}