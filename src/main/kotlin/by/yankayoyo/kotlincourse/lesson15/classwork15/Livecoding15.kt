package by.yankayoyo.kotlincourse.lesson15.classwork15

fun main(){

    var lamp1 = Lamp(true)
    lamp1.switch()

    var wind = Wind(10)
    println(wind.convertSpeed())

    var car1 = Car(Car.brandList[3], "M5")
    car1.nameCar()
}