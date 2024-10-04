package by.yankayoyo.kotlincourse.lesson8

fun main () {


    println(convert("Это невозможно выполнить за один день."))
    println(convert("Я не уверен в успехе этого проекта."))
    println(convert("Произошла катастрофа на сервере."))
    println(convert("Этот код работает без проблем."))
    println(convert("Удача"))
    println(message = "Task 1")
    println(dateTime("Пользователь вошел в систему -> 2021-12-01 09:48:23"))
    println(message = "Task 2")
    println(creditCard("4539 1488 0343 6467"))
    println(message = "Task 3")
    println(emailFormat("username@example.com"))
    println(message = "Task 4")
    println(filePath("C:/Пользователи/Документы/report.txt"))
    println(message = "Task 5")
    println(shortFormat("Объектно-ориентированное программирование"))
    println(multiplyTable(1, 9))

}

fun convert(phrase: String): String{
    return when{
        phrase.contains("невозможно", true) -> phrase.replace("невозможно", "совершенно точно возможно, просто требует времени")
        phrase.startsWith("Я не уверен", true) -> "${phrase.trim('.')}, но моя интуиция говорит об обратном."
        phrase.contains("катастрофа", true) -> phrase.replace("катастрофа", "интересное событие")
        phrase.endsWith("без проблем.",true) -> phrase.replace("без проблем", "с парой интересных вызовов по пути")
        !phrase.contains(" ") -> "Иногда, ${phrase.lowercase()}, но не всегда"
        else -> ""
    }
}
//Задание 1: Извлечение Даты из Строки Лога. Используй indexOf или split для получения правой части сообщения.
//Описание: У вас есть строка лога вида "Пользователь вошел в систему -> 2021-12-01 09:48:23". Извлеките отдельно дату и время из этой строки и сразу распечатай их по очереди.

fun dateTime(login: String) {
    val time = login.split(" ")
    return println("${time[5]}\n${time[6]}")
}

//Задание 2: Маскирование Личных Данных
//Описание: Дана строка с номером кредитной карты "4539 1488 0343 6467". Замаскируйте все цифры, кроме последних четырех, символами "*".
fun creditCard(number: String) {
    val secretNumber = number.split(" ")
    return println("**** **** **** ${secretNumber[3]}")
}

//Задание 3: Форматирование Адреса Электронной Почты. Используй replace
//Описание: У вас есть электронный адрес "username@example.com". Преобразуйте его в строку "username [at] example [dot] com".
fun emailFormat(email: String) {
    val newEmail = email.replace("@", " [at] ").replace(".", " [dot] ")
    return println(newEmail)
}

//Задание 4: Извлечение Имени Файла из Пути
//Описание: Дан путь к файлу "C:/Пользователи/Документы/report.txt". Извлеките название файла с расширением.
fun filePath(path: String){
    val namePath = path.split("/")
    return println(namePath.last())
}

//Задание 5: Создание Аббревиатуры из Фразы. Используй split с набором символов для разделения. Используй for для перебора слов. Используй var переменную для накопления первых букв.
//Описание: У вас есть фраза, например "Объектно-ориентированное программирование". Создайте аббревиатуру из начальных букв слов (например, "ООП").
fun shortFormat(phrase1: String): String {
    val shortList = phrase1.split(' ', '-')
    var shortPhrase = ""
    for (j in shortList.indices) { //for (i in 0 until abbrList.length)
        shortPhrase += (shortList[j][0].uppercase())
    }
    return shortPhrase
}

fun multiplyTable(first: Int, second: Int) {
    val formatLength = (first * second).toString().length + 1
    print(" ".repeat(formatLength))

    val xRange = getRange(first)
    val yRange = getRange(second)
    val formatter = "%${formatLength}s"
    for (i in xRange) {
        print(formatter.format("$i"))
    }
    println()
    for (i in yRange) {
        print(formatter.format("$i"))
        for (j in xRange) {
            print(formatter.format("${i * j}"))
        }
        println()
    }
}

private fun getRange(size: Int): IntProgression {
    return when {
        size > 0 -> 1..size
        size < 0 -> -1 downTo size
        else -> throw IllegalArgumentException("Неверное значение size")
    }
}