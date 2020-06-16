import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    var iter = 1
    while (iter * iter <= number) {
        println(iter * iter)
        iter++
    }
}