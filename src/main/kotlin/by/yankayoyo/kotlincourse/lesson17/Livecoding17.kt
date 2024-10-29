//package by.yankayoyo.kotlincourse.lesson17
//
//class ExtractFirst(): Materials() {
//    fun extract(): String {
//        val extracted = extractMaterial()
//        if (extracted.isEmpty()) {
//            return ""
//        }
//        if (extracted.size == 1) {
//            return extracted[0]
//        }
//        for (i in 1 until extracted.size) {
//            addMaterial(extracted[i])
//        }
//        return extracted[0]
//    }
//}
//
//class ExtractLast(): Materials() {
//    fun extract(): String {
//        val extracted = extractMaterial()
//        if (extracted.isEmpty()) {
//            return ""
//        }
//        if (extracted.size == 1) {
//            return extracted[0]
//        }
//        for (i in 0 until extracted.size - 1) {
//            addMaterial(extracted[i])
//        }
//        return extracted.last()
//    }
//}
//
//fun main(){
//
//    val ordinalNumbers = listOf(
//        "first", "second", "third", "fourth", "fifth",
//        "sixth", "seventh", "eighth", "ninth", "tenth",
//        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
//        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
//    )
//
//}
