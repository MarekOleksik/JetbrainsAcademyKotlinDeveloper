package signature

import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    print("Enter name and surname: ")
    val name = scanner.nextLine().toLowerCase()
    print("Enter person's status: ")
    val status = scanner.nextLine()

    val letters = mapOf(
            ("a" to listOf("____", "|__|", "|  |")),
            ("b" to listOf("___ ", "|__]", "|__]")),
            ("c" to listOf("____", "|   ", "|___")),
            ("d" to listOf("___ ", "|  \\", "|__/")),
            ("e" to listOf("____", "|___", "|___")),
            ("f" to listOf("____", "|___", "|   ")),
            ("g" to listOf("____", "| __", "|__]")),
            ("h" to listOf("_  _", "|__|", "|  |")),
            ("i" to listOf("_", "|", "|")),
            ("j" to listOf(" _", " |", "_|")),
            ("k" to listOf("_  _", "|_/ ", "| \\_")),
            ("l" to listOf("_   ", "|   ", "|___")),
            ("m" to listOf("_  _", "|\\/|", "|  |")),
            ("n" to listOf("_  _", "|\\ |", "| \\|")),
            ("o" to listOf("____", "|  |", "|__|")),
            ("p" to listOf("___ ", "|__]", "|   ")),
            ("q" to listOf("____", "|  |", "|_\\|")),
            ("r" to listOf("____", "|__/", "|  \\")),
            ("s" to listOf("____", "[__ ", "___]")),
            ("t" to listOf("___", " | ", " | ")),
            ("u" to listOf("_  _", "|  |", "|__|")),
            ("v" to listOf("_  _", "|  |", " \\/ ")),
            ("w" to listOf("_ _ _", "| | |", "|_|_|")),
            ("x" to listOf("_  _", " \\/ ", "_/\\_")),
            ("y" to listOf("_   _", " \\_/ ", "  |  ")),
            ("z" to listOf("___ ", "  / ", " /__")),
            (" " to listOf("    ", "    ", "    "))
    )
    repeat(name.length + 4) {
        print("*")
    }
    print("*  ")
    println()
    print("*  ")
    for (element in name) {
        print(letters.getValue(element.toString())[0])
    }
    println()
    print("*  ")
    for (element in name) {
        print(letters.getValue(element.toString())[1])
    }
    println()
    print("*  ")
    for (element in name) {
        print(letters.getValue(element.toString())[2])
    }
    println()
    print("*  ")
    println(status)
    repeat(name.length + 4) {
        print("*")
    }
}
