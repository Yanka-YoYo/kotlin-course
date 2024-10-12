package by.yankayoyo.kotlincourse.lesson12

fun main() {

}

//Напиши валидную сигнатура метода
//Напишите сигнатуру функции, которая не принимает аргументов и не возвращает значения.

fun doNothing() {}

//Напишите сигнатуру функции, которая принимает два целых числа и возвращает их сумму.

fun doSumma(a: Int, b: Int): Int {
    return a + b
}

//Напишите сигнатуру функции, которая принимает строку и ничего не возвращает.

fun doString(string: String) {
    println(string)
}

//Напишите сигнатуру функции, которая принимает список целых чисел и возвращает среднее значение типа Double.

fun doMidlNumbers(numbers: List<Int>): Double {
    return numbers.average()
}

//Напишите сигнатуру функции, которая принимает nullable строку и возвращает её длину в виде nullable целого числа.

fun nullableString(str: String?): Int? {
    return str?.length
}
//Напишите сигнатуру функции, которая не принимает аргументов и возвращает nullable вещественное число.

fun argNothing(): Double? {
    return null
}
//Напишите сигнатуру функции, которая принимает nullable список целых чисел и не возвращает значения.

fun nullableList(list: List<Int>?) {}

//Напишите сигнатуру функции, которая принимает целое число и возвращает nullable строку.

fun doNullableInt(e: Int): String? {
    return e.toString()
}

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает список nullable строк.

fun doNullableStrings(): List<String?> {
    return listOf()
}

//Напишите сигнатуру функции, которая принимает nullable строку и nullable целое число и возвращает nullable булево значение.

fun doNullableBoolean(f: String?, g: Int?): Boolean? {
    return f?.isNotEmpty() == true && g != null
}

//
//Напиши рабочий код для следующих задач:
//Задача 1:
//Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
//
//Задача 2:
//Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
//
//Задача 3:
//Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n. Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
//
//Задача 4:
//Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке. Если отрицательных чисел нет, функция должна вернуть null.
//
//Задача 5:
//Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку. Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
//
//Сделай рефакторинг функции, через определение вспомогательных приватных функций. Требуется избавиться от дублирования кода и трудно воспринимаемых фрагментов.
//
//Сначала сделай запуск функции и посмотри на результат её работы. Сделай запуск после рефакторинга и проверь, чтобы результат работы был аналогичным.
//
//fun drawRectangle(width: Int, height: Int) {
//    if (width <= 0) throw IllegalArgumentException("width должно быть положительным и больше нуля")
//    if (height <= 0) throw IllegalArgumentException("height должно быть положительным и больше нуля")
//
//    // Верхняя граница
//    var topLine = "+"
//    for (i in 1 until width - 1) {
//        topLine += "-"
//    }
//    topLine += "+\n"
//    print(topLine)
//
//    // Боковые границы
//    for (i in 1 until height - 1) {
//        var middleLine = "|"
//        for (j in 1 until width - 1) {
//            middleLine += " "
//        }
//        middleLine += "|\n"
//        print(middleLine)
//    }
//
//    // Нижняя граница
//    var bottomLine = "+"
//    for (i in 1 until width - 1) {
//        bottomLine += "-"
//    }
//    bottomLine += "+\n"
//    print(bottomLine)
//}
//
//
//
//
//Дополнительное задание для тех, кому очень скучно.
//
//Сделай рефакторинг функции, которую разбирали на уроке и устрани баг, из-за которого таблица разъезжается при разных размерностях аргументов
//
//fun printMap(xSize: Int, ySize: Int) {
//    if (xSize == 0) throw IllegalArgumentException("xSize не должно быть равным нулю")
//    if (ySize == 0) throw IllegalArgumentException("ySize не должно быть равным нулю")
//    val formatterSize = " $xSize".length
//    val xRange = if (xSize > 0) {
//        0..xSize
//    } else {
//        0 downTo xSize
//    }
//    val yRange = if (ySize > 0) {
//        0..ySize
//    } else {
//        0 downTo ySize
//    }
//    print(" ".repeat(formatterSize))
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


