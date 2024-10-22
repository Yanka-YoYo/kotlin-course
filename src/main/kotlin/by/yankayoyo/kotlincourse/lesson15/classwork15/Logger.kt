package by.yankayoyo.kotlincourse.lesson15.classwork15

object Logger {

    private var data = 0

    fun log(message: String) {
        println("Log: $message $data")
    }

    fun setData(data: Int) {
        Logger.data = data
    }
}