import java.util.*
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    when (scanner.nextLine()) {
        "triangle" -> {
            val a = scanner.nextDouble()
            val b = scanner.nextDouble()
            val c = scanner.nextDouble()
            println(sqrt((a + b + c) * (a + b - c) * (a - b + c) * (b + c - a)) / 4)
        }
        "rectangle" -> {
            val a = scanner.nextDouble()
            val b = scanner.nextDouble()
            println(a * b)
        }
        "circle" -> {
            val r = scanner.nextDouble()
            println(3.14 * r * r)
        }
    }
}