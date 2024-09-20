package by.yankayoyo.kotlincourse.lesson5

fun main () {

    printRes (100.0, null)
    printRes (100.0, 1.0)
    printSoundIntensity(initialSoundIntensity = 99.1, attentCoeff = null)
    printFullPrice(priceCargo = null)
    dataVerification(temperature = null, humidity = null, airPressure = 735)
    dataVerification1(temperature1 = null, humidity1 = null, airPressure1 = null)
    dataVerification2(temperature2 = null, humidity2 = null, airPressure2 = null)
}

fun printRes(sound: Double, knownKf: Double?) {

var defaultKf: Double = 0.5

    println((knownKf ?: defaultKf) * sound)
}

fun printSoundIntensity(initialSoundIntensity: Double, attentCoeff: Double?){
    var soundIntensity = (initialSoundIntensity * (attentCoeff ?: 0.5))
    println(soundIntensity)
}

fun printFullPrice(priceCargo: Double?) {
    var fullPrice = ((0.5 / 100) * (priceCargo ?: 50.0)) + (priceCargo ?: 50.0)
    println(fullPrice)
}

fun dataVerification(temperature: Int?, humidity: Int?, airPressure: Int?){
    airPressure ?: throw Exception("Ты потерял давление!")
}

fun dataVerification1(temperature1: Int?, humidity1: Int?, airPressure1: Int?){
    if (airPressure1 == null) {
        println("Ты потерял давление!")
    }
}

fun dataVerification2(temperature2: Int?, humidity2: Int?, airPressure2: Int?){
    if (airPressure2 ?: -1 == -1) {
        println("Ты потерял давление!")
    }
}




