import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val word = input.nextLine()
    var result = ""
    for (i in "abcdefghijklmnopqrstuvwxyz") {
        if (word.contains(i)) continue
        result += i
    }
    println(result)
}