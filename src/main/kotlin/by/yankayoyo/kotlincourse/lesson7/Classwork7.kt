package by.yankayoyo.kotlincourse.lesson7

fun main() {
    for (item in 1 .. 10 step 2) {
        println(item)
    }

    for (i in 1..10) {
        println(i)
    }

    for (i in 10 downTo 1) {
        println(i)
    }

    for (i in 1 until 10) {
        println(i)
    }

val range = 1..30
    for (i in range) {
        println(i)
    }

    var counter = 10
    while (counter-- > 0) {
        println(counter)
    }

    do {
        println("+")
    } while (false)

//    for (i3 in 1..10 {
  //      if (i3 == 2) continue
    //    if (i3 == 7) break
      //  printLn(i3)
    //}

    for (item2 in 1..10) {
        println(item2)
    }

    for (i in 1..5) {
       println(i*i)
    }

    for (i in 10 downTo 1) {
        println(i)
    }

for (i in 20 downTo 2) {
    if (i % 2 == 0) {
        println(i)
    }
}

    for (i in 1..30 step 3) {
        println(i)
    }

    var count = 1
    var sum = 0
    while ((count++) + count <= 10) {
        sum += count++
    }
    println(sum)

}




