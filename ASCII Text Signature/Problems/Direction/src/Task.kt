import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    when (scanner.nextInt()) {
        1 -> println("move up")
        2 -> println("move down")
        3 -> println("move left")
        4 -> println("move right")
        0 -> println("do not move")
        else -> println("error!")
    }
}