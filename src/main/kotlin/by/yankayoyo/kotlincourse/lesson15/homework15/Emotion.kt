package by.yankayoyo.kotlincourse.lesson15.homework15

//Аспект реальности: Эмоция Создайте класс Emotion, который представляет эмоцию. У него должно быть свойство type (String) и intensity (Int).
// Добавьте метод express(), который выводит описание эмоции в зависимости от её типа и интенсивности.

class Emotion(
    val type: String,
    var intensity: Int ) {
    fun express() {
        val intensityDescription = when (intensity) {
            in 1..3 -> "medium"
            in 4..6 -> "strong"
            in 7..9 -> "very strong"
            10 -> "incomprehensible"
            else -> "obscure"
        }
        println("Emotion: $type, Intensity: $intensityDescription")
    }
}
