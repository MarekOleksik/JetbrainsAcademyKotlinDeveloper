import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val numbers = scanner.nextInt()
    var minimum = Int.MAX_VALUE
    for (i in 1..numbers) {
        val number = scanner.nextInt()
        if (number < minimum) {
            minimum = number
        }
    }
    println(minimum)
}