package by.yankayoyo.kotlincourse.lesson15.classwork15

class Lamp(var isOn: Boolean) {

    fun switch() {
        isOn = !isOn
        println(isOn)
    }

}