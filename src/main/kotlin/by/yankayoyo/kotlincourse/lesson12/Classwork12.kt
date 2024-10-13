package by.yankayoyo.kotlincourse.lesson12

import javax.sql.rowset.FilteredRowSet

fun main() {

//    println(summ2(2.0, 3.0, false))
//
//    val max = getMax(3, 4)
//
////    val tut = mutableListOf("first", "second")
////    replaceString()
////    replaceString()

    printMap(1, 9)
}

fun sayHello() {
    println("Hello, Minsk!")
}

fun greetUser(name: String) {
    println("Hello, $name")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun printSumm(a: Int, b: Int): Int {
    println("Sum of $a and $b is ${a + b}")
    return a
}

fun multiply(a: Int, b: Int) = a * b

private fun calculateDiscount(price: Double): Double {
    return price * 0.1
}

fun finalPrice(price: Double): Double {
    val discount = calculateDiscount(price)
    return price - discount
}

fun findValue(numbers: List<Int>, target: Int) {
    for (number in numbers) {
        if (number == target) {
            println("Value found: $number")
            return
        }
        println(number)
    }
    println("Value not found")
}

fun doSomething() = Unit

fun getUserName(): String {
    return ""
}

fun printGrit(grit: String) {

}

fun calcArea(areea: Double, area1: Double): Double {
    return 9.0
}

fun findMax(ch1: Int, ch2: Int): Int {
    return 6
}

fun isNullOr(n: String?): Boolean {
    return false
}

fun calcDiscount(dis: List<String>, num: Int?): Double? {
    return null
}

fun summ2(first: Double, second: Double, four: Boolean): Double {
    return if (four) {
        first + second
    } else {
        first - second
    }
}

fun getMax(f: Int, s: Int): Int = if (f < s) s else f

fun printPozitNumb(a: List<Int>) {
    for (i in a) {
        if (i > 0) {
            println(i)
        } else return
    }
    println("Warning!")
}

fun replaceString(t: MutableList<String>, m: String) {
    for (q in t.indices) {
        if (t[q] == m) {
            t[q] = m.uppercase()
            return
        }
    }
    println("Non string")
}

//fun printMap(xSize: Int, ySize: Int) {
//    checkSize(xSize, "xSize")
//    checkSize(ySize, "ySize")
//
//    val formatterSize = " $xSize".length
//
//    val xRange = createRange(xSize)
//    val yRange = createRange(ySize)
//
//    print(" ".repeat(formatterSize))
//
//    for (i in xRange) {
//        print("%${formatterSize}s".format(i))
//    }
//    println()
//    for (i in yRange) {
//        print("%${formatterSize}s".format(i))
//        for (j in yRange) {
//            val m = i * j
//            val result = when {
//                m % 2 == 0 -> if (m % 3 == 0) "." else "*"
//                m % 5 == 0 -> if (i < 0) "-" else "+"
//                else -> "?"
//            }
//            print("%${formatterSize}s".format(result))
//        }
//        println()
//    }
//}
//
//private fun checkSize(xS: Int, yS: String) {
//    if (xS == 0) throw IllegalArgumentException("$xS не должно быть равным нулю")
//}
//
//private fun createRange(size: Int): IntProgression {
//
//   return if (size > 0) {
//        0..size
//    } else {
//        0 downTo size
//    }
//}

