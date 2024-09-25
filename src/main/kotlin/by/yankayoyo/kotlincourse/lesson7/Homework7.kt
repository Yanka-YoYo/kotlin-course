package by.yankayoyo.kotlincourse.lesson7

fun main () {

    for (i in 1..5) {
        println(i)
    }

    for (i in 1..10) {
        if (i % 2 == 0)
            println(i)
    }

    for (i in 5 downTo 1) {
        println(i)
    }

    for (i in 10 downTo 1) {
        println(i - 2)
    }

    for (i in 1..9 step 2) {
        println(i)
    }

    for (i in 1..20 step 3) {
        println(i)
    }

    for (i in 1 until 9) {
        println(i)
    }

    for (i in 3 until 15) {
        println(i)
    }

    var cube = 0
    while (cube++ < 5) {
        println(cube * cube)
    }

    var i = 10
    while (i-- >= 5) {
        println(i)

    }

    var number = 5
    do {
        println(i)
    } while (i-- > 1)

    var counter = 5
    do {
        println(counter)
    }while (++counter < 10)


}

