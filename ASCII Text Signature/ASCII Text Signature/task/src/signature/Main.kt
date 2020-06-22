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

    var lengthOfName = 0
    for (element in name) {
        var letter = letters.getValue(element.toString())[0]
        lengthOfName += letter.length + 1
    }

    var widthOfTag = 0
    var countOfSpaces = 0
    var lineLength = 0

    if (status.length < lengthOfName) {
        widthOfTag = lengthOfName - status.length + 3
        countOfSpaces = 2
        lineLength = lengthOfName + 5
    } else {
        widthOfTag = 4
        lineLength = status.length + 6
        val temp = lineLength - lengthOfName - 2
        if (temp % 2 == 0) {
            countOfSpaces = (temp) / 2
        } else {
            countOfSpaces = (temp) / 2 + 1
        }
    }

    //println("lineLength: $lineLength")
    //println("lengthOfName: $lengthOfName")
    //println("widthOfTag: $widthOfTag")
    //println("countOfSpaces: $countOfSpaces")

    repeat(lineLength) {
        print("*")
    }
    println()

    print("*")
    repeat(countOfSpaces) {
        print(" ")
    }
    for (element in name) {
        print(letters.getValue(element.toString())[0])
        print(" ")
    }
    repeat(lineLength - countOfSpaces - lengthOfName - 2) {
        print(" ")
    }
    print("*")
    println()

    print("*")
    repeat(countOfSpaces) {
        print(" ")
    }
    for (element in name) {
        print(letters.getValue(element.toString())[1])
        print(" ")
    }
    repeat(lineLength - countOfSpaces - lengthOfName - 2) {
        print(" ")
    }
    print("*")
    println()

    print("*")
    repeat(countOfSpaces) {
        print(" ")
    }
    for (element in name) {
        print(letters.getValue(element.toString())[2])
        print(" ")
    }
    repeat(lineLength - countOfSpaces - lengthOfName - 2) {
        print(" ")
    }
    print("*")
    println()

    print("*")
    repeat(widthOfTag / 2) {
        print(" ")
    }
    print(status)
    repeat(widthOfTag / 2) {
        print(" ")
    }
    if (widthOfTag % 2 == 1) {
        print(" ")
    }
    print("*")
    println()

    repeat(lineLength) {
        print("*")
    }
}

