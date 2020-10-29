package keywords

fun main() {

    var name1: String = "Shashi"
    //name = null -> This gives an error

    var name2: String? = "Shashi"
//    name2 = null

    var length: Int? = name2?.length
    println(length)

    //Elvis operator ?:
    //Used to return the not null value even the conditional expression is null
    var name3 = name2 ?: "Name might be null"
    println(name3)

    //Not null assertion : !! Operator
    //Converts any value to a non-null type and throws an exception if the value is null

    name2!!.toLowerCase()
    println(name2)
}