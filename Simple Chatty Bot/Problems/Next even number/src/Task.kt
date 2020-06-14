import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    if (number % 2 == 0) {
        print(number + 2)
    } else {
        print(number + 1)
    }
    // put your code here
}