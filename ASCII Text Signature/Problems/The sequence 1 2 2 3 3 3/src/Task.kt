import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var i = 1
    var number = 1
    var counter = 0
    while (counter < n) {
        for (j in 1..i) {
            print(number)
            print(" ")
            counter++
            if (counter >= n) break
        }
        number++
        i++
    }
}