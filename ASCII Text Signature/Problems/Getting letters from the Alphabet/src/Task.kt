import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    val letter = input.next()[0]
    for (element in alphabet) {
        if (element.equals(letter)) return
        print(element)
    }
}