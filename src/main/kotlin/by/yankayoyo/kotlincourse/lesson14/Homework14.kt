package by.yankayoyo.kotlincourse.lesson14

fun main() {

    //1 Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах.
    // Определите среднее время выполнения теста.

    val testTime = mapOf<String, Int>("first" to 10, "second" to 11, "third" to 12)
    println(testTime.values.average())


    //2 Имеется словарь с метаданными автоматизированных тестов,
    // где ключи — это имена тестовых методов\
    // а значения - строка с метаданными.
    // Выведите список всех тестовых методов.

    val testMetaData = mutableMapOf<String, String>("test2" to "metadata", "test2" to "metadata2")
    println(testMetaData.keys.toList())


    //3 В изменяемый словарь с данными о прохождении тестов добавьте
    // новый тест и его результат.

    val testResult = mutableMapOf("test1" to "done", "test2" to "notdone")
    testResult += "test3" to "done"
    println(testResult)


    //4 Посчитайте количество успешных тестов в словаре с результатами.

    println(testResult.count { it.value == "done" })


    //5 Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен.

    val bugTracking = mutableMapOf<String, String>()
    bugTracking.remove("done")

    //6 Для словаря с результатами тестирования веб-страниц
    // (ключ — URL страницы, значение — статус ответа),
    // выведите сообщение о странице и статусе её проверки

    val pageStatus = mapOf("http://example.com" to "checked", "http://test.com" to "unchecked")
    pageStatus.forEach { (url, status) ->
        println("Страница $url имеет статус проверки: $status")
    }

    //7 Найдите в словаре с названием и временем ответа сервисов только те,
    // время ответа которых превышает заданный порог.

    val serviceTimes = mapOf("google" to 100, "yandex" to 200, "yahoo" to 300)
    println(serviceTimes.filterValues { it > 100 })

    //8 В словаре хранятся результаты тестирования API
    // (ключ — endpoint, значение — статус ответа в строке).
    // Для указанного endpoint найдите статус ответа,
    // если endpoint отсутствует, предположите, что он не был протестирован.

    val apiResults = mapOf("endpoint1" to "200 OK", "endpoint2" to "404 Not Found")
    val endpoint = "endpoint3"
    val status = apiResults.getOrElse(endpoint) { "not tested" }
    println("Статус ответа для $endpoint: $status")

    //9 Из словаря, содержащего конфигурации тестового окружения
    // (ключ — название параметра конфигурации),
    // получите значение для "browserType". Ответ не может быть null.

    val config = mapOf<String, String >()
    println(config.getOrElse("browserType") { println("Default Browser")})

    //10 Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО,
    // чтобы добавить новую версию.

    val version = mapOf<String, String>()
    val versionMutable = version.toMutableMap()


    //11 Используя словарь с настройками тестирования для различных мобильных устройств
    // (ключ — модель устройства),
    // получите настройки для конкретной модели или верните настройки по умолчанию.

    val deviceSettings = mapOf("iPhone" to "iOS", "Pixel" to "Android")
    val model = "Galaxy"
    val settings = deviceSettings.getOrDefault(model, "default settings")
    println("Настройки для $model: $settings")

    //12 Проверьте, содержит ли словарь с ошибками тестирования
    // (код и описание) определенный код ошибки.

    val errorCode = mapOf<Int, String>()
    println(errorCode.containsKey(404))


    //13 Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version",
   // а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped").
    // Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов.

    val testScripts = mapOf<String, String>()
    val testScriptsFiltered = testScripts.filterValues { it == "Passed" }

//14 У вас есть словарь, где ключи — это названия функциональных модулей приложения,а значения — результаты их тестирования.
//    Проверьте, есть ли модули с неудачным тестированием.

    val modulesTest = mapOf<String, String>()
    println(modulesTest.all { it.value == "Failed" })


//15 Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.

    val setupTests = mutableMapOf<String, String>()
    setupTests.putAll(config)

//16 Объедините два неизменяемых словаря с данными о багах.

    val bugs1 = mapOf("bug1" to "open", "bug2" to "fixed")
    val bugs2 = mapOf("bug3" to "open", "bug4" to "fixed")
    val combinedBugs = bugs1 + bugs2
    println("Объединенные данные о багах: $combinedBugs")

//17 Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.

    val tempData = mutableMapOf("test1" to "running", "test2" to "completed")
    tempData.clear()
    println("Очищенные временные данные: $tempData")

//18 Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”)

    val testReport = mapOf("test1" to "passed", "test2" to "skipped", "test3" to "failed")
    val filteredReport = testReport.filterValues { it != "skipped" }
    println("Отчет без пропущенных тестов: $filteredReport")

//19 Удалите из словаря с конфигурациями тестирования набор устаревших конфигураций.Создайте отчет о тестировании,
//преобразовав словарь с результатами тестирования (ключ — идентификатор теста, значение — результат) в список строк
//формата "Test ID: результат".

    val testConfigs = mutableMapOf("config1" to "active", "config2" to "deprecated")
    testConfigs.entries.removeIf { it.value == "deprecated" }
    println("Обновленные конфигурации: $testConfigs")

//20 Создайте отчет о тестировании, преобразовав словарь с результатами тестирования
//    (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".

    val testResults = mapOf("test1" to "passed", "test2" to "failed")
    val report = testResults.map { (id, result) -> "Test ID: $id, результат: $result" }
    println("Отчет о тестировании: $report")

//21 Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.

    val lastTestResults = mutableMapOf("test1" to "passed", "test2" to "failed")
    val archivedResults = lastTestResults.toMap()
    println("Архивированные результаты: $archivedResults")

//22 Преобразуйте словарь, содержащий ID теста и данные о времени выполнения тестов,
// заменив идентификаторы тестов на их названия
// (название можно получить вызвав фейковый метод, например getNameById(id: String))

    val testTimes = mapOf("id1" to 100, "id2" to 200)
    fun getNameById(id: String) = "TestName_$id"
    val namedTestTimes = testTimes.mapKeys { getNameById(it.key) }
    println("Время выполнения тестов с названиями: $namedTestTimes")

//23 Для словаря с оценками производительности различных версий приложения увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.

    val performanceScores = mutableMapOf("v1.0" to 90, "v1.1" to 80)
    performanceScores.forEach { (version, score) ->
        performanceScores[version] = (score * 1.1).toInt()
    }
    println("Обновленные оценки производительности: $performanceScores")

//24 Проверьте, пуст ли словарь с ошибками компиляции тестов.
//
    val compilationErrors = mapOf<Int, String>()
    compilationErrors.isEmpty()

//25 Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.

    val loadTestResults = mapOf<Int, String>()
    loadTestResults.isNotEmpty()

//26 Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.

    val autoTestsMap = mapOf<Int, String>()
    autoTestsMap.all { it.value == "Passed" }

//27 Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.

    val hasErrors = testResults.values.any { it == "failed" }
    println("Содержит ли словарь хотя бы один тест с ошибкой: $hasErrors")

//28 Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно и содержат в названии “optional”.

    val serviceTestResults = mapOf("optionalTest1" to "failed", "mandatoryTest1" to "passed", "optionalTest2" to "passed")
    val filteredResults = serviceTestResults.filter { (key, value) -> key.contains("optional") && value != "passed" }
    println("Отфильтрованные результаты тестов: $filteredResults")

}