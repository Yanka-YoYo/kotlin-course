package by.yankayoyo.kotlincourse.lesson15.homework15

//Покупка: Продукт Создайте дата класс для продукта, который будет представлять продукт в магазине.
// У него должны быть свойства “название”, “цена”, “количество”.

data class Product(val name: String = "Beer", val price: Double = 2.94, val quantity: Int = 220)