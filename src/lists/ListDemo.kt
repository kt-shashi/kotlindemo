package lists

//Types-
//1. Immutable ( Fixed size, Fixed value)
//Syntax: var/val listName = listOf<data_type> (elements)
//2. Mutable
//Syntax: var/val listName = mutableListOf<data_type> (elements)

fun main() {

//    practiceList()
    practiceArrayList()

}

fun practiceList() {
    val stringList1 = listOf<String>("Box", "Table", "Chair")
    println(stringList1)

    val stringList2 = mutableListOf<String>("Box", "Table", "Chair")

    stringList2[1] = "TV"

    //Add an element
    stringList2.add("bed")

    //Add element at an index
    stringList2.add(0, "Door")

    //Add a list
    stringList2.addAll(stringList1)

    //delete at index
    stringList2.removeAt(0)

    println(stringList2)
}

fun practiceArrayList() {
    var arrayList = arrayListOf<String>("Data1", "Data2", "Data3")

    arrayList.add("New Data")
    arrayList.add(1, "Data4")
    arrayList.removeAt(0)

    println(arrayList)
}