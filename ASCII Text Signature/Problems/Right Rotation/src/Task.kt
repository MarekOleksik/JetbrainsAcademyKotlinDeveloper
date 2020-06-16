import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val numberOfElements = scanner.nextInt()
    val numbers = IntArray(numberOfElements)

    for (i in 0..numbers.lastIndex) {
        numbers[i] = scanner.nextInt()
    }

    val numberOfRightShift = scanner.nextInt()
    val result = IntArray(numberOfElements)
    var index = 0

    for (i in 0..result.lastIndex) {
        index = (i + numberOfRightShift) % numberOfElements
        result[index] = numbers[i]
    }

    for (number in result) {
        print(number)
        print(" ")
    }
}