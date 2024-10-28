package by.yankayoyo.kotlincourse.lesson15.homework15

//Мероприятие: Концерт Создайте класс, который будет представлять концерт.
// У него должны быть свойства “группа”, “место проведения”, “стоимость”, “вместимость зала”.
// Также приватное поле “проданные билеты”. Добавьте метод, который выводит информацию о концерте
// и метод “купить билет”, который увеличивает количество проданных билетов на один.

class Concert(
    val band: String,
    val location: String,
    val ticketPrice: Double,
    val capacity: Int,
) {
    private var soldTickets: Int = 0
    fun info(){
        println("The '$band' concert will be held at $location. " +
                "The ticket price is $ticketPrice BYN. " +
                "The capacity of the " + " $capacity of the hall. " +
                "Already sold $soldTickets of tickets")
    }

    fun buyTicket() {
        if(soldTickets < capacity ) {
            soldTickets++
        } else {
            println("Sold out!")
        }
    }
}