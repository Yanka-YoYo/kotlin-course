package by.yankayoyo.by.yankayoyo.kotlincourse
                           //структура переменной:
val name: String  ="Alice" // val (неизменное значение); name (назваие переменной); : (отделяем название от типа переменной); String (класс тип  переменной "Строка"); = (символ присваивания); " " (пишем что присвоили всегла в "")

var age: Int = 30 // var (изменяемое значение); : (отделение); age (название); Int (мак, мин,  значения цифры целочисленные); = (присваиваем); 30 (значение)

const val PI:  = 3.14 // const val (значение известное на начало написания) используем для описания глобального и простого

lateinit var userInfo: String // lateinit var (обязательно с var инициализируется позже)

val lazyValue: String by Lazy { // lazyValue (инициализируется только после прямого обращения к ней)
"Hello, this is a lazy string"
}

var speed: Double? = null // Double? (? означает что переменная может быть null) (null это ничто, не имение сущесственного объекта)

val count: Int = 0
    get() = field // get получить set установить; field содержимое переменной count
    set(value) {
        if (value >= 0) field = value
        else field = 100
    }

fun countUp () {
    count = -1
}

val chassis: String = "12345abc"

var color: String = "Blue"

var distance: Double = 0.0

lateinit var owner: String

const val WHEELS: Int = 4

val report: String by Lazy{
    ""
}

var fuel: Double = 5.0
    get() = field
    set(value) {
        if (value > 0) field += value
    }
