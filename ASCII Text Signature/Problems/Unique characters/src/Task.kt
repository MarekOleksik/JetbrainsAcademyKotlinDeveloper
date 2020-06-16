import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val word = scanner.nextLine()
    var counter = 0
    var localCounter = 0
    for (j in 'a'..'z') {
        for (element in word) {
            if (element == j) localCounter++
        }
        if (localCounter == 1) counter++
        localCounter = 0
    }
    println(counter)
}