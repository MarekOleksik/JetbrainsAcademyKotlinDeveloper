import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val char1 = scanner.next().first()
    val char2 = scanner.next().first()
    val char3 = scanner.next().first()
    println(char1 == char2 - 1 && char2 == char3 - 1)
}
