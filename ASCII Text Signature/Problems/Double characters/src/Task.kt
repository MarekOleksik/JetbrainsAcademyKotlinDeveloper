import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val word = scanner.nextLine()
    var result = ""

    for (ch in word) {
        result += ch
        result += ch
    }
    print(result)
}