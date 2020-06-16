import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val x1 = input.nextInt()
    val y1 = input.nextInt()
    val x2 = input.nextInt()
    val y2 = input.nextInt()
    val x3 = input.nextInt()
    val y3 = input.nextInt()
    var result = ""

    for (i in 1..5) {
        if (i == x1 || i == x2 || i == x3) continue
        result += "$i "
    }
    print(result.trim())
    println()
    result = ""

    for (j in 1..5) {
        if (j == y1 || j == y2 || j == y3) continue
        result += "$j "
    }
    print(result.trim())
}