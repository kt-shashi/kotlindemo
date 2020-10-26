package trycatch

fun main() {

    usingTryCatch()
    usingNullSafetyOperator()

}

fun usingTryCatch() {
    try {

        var a: Int = 10
        var b: Int = 0
        println(a / b)

    } catch (e: Exception) {

        println("Exception")

    } finally {

        println("Finally")

    }
}

fun usingNullSafetyOperator() {

    val name: String? = null

    println(name)
    println(name?.indexOf('c'))
    println(name?.length ?: "String is null")

    val items = listOf("Item1", "Item2", null, "Item4")

    println("Items: ${items.filterNotNull()}")

}
