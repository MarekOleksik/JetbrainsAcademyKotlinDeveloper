import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val char1 = scanner.next().first()
    val char2 = scanner.next().first()
    val char3 = scanner.next().first()
    val char4 = scanner.next().first()
    print(char1.isDigit())
    print("\\")
    print(char2.isDigit())
    print("\\")
    print(char3.isDigit())
    print("\\")
    print(char4.isDigit())
}