package signature.signature

import java.io.File
import java.util.*

val scanner = Scanner(System.`in`)
const val filePathMedium =
        "C:\\KotlinProjects\\JetbrainsAcademyKotlinDeveloper\\ASCII Text Signature\\ASCII Text Signature\\medium.txt"
val fileMedium = File(filePathMedium)
val scanFileMedium = Scanner(fileMedium)
const val filePathRoman =
        "C:\\KotlinProjects\\JetbrainsAcademyKotlinDeveloper\\ASCII Text Signature\\ASCII Text Signature\\roman.txt"
val fileRoman = File(filePathRoman)
val scanFileRoman = Scanner(fileRoman)

fun main() {
    print("Enter name and surname: ")
    val name = scanner.nextLine()
    print("Enter person's status: ")
    val status = scanner.nextLine()
    val letters = mutableMapOf<String, List<String>>()


    val numberOfLinesFontMedium = scanFileMedium.nextInt()
    val numberOfLinesFontRoman = scanFileRoman.nextInt()
    val numberOfCharactersFontMedium = scanFileMedium.nextInt()
    val numberOfCharactersFontRoman = scanFileRoman.nextInt()
    var characterFontMedium: String

    repeat(numberOfCharactersFontMedium) {
        characterFontMedium = scanFileMedium.next()
        val widthOfCharacter = scanFileMedium.next()
        val list = mutableListOf<String>()
        var temp = scanFileMedium.nextLine()

        repeat(numberOfLinesFontMedium) {
            temp = scanFileMedium.nextLine()
            list.add(temp)
        }

        letters[characterFontMedium] = list
        letters[" "] = listOf("    ", "    ", "    ")
    }

    var lengthOfName = 0
    for (element in name) {
        val letter = letters.getValue(element.toString())[0]
        lengthOfName += letter.length + 1
    }

    val widthOfTag: Int
    val countOfSpaces: Int
    val lineLength: Int

    if (status.length < lengthOfName) {
        widthOfTag = lengthOfName - status.length + 3
        countOfSpaces = 2
        lineLength = lengthOfName + 5
    } else {
        widthOfTag = 4
        lineLength = status.length + 6
        val temp = lineLength - lengthOfName - 2
        countOfSpaces = if (temp % 2 == 0) {
            (temp) / 2
        } else {
            (temp) / 2 + 1
        }
    }

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

