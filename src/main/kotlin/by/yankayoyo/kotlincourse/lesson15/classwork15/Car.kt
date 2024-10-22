package by.yankayoyo.kotlincourse.lesson15.classwork15

class Car(
    val brand: String,
    val model: String,
) {
    companion object {
        val brandList = listOf ("Audi", "VW", "BMW")
    }

    fun nameCar() {
        println("I am $brand and my model is $model")
    }
}