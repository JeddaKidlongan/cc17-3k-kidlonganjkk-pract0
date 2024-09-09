fun main() {
    // Weight conversion
    val pounds = 300.0
    val kilograms = pounds * 0.453592
    println("Weight in Pounds (lbs): $pounds")
    println("Weight converted to Kilograms (kg): $kilograms\n")

    // Length conversion
    val miles = 21.0
    val kilometers = miles * 1.60934
    println("Length in Miles (mi): $miles")
    println("Length in Kilometers (km): $kilometers\n")

    // Temperature conversion
    val fahrenheit = 9900.0
    val celsius = (fahrenheit - 32) * 5/9
    println("Temperature in Fahrenheit (°F): $fahrenheit")
    println("Temperature in Celsius (°C): $celsius\n")

    // Average age calculation
    val ages = listOf(22, 19, 20, 20, 18, 21, 23, 25, 19, 21)
    println("Ages of students:")
    for (age in ages) {
        println("Age: $age")
    }
    val averageAge = ages.average()
    println("\nThe average age of the students is: $averageAge\n")

    // Fantasy story with variables
    val demonKing = "Ibrahim the Destroyer"
    val weapon = "Sword of Damage go brrrrrs"
    val armor = "Armor of Pls Dont Hurt Mex"
    val secretSkill = "12 Secret Herbs and Spices"
    val ultimateSkill = "Unlimited Burger Works"

    val story = """
        The evil demon king $demonKing has attacked the capital of the Magical Kingdom. 
        In order to stop the demon king, the heroes banded together and fought back, 
        but the demon king is simply too strong. He swings his mighty blade, $weapon, 
        to attack the hero's party. When they try to counterattack, their attacks are 
        deflected thanks to the $armor of the demon king. Using his secret skill, 
        $secretSkill, the demon king is then able to quickly gather the mana and items 
        needed to cast his ultimate skill, $ultimateSkill, to defeat the heroes.
    """.trimIndent()

    println(story)
}