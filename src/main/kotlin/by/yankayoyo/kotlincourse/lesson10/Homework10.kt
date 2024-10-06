package by.yankayoyo.kotlincourse.lesson10

fun main() {

//    Задание 1: Создание и Инициализация Массива
//    Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.

    val arrayNumbs: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    println(arrayNumbs)

//    Задание 2: Создание Пустого Массива
//    Создайте пустой массив строк размером 10 элементов.

    val emptyArray = Array(10) { 0 }

    println(emptyArray)

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

    val firstArray = arrayOf(10, 20, 30, 40)
    val secondArray = arrayOf(50, 60, 70, 80)
    val emptyFourArray = Array(4) { 0 }
    for (i in emptyFourArray.indices) {
        emptyFourArray[i] = firstArray[i] - secondArray[i]

    }

    println(emptyFourArray.toList())

//    Задание 8: Поиск Индекса Элемента
//    Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, возвращаем -1. Реши задачу через цикл while.

    val searchArray = arrayOf(1, 2, 3, 4, 5, 6)
    var index = -1
    var i = 0
    while (i < searchArray.size) {
        if (searchArray[i] == 7) {
            index = i
            break
        }
        i++
    }

    println(searchArray.toList())

//    Задание 9: Перебор Массива
//    Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль. Напротив каждого элемента должно быть написано “чётное” или “нечётное”.

    val arrayOddEven = intArrayOf(1, 2, 3, 4, 5)
    for (element in arrayOddEven) {
        val type = if (element % 2 == 0) "Odd" else "Even"

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

//    Задание 1: Создание Пустого Списка
//    Создайте пустой неизменяемый список целых чисел.

    val emptyList: List<Int> = listOf()

//    Задание 2: Создание и Инициализация Списка
//    Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").

    val readList: List<String> = listOf("Hello", "World", "Kotlin")

    println(readList)

//    Задание 3: Создание Изменяемого Списка
//    Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.

    val mutableList: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    println(mutableList)

//    Задание 4: Добавление Элементов в Список
//    Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).

    mutableList.add(6)
    mutableList.add(7)
    mutableList.add(8)

    println(mutableList)

//    Задание 5: Удаление Элементов из Списка
//    Имея изменяемый список строк, удалите из него определенный элемент (например, "World").

    val mutableReadList: MutableList<String> = mutableListOf("Hello", "World", "Kotlin")
    mutableReadList.remove("World")

    println(mutableReadList)

//    Задание 6: Перебор Списка в Цикле
//    Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.

    val numbList = listOf(1, 2, 3, 4, 5)
    for (numb in numbList) {

        println(numb)
    }

//    Задание 7: Получение Элементов Списка по Индексу
//    Создайте список строк и получите из него второй элемент, используя его индекс.

    val stringList = listOf("A", "B", "C", "D")
    val secondElement = stringList[1]

    println(secondElement)

//    Задание 8: Перезапись Элементов Списка по Индексу
//    Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент на позиции 2 на новое значение).

    mutableList[2] = 10

    println(mutableList)

//    Задание 9: Объединение Двух Списков
//    Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с помощью циклов.

    val firstStringList = listOf("A", "B", "C")
    val secondStringList = listOf("D", "E", "F")
    val thirdStringList = mutableListOf<String>()

    for (assoc in firstStringList) {
        thirdStringList.add(assoc)
    }
    for (assoc in secondStringList) {
        thirdStringList.add(assoc)
    }

    println(thirdStringList)

//    Задание 10: Нахождение Минимального/Максимального Элемента
//    Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.

    val wholeNumbList = listOf(1, 2, 5, 6, 9, 10)
    var min = wholeNumbList[0]
    var max = wholeNumbList[0]

    for (number in wholeNumbList) {
        if (number < min) min = number
        if (number > max) max = number
    }

    println("Min: $min, Max: $max")


//    Задание 11: Фильтрация Списка
//    Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.

    val oddWholeNumbList: MutableList<Int> = mutableListOf()
    for (number in wholeNumbList) {
        if (number % 2 == 0)
            oddWholeNumbList.add(number)
    }

    println(oddWholeNumbList)

//    Задание 1: Создание Пустого Множества
//    Создайте пустое неизменяемое множество целых чисел.

    val emptySet = setOf<Int>()

//    Задание 2: Создание и Инициализация Множества
//    Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).

    val mutableSet: MutableSet<Int> = mutableSetOf(1, 2, 3)

    println(mutableSet)

//    Задание 3: Создание Изменяемого Множества
//    Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").

    val mutableSetString: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")

    println(mutableSetString)

//    Задание 4: Добавление Элементов в Множество
//    Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").

    mutableSetString.add("Swift")
    mutableSetString.add("Go")

    println(mutableSetString)

//    Задание 5: Удаление Элементов из Множества
//    Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).

    mutableSet.remove(2)

    println(mutableSet)

//    Задание 6: Перебор Множества в Цикле
//    Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.

    val wholeNumbSet = setOf(10,20,30,40,50)
    for (number in wholeNumbSet){
        println(number)
    }

//    Задание 7: Проверка Наличия Элемента в Множестве
//    Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка. Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.

    fun finderElement (set: Set<String>, element: String): Boolean {
        for (item in set){
            if (item == element){
                return true
            }
        }
        return false
    }

//    Задание 8: Объединение Двух Множеств
//    Создайте два множества строк и объедините их в одно новое множество, содержащее все уникальные элементы обоих множеств. Реши задачу с помощью циклов.

    val firstStringSet = setOf("Kotlin", "is", "cool")
    val secondStringSet = setOf("Homework 8", "is", "hard")
    val thirdStringSet = mutableSetOf<String>()

    for (combi in firstStringSet) {
        thirdStringSet.addAll(firstStringSet)
    }
    for (combi in secondStringSet) {
        thirdStringList.addAll(secondStringSet)
    }

    println(thirdStringSet)

//    Задание 9: Нахождение Пересечения Множеств
//    Создайте два множества целых чисел и найдите их пересечение (общие элементы). Реши задачу через вложенные циклы.

    val setA: Set<Int> = setOf(1, 2, 3, 4)
    val setB: Set<Int> = setOf(3, 4, 5, 6)
    val intersectionSet: MutableSet<Int> = mutableSetOf()
    for (itemA in setA) {
        for (itemB in setB) {
            if (itemA == itemB) {
                intersectionSet.add(itemA)
            }
        }
    }

    println(intersectionSet)

//    Задание 10: Нахождение Разности Множеств
//    Создайте два множества строк и найдите разность первого множества относительно второго (элементы, присутствующие в первом множестве, но отсутствующие во втором). Реши задачу через вложенные циклы и переменные флаги.

    val setX: Set<String> = setOf("Kotlin", "Java", "Scala")
    val setY: Set<String> = setOf("Java", "Go")
    val differenceSet: MutableSet<String> = mutableSetOf()
    for (itemX in setX) {
        var found = false
        for (itemY in setY) {
            if (itemX == itemY) {
                found = true
                break
            }
        }
        if (!found) {
            differenceSet.add(itemX)
        }
    }

    println(differenceSet)

//    Задание 11: Конвертация Множества в Список
//    Создайте множество строк и конвертируйте его в список с использованием цикла.

    val stringSetToConvert: Set<String> = setOf("Kotlin", "is", "cool")
    val convertedList: MutableList<String> = mutableListOf()
    for (item in stringSetToConvert) {
        convertedList.add(item)
    }

println(convertedList)

}