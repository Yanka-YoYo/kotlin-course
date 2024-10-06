package by.yankayoyo.kotlincourse.lesson10

fun main() {
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    val doubles = doubleArrayOf(1.1, 2.2, 3.3)

    val emptyArray = Array(5) { "" }
    val emptyNullableArray: Array<Int?> = arrayOfNulls<Int>(5)

    val readOnlyList: List<String> = listOf("a", "b", "c")
    val mutableList: MutableList<String> = mutableListOf("a", "b", "c")

    val numbersSet: Set<Int> = setOf(1, 2, 3, 4, 5)
    val mutableNumbersSet: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)

    mutableList.add("ui")
    val set = setOf("K", "o", "t", "l", "i", "n")
    for (letter in set) {
        println("| $letter |")
    }

    val list = listOf(32, 53, 1, -76)
    for (index in list.indices) {
        if (index == list.lastIndex) {
            println(list[index] + list[0])
        } else {
            println(list[index] + list[index + 1])
        }
    }

    var index = list.lastIndex
    while (index >= 0) {
        println("`${list[index--]}`")
    }


    val emptyArray2 = Array(10) { 0 }
    val doubles2 = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0)
    val array2 = Array(10) { 0 }
    array2[0] = 10
    for (i in array2.indices) {
        array2[i] = (i + 1) * 10
    }
    println(array2.toList())

    val array3 = arrayOf("a", "b", "c", "d", "e")
    for (i in array3.indices) {
        array3[i] = ""
    }
    println(array3.toList())

    val array4 = arrayOf(1, 2, 3)
    val array5 = arrayOf(4, 5, 6)
    val emptyArray3 = Array(3) { 0 }
    for (i in emptyArray3.indices) {
        emptyArray3[i] = array4[i] + array5[i]
    }
    println(emptyArray3.toList())

    val list2 = listOf<Int>()

    val list3 = listOf("aa", "bb", "cc")
    for (i in list3) {
        println(i)
    }
    val mutableList2 = mutableListOf<Float>()
    mutableList2.add(45F)
    mutableList2.add(55F)
    mutableList2.remove(55F)
    mutableList2.removeAt(0)

    println(mutableList2)

    val emptySet2 = setOf<Int>()
    val setNum = setOf(1, 2, 3, 4, 5)
    val mutableSetNum2 = mutableSetOf(1, 2, 3)
    mutableSetNum2.add(6)
    mutableSetNum2.remove(2)
    println(mutableSetNum2)

    for (cub in mutableSetNum2) {
        println(cub * cub)
    }

    val set3 = setOf(1,2,3,4)
    val set4 = setOf(4,5,6,7)
    val emptySet3 = mutableSetOf<Int>()

    for (summ in set3){
        emptySet3.add(summ)
    }
    for (summ in set4){
        emptySet3.add(summ)
    }
    println(emptySet3)

    fun finderNumber (setNum: Set<Int>, num: Int): Boolean {
        for (cub in setNum) {
            if (cub == num) {
                return true
            }
        }
        return false
    }

}





