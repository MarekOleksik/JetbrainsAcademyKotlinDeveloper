import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val numberOfElements = scanner.nextInt()
    val numbers = IntArray(numberOfElements)

    for (i in 0..numbers.lastIndex) {
        numbers[i] = scanner.nextInt()
    }

    print("${numbers[numbers.lastIndex]} ")
    for (i in 0 until numbers.lastIndex) {
        print("${numbers[i]} ")
    }
}