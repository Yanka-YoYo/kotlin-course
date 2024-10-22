package by.yankayoyo.kotlincourse.lesson15.classwork15

class Wind(val speed: Int) {

    fun convertSpeed(): Int {
        return (speed * 1000) / 3600
    }

}