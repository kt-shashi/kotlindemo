package keywords

fun main() {

    var myList = ArrayList<Int>()
    myList.add(1)
    myList.add(2)
    myList.add(3)

    myList.forEach({ n -> println(n) })
    myList.forEach({ println(it) })
    myList.forEach(::println)
}