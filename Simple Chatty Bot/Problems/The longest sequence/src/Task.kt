import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val numbers = scanner.nextInt()
    var counterTemp = 0
    var temp = 0
    var counter = 0
    for (i in 1..numbers) {
        val number = scanner.nextInt()
        if (number >= temp) {
            counterTemp++
            temp = number

            if (counterTemp > counter) {
                counter = counterTemp
            }
        } else {
            counterTemp = 1
            temp = number
        }
    }
    println(counter)
}