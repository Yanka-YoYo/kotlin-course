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

    val emptyArrayThree = Array(5) { "" }
    for (three in emptyArrayThree.indices) {
        emptyArrayThree[three] = (three * 3).toString()
        for (element in emptyArrayThree) {
            println(element)
        }
    }

//    Задание 5: Работа с Nullable Элементами
//    Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.

    val arrayString = arrayOfNulls<String>(3)
    arrayString[0] = null
    arrayString[1] = "Second"
    arrayString[2] = "Third"

    println(arrayString.toList())

//    Задание 6: Копирование Массива
//    Создайте массив целых чисел и скопируйте его в новый массив в цикле.

    val origArray = intArrayOf(1, 2, 3, 4, 5)
    val copyArray = IntArray(origArray.size)
    for (i in origArray.indices) {
        copyArray[i] = origArray[i]
    }
    println(copyArray.toList())

//    Задание 7: Разница Двух Массивов
//    Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого.

    val firstArray = arrayListOf(10, 20, 30, 40)
    val secondArray = arrayListOf(50, 60, 70, 80)
    val emptyFourArray = Array(4) { 0 }
    for (i in emptyFourArray.indices) {
        emptyFourArray[i] = firstArray[i] - secondArray[i]

    }
    println(emptyFourArray.toList())

//    Задание 8: Поиск Индекса Элемента
//    Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, возвращаем -1. Реши задачу через цикл while.

    val searchArray = arrayListOf(1, 2, 3, 4, 5, 6)
    var index = -1
    var i = 0
    while (i < searchArray.size){
        if (searchArray[i] == 7){
            index = i
            break
        }
        i++
    }
    println(searchArray.toList())

//    Задание 9: Перебор Массива
//    Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль. Напротив каждого элемента должно быть написано “чётное” или “нечётное”.

    val array9 = intArrayOf(1, 2, 3, 4, 5)
    for (element in array9) {
        val type = if (element % 2 == 0) "чётное" else "нечётное"
        println("$element - $type")
    }

//    Задание 10: Поиск Значения в Массиве по вхождению
//    Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()). Верни найденный элемент из функции в виде строки.

    fun findSubstring(array: Array<String>, searchString: String): String? {
        for (element in array) {
            if (element.contains(searchString)) {
                return element
            }
        }
        return null
    }

// Пример использования
    val array10 = arrayOf("apple", "banana", "cherry")
    val result = findSubstring(array10, "ban")
    println(result)


}