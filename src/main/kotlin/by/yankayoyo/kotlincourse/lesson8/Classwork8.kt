package by.yankayoyo.kotlincourse.lesson8

import by.yankayoyo.kotlincourse.lesson4.string

fun main() {

    val simpleString = "Это простая строка"

    val firstName = "Иван"
    val lastName = "Иванов"
    val fullName = "$firstName $lastName"

    val age1 = 30
    val greeting = "Привет! Меня зовут $fullName, и мне $age1 лет."


//    val person = Person("Алексей", 25)
//    val introduction = "Меня зовут $person.name, и мне ${person.age} лет."
//
//    val details = "Здесь находятся ${getDetails()}"

    val x = 10
    val y = 20
    val resultString = "Результат сложения x и y равен ${x + y}"
    println(resultString)

    val originalString = "Kotlin is fun"
    val subString = originalString.substring(7)
    val subString2 = originalString.substring(3, 6)
    val replacedString = originalString.replace("fun", "awesome")
    val words = originalString.split(" ")
    val length = "Hello".length
    val upper = "hello".uppercase()
    val lower = "hello".lowercase()
    val trimmed = "  hello  ".trim()
    val starts = "Kotlin".startsWith("Kot")
    val ends = "Kotlin".endsWith("lin")
    val contains = "Hello".contains("ell")
    val e: String? = null
    val empty = e.isNullOrEmpty()
    val blank = "  ".isNullOrBlank()
    val repeat = "ab".repeat(3)
    val letter = originalString[5]
    val indexOfChar = "Kotlin".indexOf('t')
    val indexOfWord = "Kotlin is the best language".indexOf("best")
    val backReverse = "niltoK".reversed()
    val multiLineString = """
    Первая строка
    Вторая строка
    Третья строка
""".trimIndent()

    val name = "Алексей"
    val city = "Москва"
    val age = 32
    val friendsCount = 1052
    val rating = 4.948
    val balance = 2534.75856
    val text = """
   Имя: %s
   Город: %s
   Возраст: %d
   Количество друзей: %,d
   Рейтинг пользователя: %.1f
   Баланс счета: $%,.2f
""".trimIndent()
    println(text.format(name, city, age, friendsCount, rating, balance))

    println(subString2)
}

fun convert(string: String): String {
    return when {
        string.startsWith("mistake", true) -> string.replace("mistake", "little mistake", true)
        string.endsWith("warning", true) -> "$string ... not critical"
        else -> ""
    }

    println(convert("Для завершения проекта важно"))

var text1 = "Kotlin: The Fun Way to Learn Programming"
    var text2 = "contact@example.com"
    var indexOfAt = text2.indexOf("@")

    var stringPhone = "123-456-7890"
   val split = stringPhone.split("-")
    println("XXX-XXX-${split[2]}")
}