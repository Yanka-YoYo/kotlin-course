package by.yankayoyo.kotlincourse.lesson15.homework15

//Событие: Вечеринка Создайте класс Party, который описывает вечеринку. У него должны быть свойства location (String) и attendees (Int).
// Добавьте метод details(), который выводит информацию о месте проведения и количестве гостей.

class Party (
    val location: String,
    var attendees: Int
) {
    fun details() {
        println("The party will be held at $location, $attendees of guests are invited")
    }
}