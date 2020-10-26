package ifelse

//1. divide a by b
//2. find greater number
//3. check if number is 4
//4. check if numeber lies between 10-20

fun main() {

    //problem 1
    var result1: Int = problem1(20, 0)
    if (result1 != -1)
        println(result1)
    else
        println("Cannot perfrom division by 0")

    //problem 2
    println("Greater number: ${problem2(20, 32)}")

    //problem3
    if (problem3(4))
        println("Number is 4")
    else println("Numebr is not 4")

    //problem4
    if (problem4(20))
        println("In range 10 - 20")
    else
        println("Not in range")
}

fun problem1(a: Int, b: Int): Int {
    if (b == 0) {
        return -1
    }

    return a / b
}

fun problem2(a: Int, b: Int): Int {
    var maxValue = if (a > b)
        a
    else if (b > a)
        b
    else
        a

    return maxValue
}

/* Syntax of When :

when(condition){
 case 1 -> operation1
 case 2 -> operation2
 else -> if all the above are not satisfied
 }

 */

fun problem3(x: Int): Boolean {
//    when (x) {
//        1 -> return false
//        4 -> return true
//
//        else -> return false
//    }

    when {
        x == 1 -> return false
        x == 4 -> return true

        else -> return false
    }
}

fun problem4(x: Int): Boolean {
    //in is inclusive
    when (x) {
        in 1..9 -> return false
        in 10..20 -> return true
        else -> return false
    }
}
