import java.util.Scanner

fun isVowel(letter: Char): Boolean {
    return letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' || letter == 'I' ||
            letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U'
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}