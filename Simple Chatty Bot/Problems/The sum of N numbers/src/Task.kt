import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    var result = 0
    for (i in 1..number) {
        result += scanner.nextInt()
    }
    println(result)
}