import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val amount = scanner.next().toInt()
    val purchasesList = mutableListOf<Int>()
    while (scanner.hasNextInt()) {
        purchasesList.add(scanner.nextInt())
    }
    var result = amount
    var temp = 0

    for (element in purchasesList) {
        if (result < element) {
            temp = element
            break
        }
        result -= element
    }

    if (result >= temp) {
        println("Thank you for choosing us to manage your account! You have $result money.")
    } else {
        println("Error, insufficient funds for the purchase. You have $result, but you need $temp.")
    }
}