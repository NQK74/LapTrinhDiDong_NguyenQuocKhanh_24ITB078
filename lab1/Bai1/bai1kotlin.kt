package Bai1
fun main() {
    println("Hello World!")

    val age = 20
    val name = "NQK74"
    var diceCount = 2
    var currentScore: Int = 10

    println("=== VARIABLES ===")
    println("Name: ${name}, Age: ${age}")
    println()

    val year: Int = 2026
    val language: String = "Vietnamese"
    val levelRange: IntRange = 1..10
    val isStudent: Boolean = true
    println("Year: $year")
    println("Language: $language")
    println("Level range: $levelRange")
    println("Is student: $isStudent")
    println()

    sayHello()
    printLine("-", 15)
    val diceResult = rollDice()
    println("Dice result: $diceResult")
    println()

    val x = 12
    val y = 5
    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println()

    println("x > y: ${x > y}")
    println("x == y: ${x == y}")
    println("x <= y: ${x <= y}")
    println()

    val randomValue = (10..100).random()
    println("Random value: $randomValue")
    println()

    repeat(2) {
        print("#")
    }
    println()
    println()

    printBox(width = 5, height = 3)
    println()

    val score = 75
    if (score >= 85) {
        println("Grade: A")
    } else if (score >= 70) {
        println("Grade: B")
    } else {
        println("Grade: C")
    }
    println()

    val day = 3
    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        else -> println("Weekend")
    }
    println()

    val myDice = Dice(12)
    println("Dice class roll: ${myDice.roll()}")
}


fun sayHello() {
    println("Hello!")
}

fun printLine(symbol: String, count: Int) {
    repeat(count) {
        print(symbol)
    }
    println()
}

fun rollDice(): Int {
    return (1..12).random()
}

fun printBox(width: Int, height: Int) {
    repeat(height) {
        repeat(width) {
            print("*")
        }
        println()
    }
}

class Dice(private val sides: Int) {
    fun roll(): Int {
        return (1..sides).random()
    }
}
