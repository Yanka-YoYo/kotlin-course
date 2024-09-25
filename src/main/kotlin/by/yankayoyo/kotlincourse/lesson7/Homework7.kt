package by.yankayoyo.kotlincourse.lesson7

fun main () {

    //Напишите цикл for, который выводит числа от 1 до 5.
    for (i in 1..5) {
        println(i)
    }

    //Напишите цикл for, который выводит четные числа от 1 до 10.
    for (i in 1..10) {
        if (i % 2 == 0)
            println(i)
    }

    //Создайте цикл for, который выводит числа от 5 до 1.
    for (i in 5 downTo 1) {
        println(i)
    }

    //Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
    for (i in 10 downTo 1) {
        println(i - 2)
    }

    //Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
    for (i in 1..9 step 2) {
        println(i)
    }

    //Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
    for (i in 1..20 step 3) {
        println(i)
    }

    //Используйте цикл for и until, чтобы вывести числа из диапазона 1-9 (9 не включается).
    for (i in 1 until 9) {
        println(i)
    }

    //Напишите цикл for с until, чтобы вывести числа от 3 до 15, не включая 15.
    for (i in 3 until 15) {
        println(i)
    }

    //Создайте цикл while, который выводит квадраты чисел от 1 до 5.
    var cube = 0
    while (cube++ < 5) {
        println(cube * cube)
    }

    //Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
    var i = 10
    while (i-- >= 5) {
        println(i)
    }

    //Используйте цикл do...while, чтобы вывести числа от 5 до 1.
    var number = 5
    do {
        println(i)
    } while (i-- > 1)

    //Создайте цикл do...while, который повторяется, пока счетчик меньше 10, начиная с 5.
    var counter = 5
    do {
        println(counter)
    }while (++counter < 10)

    //Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
var start = 0
    while (start++ < 10) {
        println(start)
    }



    //В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.


    //Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.


    //Создать цикл в цикле, в каждом использовать диапазон от 1 до 10. В консоль вывести результат умножения переменных цикла.
    //Результат умножения выводить через print() и добавлять ещё один print(“ ”) с пробелом, чтобы отделять значения в строку.
    //После вложенного цикла выводить пустой println() чтобы следующий проход начинать с новой строки. Результат должен быть как на картинке.
}

