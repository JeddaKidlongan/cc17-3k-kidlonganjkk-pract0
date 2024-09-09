fun convertPoundsToKilograms(pounds: Double): Double {
    return pounds * 0.453592
}

fun convertMilesToKilometers(miles: Double): Double {
    return miles * 1.60934
}

fun convertFahrenheitToCelsius(fahrenheit: Double): Double {
    return (fahrenheit - 32) * 5 / 9
}

fun calculateAverageAge(studentAges: List<Int>): Double {
    return studentAges.sum().toDouble() / studentAges.size
}

fun main() {
    val weightInPounds = 150.0
    val distanceInMiles = 100.0
    val temperatureInFahrenheit = 98.6

    val weightInKilograms = convertPoundsToKilograms(weightInPounds)
    val distanceInKilometers = convertMilesToKilometers(distanceInMiles)
    val temperatureInCelsius = convertFahrenheitToCelsius(temperatureInFahrenheit)

    println("Weight: $weightInPounds lbs -> $weightInKilograms kg")
    println("Distance: $distanceInMiles mi -> $distanceInKilometers km")
    println("Temperature: $temperatureInFahrenheit °F -> $temperatureInCelsius °C")

    val studentAges = listOf(20, 21, 22, 23, 24, 25, 26, 27, 28, 29)
    val averageAge = calculateAverageAge(studentAges)

    println("Student Ages: $studentAges")
    println("Average Age: $averageAge")

    // Fantasy story
    val hero1 = "Risa the Brave"
    val hero2 = "Sara the Wise"
    val villain = "Quiboloy the Shadow"
    val weapon = "Blade of Eternal Light"
    val spell = "Arcane Fury"

    val story = """
        In the enchanted realm of Eldoria, a great threat looms. The dark sorceress $villain has unleashed her minions upon the peaceful villages. 
        To combat this evil, two legendary heroes, $hero1 and $hero2, arise to defend their homeland. 
        Armed with the powerful $weapon, they set out on a perilous journey to confront Quiboloy. 
        As they traverse the treacherous wilderness, they prepare to unleash their ultimate spell, $spell, 
        hoping to vanquish the darkness and restore peace to Eldoria once and for all.
    """.trimIndent()
    println("\n$story")
}