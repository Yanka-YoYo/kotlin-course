package by.yankayoyo.by.yankayoyo.kotlincourse

val name: String  ="Alice"

var age: Int = 30

const val PI:  = 3.14

lateinit var userInfo: String

val LazyValue: String by Lazy {

}

var speed: Double? = null

val count: Int = 0
    get() = field
    set(value) {
        if (value >= 0) field = value
        else field - 100
    }

val chassis: String = "12345abc"

var colour: String = "Blue"

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
