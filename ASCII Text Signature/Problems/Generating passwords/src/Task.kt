import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val numberOfUppercaseLetter = scanner.nextInt()
    val numberOfLowercaseLetter = scanner.nextInt()
    val numberOfDigits = scanner.nextInt()
    val numberOfSymbols = scanner.nextInt()
    var password = ""
    val lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz"
    val upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val digits = "0123456789"

    for (i in 1..numberOfLowercaseLetter) {
        password += lowerCaseLetters[i % lowerCaseLetters.length]
    }
    for (i in 1..numberOfUppercaseLetter) {
        password += upperCaseLetters[i % upperCaseLetters.length]
    }
    for (i in 1..numberOfDigits) {
        password += digits[i % digits.length]
    }
    var iter = 0
    while (password.length != numberOfSymbols) {
        password += lowerCaseLetters[iter % lowerCaseLetters.length]
        iter++
    }
    println(password)
}
