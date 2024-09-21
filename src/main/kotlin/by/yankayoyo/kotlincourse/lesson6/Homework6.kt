package by.yankayoyo.kotlincourse.lesson6
fun main () {

    println(seasonsYear(4))
    println(petAge(5))
    println(transType(10.0))
    println(bonus(10500.0))
    println(docType("txt"))
    println(convertTemp(0,"F"))
    println(clothingWeather(25))
    println(movie(22))

}


fun seasonsYear(mounth: Int):String {

        return when (mounth) {

            in 1..2 , 12 -> "Winter"
            in 3..5 -> "Spring"
            in 6..8 -> "Summer"
            in 9..11 -> "Fall"
            else -> "Invalid Season"

        }

    }

fun petAge (age: Int): Double {
    return if (age in 0 .. 2 ){
        age * 10.5
    } else
        (2 * 10.5) + ((age - 2) * 4)

}

fun transType(distance: Double): String {
    return if (distance < 1) {
        "Walk"
    } else if (distance in 1.0..5.0){
        "Bike"
    }else "Auto"

}

fun bonus (purchase: Double): Double {
    return if (purchase <= 1000.0) {
        (purchase / 100) * 2
    } else 10 + ((purchase - 1000.0) / 100) * 5

}

fun docType(type: String): String {
    return when(type) {
        in "txt","doc","docx" -> "Text document"
        in "jpg","png","bmp","gif" -> "Image"
        in "xls","xlsx" -> "Table"
        else -> "Unknown type"

    }

}

fun convertTemp(value: Int, unit: String): String {
    return if (unit == "C") {
        "${(value * 1.8) + 32} F"
    } else {
        "${(value - 32) / 1.8} C"

    }

}

fun clothingWeather(temperature: Int): String {
    return when(temperature) {
        in -30..-1 -> "Warm jacket, hat, gloves"
        in 0..14 -> "Light jacket"
        in 15..34 -> "T-Shirt, shorts"
        else -> "Stay at home"
    }

}

fun movie(age: Int): String {
    return when(age) {
        in 0..10 -> "Children's"
        in 11..18 -> "Teenagers"
        else -> "All movies"
    }

}





