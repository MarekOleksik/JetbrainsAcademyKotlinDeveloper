import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val numberOfElements = scanner.nextInt()
    var max = 0
    repeat(numberOfElements) {
        val number = scanner.nextInt()
        if (number > max && number % 4 == 0) {
            max = number
        }
    }
    println(max)
}