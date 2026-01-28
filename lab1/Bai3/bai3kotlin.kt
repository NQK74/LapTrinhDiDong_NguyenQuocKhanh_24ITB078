package Bai3

fun main() {
    val soDoNhietDo = listOf(36, 37, 36, 38, 39, 37, 40, 38)
    val soKhongTrung = soDoNhietDo.toSet()

    println("=== TEMPERATURE MONITORING ===")
    println("Temperature readings in morning: $soDoNhietDo")
    println("Unique readings: $soKhongTrung")
    println()

    val teamBanNgay = setOf("Tuan", "Teo", "Ti", "Tun")
    val teamBanDem = mutableSetOf("Tun", "Ty", "Tom")

    println("=== TEAM SCHEDULE ===")
    println("Day shift team: $teamBanNgay")
    println("Night shift team: $teamBanDem")
    println()
    println("Members working both shifts: ${teamBanNgay.intersect(teamBanDem)}")
    println("All staff for the day: ${teamBanNgay.union(teamBanDem)}")
    println()

    val mucDoDoi = mutableMapOf(
        "Tuan" to 80,
        "Teo" to 60,
        "Ti" to 40
    )

    mucDoDoi["Tun"] = 95
    mucDoDoi["Teo"] = 55

    println("=== HUNGER LEVEL STATUS ===")
    mucDoDoi.forEach {
        println("${it.key} is hungry: ${it.value}%")
    }
    println()

    val baoCaoDoi = mucDoDoi
        .map { "${it.key} - ${it.value}%" }
        .joinToString(" | ")

    println("=== QUICK REPORT ===")
    println(baoCaoDoi)
    println()

    val nguoiSapXiu = mucDoDoi.filter { it.value < 60 }
    println("=== LOW HUNGER LEVEL ===")
    println("Members with hunger level below 60%: $nguoiSapXiu")
    println()

    val thucDon = listOf(
        "Pho",
        "Banh Mi",
        "Com Tam",
        "Bun Bo",
        "Tra Sua",
        "Mi Goi"
    )

    val monHomNay = thucDon
        .filter { it.contains("B", ignoreCase = true) }
        .shuffled()
        .take(2)
        .sorted()

    println("=== MENU SELECTION ===")
    println("Today's selected dishes: $monHomNay")
    println()

    val gapDoiTienAn: (Int) -> Int = { tien -> tien * 2 }
    println("=== MEAL COST CALCULATION ===")
    println("Current meal cost: 25,000 VND")
    println("If doubled: ${gapDoiTienAn(25000)} VND")
    println()

    val tinNhan: String? = "What should I eat?"
    tinNhan?.let {
        println("=== MESSAGE ===")
        println("Message received: $it")
    }
    println()

    val hoSoNguoiDung = NguoiDung().apply {
        ten = "Developer"
        tuoi = 20
        coNguoiYeu = false
    }

    println("=== USER PROFILE ===")
    println(hoSoNguoiDung)
}
class NguoiDung {
    var ten: String = ""
    var tuoi: Int = 0
    var coNguoiYeu: Boolean = false

    override fun toString(): String {
        return "Name: $ten | Age: $tuoi | In relationship: $coNguoiYeu"
    }
}
