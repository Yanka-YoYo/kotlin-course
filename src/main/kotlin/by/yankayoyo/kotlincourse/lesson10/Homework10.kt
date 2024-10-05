package by.yankayoyo.kotlincourse.lesson10

fun main() {

//    Задание 1: Создание и Инициализация Массива
//    Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.

    val arrayNumbs: Array<Int> = arrayOf(1, 2, 3, 4, 5)

//    Задание 2: Создание Пустого Массива
//    Создайте пустой массив строк размером 10 элементов.

    val emptyArray = Array(10) { 0 }

//    Задание 3: Заполнение Массива в Цикле
//    Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.

    val arrayDouble: Array<Double> = arrayOf()
    val arrayDoubleDouble = arrayOf(1.0, 2.0, 3.0, 4.0, 5.0)
    for (double in arrayDoubleDouble) {
        println(double * 2)
    }

//    Задание 4: Изменение Элементов Массива
//    Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.

    val emptyArrayThree = Array(5) { 0 }
    val arrayIndex = arrayOf(0, 1, 2, 3, 4)
    for (three in arrayIndex) {
        println(three * 3)
    }

}