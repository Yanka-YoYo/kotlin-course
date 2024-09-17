package by.yankayoyo.kotlincourse.lesson5

fun main () {
    val sum = 10 + 5
    val diff = 10 - 5
    val product = 10 * 5
    val  remainder = 10 % 5
    val isEqual = 5 == 5
    val isNotEqual = 5 != 5
    val isGreater = 5 > 3
    val isLesser = 5 < 3
    val isGreaterOrEqual = 5 >= 5
    val isLesserOrEqual = 5 <= 3
    val andResult = false && false //все должны быть тру или фолс
    val orResult = true || true //хотябы один тру что бы тру
    val notResult = !(5 > 3)
    var number = 5
    number += 3
    number /= 2


   val example = ((8 + 1) >= 9) || (6 - 2 != 4) && (2 * 3 == 6)


    println(diff)
}


fun main () {
 val (3 + 2 < 6) && (4 * 2 == 8) true
    (10 - 5 >= 5) || (2 * 3 != 6) true
    (8 / 2 == 4) && (7 % 3 != 1)
    (9 - 3 >= 6) && (8 / 2 != 4) false
    ((3 + 4) < 8) && (12 / 3 == 4) || (5 % 2 != 1) true
    ((10 - 5) >= 5) || (6 * 2 != 12) && !(9 / 3 > 2) true
    ((2 * 5) == 10) && !(7 - 3 < 5) || (8 / 2 == 4) true
    ((9 + 2) < 12) && (15 % 4 != 3) || !(4 * 2 == 8) false
    ((var a = 4; a-- == 4) || (5 * 2 != 10)) && (3 + 1 == 4) true
                  true     ||    false              true
    (var b = 3; b++ > 3) && (6 / 2 == 3) || (7 - 2 != 5) false
            false               true          false
    (var c = 1; ++c < 3) || ((4 % 2 == 0) && (5 + 0 == 5)) true
    true
    ((var d = 5; d-- == 5) && (8 / 4 == 2)) || (2 * 3 != 6) true
                  true              true            false
    20:21
    (var e = 2; e++ < 3) && ((7 + 1 == 8) || (4 % 2 != 0)) true
          true                   true           false
}

fun main () {
    var name: String? = null

    val result = name ?: "Unknown"
}


fun printVolume(userVolume: Int?) {
    val defaultVolume = 30
    println(userVolume ?: defaultVolume)
}

fun printPrice(price: Double, d: Int?) {
    val koef = (100 - (d ?: 0)) / 100.0
    println(price * koef)
}

fun printSiteLang(Lang: String?) {
val defaultLang: String = "Eng"
    println(Lang ?: defaultLang)
}

fun printBoxStuff(stuff: String?){
    stuff ?: throw Exception("Box is empty"))
}