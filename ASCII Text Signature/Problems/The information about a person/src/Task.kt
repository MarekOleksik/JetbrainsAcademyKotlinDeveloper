import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val name = scanner.next()
    val lastName = scanner.next()
    val age = scanner.next()
    println("${name.first()}. $lastName, $age years old")
}