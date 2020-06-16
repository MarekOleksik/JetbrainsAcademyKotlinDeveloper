import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val numberOfElements = scanner.nextInt()
    var max = Int.MIN_VALUE
    var maxIndex = 0
    val numbers = IntArray(numberOfElements)

    for (i in 0..numbers.lastIndex) {
        numbers[i] = scanner.nextInt()
        if (numbers[i] > max) {
            max = numbers[i]
            maxIndex = i
        }
    }
    println(maxIndex)
}