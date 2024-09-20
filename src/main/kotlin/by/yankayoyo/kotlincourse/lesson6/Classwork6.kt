package by.yankayoyo.kotlincourse.lesson6

// intRange // ot i do vkluchitelno
// intRangeUntil // ot i do ne vkl poslednee
// eti 2 // vsegda ot menshego k bolshemu
// downTo // ot bolshego k menshemu
// charRange // lkz cbvdjkjd
// when (vznachenie) {
       // in (virazhenie1) -> {*cod*}
       // in (virazenie 2) => {*cod*}
       // ...
      // else -> printLn ("")

fun main () {
}

fun checkPass (password : String) : Boolean {

    // if (password.length <= 8 ) return false

    // if (checkSymbols(password)) return true

    // return false

    return checkSymbols(password)

}

fun checkSymbols (password: String) : Boolean {

    return false
}

fun convertMark(mark: Int): String{

    val result = when (mark){
        in 0 .. 20 -> "F"
        in 21 .. 40 -> "E"
        in 41 .. 60 -> "D"
        in 61 .. 80 -> "C"
        in 81 .. 90 -> "B"
        in 91 .. 100 -> "A"
        else -> "Invalid mark"
    }
 return result

}