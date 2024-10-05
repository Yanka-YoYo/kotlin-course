package by.yankayoyo.kotlincourse.lesson9

import java.time.LocalDate


fun main() {
    val name = "Александр"
    val message = "С Днем Рождения! Успехов во всех начинаниях и продолжениях! Только вперед!!!"
    val emojiPack = "🎉🎂🎀💗🥳"
    val dateBirthday = LocalDate.parse("2024-10-02")
    val today = LocalDate.now()

    if (today == dateBirthday) {
            val fullMessage = "Дорогой $name, $message $emojiPack"
            println(fullMessage)
    } else {
        println("К сожалению, сегодня не твой день рождения.")
    }
}