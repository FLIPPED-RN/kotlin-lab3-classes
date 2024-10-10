import java.text.SimpleDateFormat
import java.util.*

// Назаров Руслан
// 23-ИСП-3/1
// ООП, класс Работник

fun main() {
    val worker:Worker = Worker()

    println("Текущий год -> " + worker.nowData())
    println()
    println("Имя -> " + worker.name)
    println("Год рождения -> " + worker.year)
    println("Оклад -> " + worker.salary)
    println()
    println("Вычисления: ")
    println("1. Возраст -> " + worker.calculationAge())
    println("2. Колличество календарных дней до исполнения работнику 50 лет -> " + worker.calculatingCalendarDaysFifty())

    println()
}

class Worker{
    var name: String = generateName()
    var year: Int = generateBirthYear()
    var salary: Int = 200000

    fun generateName():String{
        val names:List<String> = listOf("Руслан", "Данила", "Андрей", "Вова", "Артем", "Юра")
        val name = names[Random().nextInt(names.size)]
        return name
    }

    fun generateBirthYear():Int{
        return Random().nextInt(1960, 2001)
    }

    fun nowData(): Int{
        var sdf = SimpleDateFormat("yyyy")
        var currentData = sdf.format(Date())
        return currentData.toInt()
    }

    fun calculationAge():Int{
        return nowData() - year
    }

    fun calculatingCalendarDaysFifty():Int{
        val age = calculationAge()

        return if (age < 50){
            (50 - age) * 365
        } else{
            0
        }
    }
}