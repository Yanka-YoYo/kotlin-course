package by.yankayoyo.kotlincourse.lesson3

val eventName : String = "Hackathon Survival"// Название мероприятия

var eventDate: String = "2024-09-13" // Дата проведения

val eventLocation : String = "Minsk , Belarus"// Место проведения

private val eventBudget : Map<String,Double> = mapOf(
    "Budget 1" to 5000.0,
    "Budget 2" to 2000.0,
    "Budget 3" to 1000.0,
    "Budget 4" to 500.0
) // Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.

var participantCount: Int = 0
    get() = field
    private set(value) {field=value}// Количество участников

val eventDuration: Long = 8 * 60 * 60 // Длительность хакатона

private val supplierContacts: List<String> = listOf("Supplier 3", "Supplier 2")
) // Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.

var eventStatus : String = "Preparation"// Текущее состояние хакатона (статус)

val eventSponsors : List<String> = listOf ("Campany A", "Cpmpany B", "Company C") // Список спонсоров

var totalBudget : Double = 8500.0// Бюджет мероприятия

var internetAccessLevel : Int = 0// Текущий уровень доступа к интернету

private var eventResourcesAllocation : List<String> = listOf ()// Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.

val eventTeams : Int = 0 // Количество команд

val eventTasks : List<String> = listOf("Task 1", "Task 2", "Task 3") // Перечень задач

val eventEvacuationPlan : String = "" // План эвакуации

var availableEquipment : Map<String,Int> = mapOf(
    "Tables" to 10,
    "Chairs" to 50,
    "Laptops" to 25
)// Список доступного оборудования

var freeEquipment : Int = 95
    get() = field
    set(value) {
        if (value > 0) field -=value
    }// Список свободного оборудования

var mealShedule : Map<String,String> = mapOf()// График питания участников (зависит от поставщика питания, определяемого за неделю до начала)

val contingencyPlan : String = ""// План мероприятий на случай сбоев

val judges : List<String> = listOf("Judge 1", "Judge 2", "Judge 3")// Список экспертов и жюри

val feedbackMethods : String = "Online surveys and interviews"// Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.

var privacyPolicy : String = ""// Политика конфиденциальности

var privateFeedback : String = ""// Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.

var currentTemperature : Double = 22.5 // Текущая температура в помещении

var networkPerformance : String = "Optimal"// Мониторинг и анализ производительности сетевого оборудования и интернет-соединения.

var lightingLavel : Int = 300// Уровень освещения

var eventLog : List<String> = listOf("one", "two")// Лог событий мероприятия

val medicalAssistance : String = "Avalible on-site"// Доступность медицинской помощи

val safetyPlans : String = "Evacuations plans and emergency protocols"// Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.

val eventRegistrationNumber : String = "HACKBY2024-1"// Регистрационный номер мероприятия

val maxNoiseLevel : Int = 85// Максимально допустимый уровень шума в помещении хакатона.

var noiseLevelExceeded : Boolean = false // Индикатор превышения уровня шума в помещениях

var eventFormat : String = "Ofline" // Формат мероприятия (зависит от геополитической обстановки)

var freeRestingPlaces : Int = 25
    get() = field
    set(value) {
        if (value >= 0) field -= value
    }// Количество свободных мест для отдыха (например, кресел или диванов), сеттер валидирует, чтобы количество не было меньше нуля.

val pressPlan : String = "Press releases and interviews"// План взаимодействия с прессой

val teamProjects : Map<String, String> = mapOf(
    "Team 1" to "",
    "Team 2" to "",
    "Team 3" to "",
    "Team 4" to "",
    "Team 5" to ""
)// Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.

var permissionsObtained : Boolean = false // Статус получения всех необходимых разрешений

var exclusiveResourcesAccess: Boolean = false // Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию)

val eventPartners : List<String> = listOf("Partner 1", "Partner 2", "Partner 3") // Список партнеров мероприятия

lateinit var eventReport : String = ""// Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.

val prizeDistributionPlan: String = "Prizes will be distributed at the closing ceremony" // План распределения призов

val emergencyContacts: Map<String, String> = mapOf(
    "Medical" to "medical@example.com",
    "Fire Department" to "fire@example.com"
) // Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам.

val specialConditions: String = "Wheelchair accessible venue" // Особые условия для участников с ограниченными возможностями

val participantMood: String by lazy {
    ""
} // Общее настроение участников (определяется опросами)

var hackathonPlan: String = "" // Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия.

var specialGuestName: String = "Special Guest" // Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия.

val maxCapacity: Int = 250// Максимальное количество людей, которое может вместить место проведения.

val standardWorkHours: Int = 2 // Стандартное количество часов, отведенное каждой команде для работы над проектом.
