package by.yankayoyo.kotlincourse.lesson11

fun main() {

    val pair: Pair<Int, String> = 1 to "a"
    val pair2 = Pair(2, "a")

    println(pair.first)
    println(pair.second)

    val emptyMap = mapOf<String, String>()

    val capitals = mapOf(
        "Belarus" to "Minsk",
        "France" to "Paris"
    )

    val map = mapOf(1 to "a", 2 to "b", 3 to "c")

    val mutableCapitals = mutableMapOf(
        "Belarus" to "Minsk",
        "France" to "Paris"
    )

    val capitalOfRussia = capitals["Russia"]

    println(capitalOfRussia)

    mutableCapitals["Germany"] = "Berlin"
    mutableCapitals.remove("France")

    println(mutableCapitals)

    for (entries in mutableCapitals) {
        println("${entries.key} : ${entries.value}")
    }

    for ((country, capital) in capitals) {
        println("$country: $capital")
    }

    val mapWithNullableKey = mutableMapOf<String?, Int>(null to 1)

    val myMap = mapOf<String, Int>()

    val map1 = mapOf(1 to "a", 2 to "b", 3 to "c")

    val mutableMyMap = mutableMapOf(1 to "c")
    mutableMyMap[34] = "bcd"


    println(mutableMyMap[1])

    println(mutableMyMap[55])

    mutableMyMap.remove(34)

    for (entries in map1) {
        println("${entries.key}:${entries.value}")
    }

    for ((key, value) in map1) {
        println("$key: $value")
    }

    val anotherMap: Map<String, List<Int>> = mapOf("St" to listOf(1, 2, 3))


    val daysMap = mapOf<String, List<String>>()
    val mapYear = mapOf<String, MutableMap<String,String>>()
    val mutableMapOfGame = mapOf<String, MutableSet<String>>()

}

fun searchKey(map1: Map<String, String>, word: String): String {
    for ((key, value) in map1) {
        if (value == word) return key
    }
    return "Non"


}


