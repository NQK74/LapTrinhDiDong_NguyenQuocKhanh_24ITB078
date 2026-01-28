package Bai4

import kotlinx.coroutines.*
import kotlin.random.Random

fun main() = runBlocking {

    println("Starting to cook rice...")
    println("Partner said: wait 2 seconds please")
    val viecChoCom: Job = launch {
        nauCom()
    }
    val viecLuocTrung: Job = launch {
        luocTrung()
    }
    println("While cooking, browsing social media...")
    delay(500)
    println("After watching 3 videos, partner is getting hungry")
    viecChoCom.join()
    viecLuocTrung.join()
    println("Everything is done, time to eat!")
    println()

    println("=== MEAL COST CALCULATION ===")
    val tienAn = async {
        tinhTienAn()
    }

    println("Calculating meal cost...")
    println("Today meal cost: ${tienAn.await()} VND")
}

suspend fun nauCom() {
    println("Cooking rice...")
    delay(2000)
    println("Rice is done!")
}

suspend fun luocTrung() {
    println("Boiling eggs...")
    delay(1500)
    println("Eggs are done!")
}

suspend fun tinhTienAn(): Int {
    delay(1000)
    val tien = Random.nextInt(20000, 50000)
    return tien
}
