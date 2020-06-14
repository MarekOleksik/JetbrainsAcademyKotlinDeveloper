import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val firstClass = scanner.nextInt()
    val secondClass = scanner.nextInt()
    val thirdClass = scanner.nextInt()
    print(firstClass / 2 + firstClass % 2 +
            secondClass / 2 + secondClass % 2 +
            thirdClass / 2 + thirdClass % 2)

}