import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()
    val num3 = scanner.nextInt()
    val num4 = scanner.nextInt()
    val num5 = scanner.nextInt()

    println(num5 in num1..num2 || num5 in num3..num4)
}