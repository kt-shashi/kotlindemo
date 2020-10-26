package arrays

import java.util.*

//Syntax

//var arrayName = arrayOf<type> (elements)

fun main() {

    var phone = arrayOf<String>("samsung", "apple", "nokia")
    var randomValuesArray = arrayOf<Any>(290, "apple", false)

    randomValuesArray[0] = 387

    //print single element of array
    println(randomValuesArray[0])

    //size of array
    println(randomValuesArray.size)

    //print all elements
    println(Arrays.toString(randomValuesArray))
    println(randomValuesArray.toString())

}