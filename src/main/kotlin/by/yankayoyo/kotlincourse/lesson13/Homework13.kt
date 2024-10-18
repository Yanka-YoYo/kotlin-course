package by.yankayoyo.kotlincourse.lesson13

fun main(){


}

//1. Предварительные задачи на использование методов.
//Подбери подходящий для задачи метод
//Задачи на приведение коллекций к значению
//isNotEmpty
//getOrElse
//joinToString
//firstOrNull
//size
//isEmpty
//minOrNull
//contains
//sum
//average
//maxOrNull
//
//Проверить, что размер коллекции больше 5 элементов.
//Проверить, что коллекция пустая
//Проверить, что коллекция не пустая
//Взять элемент по индексу или создать значение если индекса не существует
//Собрать коллекцию в строку
//Посчитать сумму всех значений
//Посчитать среднее
//Взять максимальное число
//Взять минимальное число
//Взять первое число или null
//Проверить что коллекция содержит элемент
//
//Задачи на обработку коллекций
//sorted
//groupBy
//distinct
//take
//takeLast
//filter
//filterNot
//map
//associate
//sortedDescending
//forEach
//filterNotNull
//
//Отфильтровать коллекцию по диапазону 18-30
//Выбрать числа, которые не делятся на 2 и 3 одновременно
//Очистить текстовую коллекцию от null элементов
//Преобразовать текстовую коллекцию в коллекцию длин слов
//Преобразовать текстовую коллекцию в мапу, где ключи - слова, а значения - перевёрнутые слова
//Отсортировать список в алфавитном порядке
//Отсортировать список по убыванию
//Распечатать квадраты элементов списка
//Группировать список по первой букве слов
//Очистить список от дублей
//Взять первые 3 элемента списка
//Взять последние 3 элемента списка
//
//Задание 2: Характеристика числовой коллекции
//Написать метод, который принимает коллекцию чисел и возвращает строку с текущим состоянием коллекции используя конструкцию when
//Если коллекция пустая - “Пусто”
//Если количество элементов меньше пяти - “Короткая”
//Если коллекция начинается с 0 - “Стартовая”
//Если сумма всех чисел больше 10000 - “Массивная”
//Если среднее значение равно 10 - “Сбалансированная”
//Если длина строки образованная склеиванием коллекции в строку равна 20 - “Клейкая”
//Если максимальное число меньше -10 - “Отрицательная”
//Если минимальное число больше 1000 - “Положительная”
//Если содержит одновременно числа 3 и 14 - “Пи***тая”
//Иначе - “Уникальная”
//
//Вызвать метод с данными, подходящими под каждую из веток
//
//Задание 3: Анализ Учебных Оценок
//Начальные значения: val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
//Цель: Отфильтровать удовлетворительные оценки (>=60), отсортировать оставшиеся по возрастанию и взять первые 3.
//
//Задание 4: Создание каталога по первой букве.
//Начальные значения: val list = listOf(
//    "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка"
//)
//Цель: Привести все слова в списке к нижнему регистру, сгруппировать в каталог по первой букве.
//
//Задание 5: Подсчёт средней длины слов в списке.
//Начальные значения из задачи 3.
//Цель: Перевести все слова в количество букв, подсчитать среднее значение. Вывести форматированный текст с двумя знаками после запятой.
//
//Задание 6: Категоризация чисел.
//Начальные значения: val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
//Цель: Отобрать уникальные числа, отсортировать по убыванию и сгруппировать по четности (“четные” и “нечетные”).
//
//Задание 7: Поиск первого подходящего элемента
//Начальные значения: val ages = listOf(22, 18, 30, 45, 17, null, 60)
//Цель: Найти первый возраст в списке, который соответствует условию (больше 18), преобразовать его к строке, или вернуть сообщение "Подходящий возраст не найден".
