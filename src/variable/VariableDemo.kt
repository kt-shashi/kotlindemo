package variable

//val: value (immutable)
//var: variable (mutable)

//syntax
//val identifier = initialization
//var identifier = initialization

//val identifier : Datatype = initialization
//var identifier : Datatype = initialization

fun main() {

    val name: String = "Shashi"
    var age: Int = 18

    println(name)
    println(age)

    if (age >= 18)
        println(age)
    else
        println("<18")

}