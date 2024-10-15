package by.yankayoyo.kotlincourse.lesson13

fun main(){

    val numbers = listOf(1,2,3,4)
    if (numbers.size < 5){
        println("OK")
    }
    numbers.isEmpty()
    numbers.isNotEmpty()

    val defaultValue = numbers.getOrElse(3){ it }

    println(defaultValue)

    val armyYears = listOf(17, 18, 29, 31)
    println(armyYears.filter { it in 18..35 })

}