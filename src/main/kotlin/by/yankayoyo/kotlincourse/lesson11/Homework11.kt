package by.yankayoyo.kotlincourse.lesson11

import by.yankayoyo.kotlincourse.lesson4.keysToValues
import java.util.Date

fun main() {

//    Задание 1: Создание Пустого Словаря
//    Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.

    val emptyMap = mapOf<Int, Int>()

//    Задание 2: Создание и Инициализация Словаря
//    Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double

    val floatDoubleMap = mapOf(1.1F to 1.0, 2.2F to 2.0)

//    Задание 3: Создание Изменяемого Словаря
//    Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.

    val mutableIntStringMap = mutableMapOf<Int, String>()

//    Задание 4: Добавление Элементов в Словарь
//    Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".

    mutableIntStringMap[1] = "One"
    mutableIntStringMap[2] = "Two"
    mutableIntStringMap[3] = "Three"

    println(mutableIntStringMap)

//    Задание 5: Получение Значений из Словаря
//    Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить значение с ключом, которого в словаре нет.

    println(mutableIntStringMap[1])
    println(mutableIntStringMap[4])

//    Задание 6: Удаление Элементов из Словаря
//    Удалите определенный элемент из изменяемого словаря по его ключу.

    mutableIntStringMap.remove(1)

    println(mutableIntStringMap)

//    Задание 7: Перебор Словаря в Цикле
//    Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение. Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)

    val doubleIntMap = mapOf(10 to 3, 20 to 0, 30 to 4, 40 to 6)
    for ((key, value) in doubleIntMap) {
        val result = if (value != 0) key / value
        else "Infinity"

        println(result)
    }

//    Задание 8: Перезапись Элементов Словаря
//    Измените значение для существующего ключа в изменяемом словаре.

    mutableIntStringMap[1] = "OneUp"

    println(mutableIntStringMap)

//    Задание 9: Сложение Двух Словарей
//    Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.

    val oneMap = mapOf(1 to "a", 2 to "c", 3 to "d")
    val secondMap = mapOf(4 to "e", 5 to "f", 6 to "g")
    val mutableThreeMap = mutableMapOf<Int, String>()
    for ((key, value) in oneMap) {
        mutableThreeMap[key] = value
    }
    for ((key, value) in secondMap) {
        mutableThreeMap[key] = value
    }

    println(mutableThreeMap)

//    Задание 10: Словарь с Сложными Типами
//    Создайте словарь, где ключами являются строки, а значениями - списки целых чисел. Добавьте несколько элементов в этот словарь.

    val mutableComplexMap = mutableMapOf<String, List<Int>>(
        "Odd" to listOf(1, 3, 5),
        "Even" to listOf(2, 4, 6)
    )

    mutableComplexMap["Negative"] = listOf(-1, -2, -3)

    println(mutableComplexMap)

//    Задание 11: Использование Множества в Качестве Значения
//    Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк. Добавь данные в словарь.
//    Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку. Распечатай полученное множество.

    val mutableCombiMap = mutableMapOf<Int, MutableSet<String>>(
        1 to mutableSetOf("One", "Адзін", "Один"),
        2 to mutableSetOf("Two", "Два", "Два"),
        3 to mutableSetOf("Three", "Тры", "Три")
    )
    println(mutableCombiMap[1])

    mutableCombiMap[4] = mutableSetOf("Four", "Чатыры", "Четыре")

    println(mutableCombiMap[4])

//    Задание 12: Поиск Элемента по Значению
//    Создай словарь, где ключами будут пары чисел.
//    Через перебор найди значение у которого пара будет содержать цифру 5 в качестве первого или второго значения.

    val pairMap = mapOf<Pair<Int, Int>, String>(
        Pair(1, 4) to "Value1",
        Pair(2, 5) to "Value2",
        Pair(5, 6) to "Value3"
    )
    for ((key, value) in pairMap) {
        if (key.first == 5 || key.second == 5) {
            println("$value for: $key")
        }
    }

//    Напиши решения задач. В каждом случае нужно проанализировать и подобрать оптимальный тип словаря.
//    Задание 6: Словарь Библиотека
//    Ключи - автор книги, значения - список книг

    val library = mutableMapOf<String, MutableList<String>>()

//    Задание 12: Справочник Растений
//    Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений

    val handbookPlants = mapOf<String, List<String>>()

//    Задание 8: Четвертьфинала
//    Ключи - названия спортивных команд, значения - списки игроков каждой команды

    val quarterfinal = mutableMapOf<Pair<String,String>, MutableList<String>>()

//    Задание 9: Курс лечения
//    Ключи - даты, значения - список препаратов принимаемых в дату

    val course = mutableMapOf<MutableList<Int>, MutableSet<String>>()

//    Задание 10: Словарь Путешественника
//    Ключи - страны, значения - словари из городов со списком интересных мест.

    val dictionary = mutableMapOf<String, MutableMap<String, List<String>>>()

}