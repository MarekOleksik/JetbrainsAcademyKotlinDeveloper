package signature

import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    val name = scanner.nextLine()
    repeat(name.length + 4) {
        print("*")
    }
    println()
    println("* $name *")
    repeat(name.length + 4) {
        print("*")
    }
}
