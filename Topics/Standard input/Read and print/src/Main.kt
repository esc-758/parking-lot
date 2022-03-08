import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val first = scanner.nextLine()
    val second = scanner.nextLine()
    val (firstNumber, secondNumber) = scanner.nextLine().split(" ")

    println(first)
    println(second)
    println(firstNumber)
    println(secondNumber)
}