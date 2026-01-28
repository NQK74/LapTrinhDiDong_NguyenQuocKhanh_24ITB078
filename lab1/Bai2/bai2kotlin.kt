package Bai2

fun main() {
    val villa = LuxuryVilla(residents = 4, hasPool = true)
    val cabin = WoodenCabin(residents = 2)

    println("=== VILLA INFORMATION ===")
    villa.printInfo()
    println("Villa area: ${villa.floorArea()} m2")
    println()

    println("=== CABIN INFORMATION ===")
    cabin.printInfo()
    println("Cabin area: ${cabin.floorArea()} m2")
    println()

    val cities = listOf("Da Nang", "Ha Noi", "Sai Gon", "Ho Chi Minh")
    println("=== CITIES LIST ===")
    println("Total cities: ${cities.size}")
    println("First city: ${cities[0]}")
    println("Cities list: $cities")
    println("Reversed list: ${cities.reversed()}")
    println()

    val tasks = mutableListOf<String>()
    tasks.add("Go out with friends")
    tasks.add("Work at home and exercise")
    tasks.add("Go on a date")

    tasks[1] = "Go to gym"
    tasks.remove("Work at home and exercise")

    println("=== DAILY TASKS ===")
    for (task in tasks) {
        println("- $task")
    }
    println()

    var index = 0
    println("=== TASKS WITH INDEX ===")
    while (index < tasks.size) {
        println("Task ${index + 1}: ${tasks[index]}")
        index++
    }
    println()

    val appName = "MobileApp"
    val version = 3
    println("=== APP STATISTICS ===")
    println("App name: $appName (Length: ${appName.length})")
    println("Active users: $version")
    println("Total downloads today: ${version * 5}")
    println()

    var points = 10
    points += 5
    points *= 2
    println("=== POINTS CALCULATION ===")
    println("Initial points: 10")
    println("After adding 5: 15")
    println("After multiplying by 2: $points")
    println()

    with(villa) {
        println("=== VILLA DETAILS (USING WITH) ===")
        println("Residents: $residents")
        println("Material: $buildingMaterial")
        println("Has pool: $hasPool")
        println("Has enough space: ${hasSpace()}")
    }
}

abstract class Residence(val residents: Int) {

    abstract val buildingMaterial: String

    abstract fun floorArea(): Double

    fun hasSpace(): Boolean {
        return residents < 6
    }

    fun printInfo() {
        println("Residents: $residents")
        println("Material: $buildingMaterial")
    }
}



class WoodenCabin(residents: Int) : Residence(residents) {

    override val buildingMaterial: String
        get() = "Wood"

    override fun floorArea(): Double {
        return residents * 18.5
    }
}

class LuxuryVilla(
    residents: Int,
    val hasPool: Boolean
) : Residence(residents) {

    override val buildingMaterial: String
        get() = "Marble & Modern Steel"

    override fun floorArea(): Double {
        return residents * 50.0
    }
}
