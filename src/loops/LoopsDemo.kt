package loops

//1. Natural numbers from 1-range
//2. Printing array
//3. Increment 2 in loop (step)
//4. Print in reverse

fun main() {

    problem1(10)

    var randomValuesArray = arrayOf<Any>(290, "apple", false)
    problem2(randomValuesArray)

    problem3()
    problem4()
}

/*

for syntax:
for(iterations)
{
    //operations
}

while syntax:
while(iteration)
{
    //operations
    increment
}

do while syntax:
do{
    //operations
    //increment
}while(condition)

*/

fun problem1(x: Int) {

//    for (i in 1..x) {
//        print("$i ")
//    }

    var i: Int = 1

//    while (i <= x) {
//        print("$i ")
//        i++
//    }

    do {
        print("$i ")
        i++
    } while (i in i..x)

    println()
}

fun problem2(randomArray: Array<Any>) {

//    for (i in 0..randomArray.size - 1) {
//        print("${randomArray[i]} ")
//    }

//    for (i in 0 until randomArray.size) {
//        print("${randomArray[i]} ")
//    }

    for (element in randomArray) {
        print("$element ")
    }

    println()
}

fun problem3() {

    for (i in 1..10 step 2) {
        print("$i ")
    }

    println()
}

fun problem4() {

    for (i in 10 downTo 1 step 2) {
        print("$i ")
    }

    println()
}

