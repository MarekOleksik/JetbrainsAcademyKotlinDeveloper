import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val input = scanner.nextLine()
    val nthSymbol = scanner.nextInt()
    println("Symbol # $nthSymbol of the string \"$input\" is \'${input[nthSymbol - 1]}\'")
}