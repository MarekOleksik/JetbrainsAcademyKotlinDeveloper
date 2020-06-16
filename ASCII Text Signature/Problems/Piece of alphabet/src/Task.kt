import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val word = scanner.nextLine()
    var result = true

    if (word.isEmpty()) {
        result = true
    } else {
        for (i in 1 until word.length - 1) {
            if (word[i] == word[i - 1] + 1 && word[i] == word[i + 1] - 1) {
                result = true
            } else {
                result = false
                break
            }
        }
    }

    print(result)
}