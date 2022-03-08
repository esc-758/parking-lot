fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    
    if (second == 0) {
        println("Division by zero, please fix the second argument!")
    } else {
        println(first / second)
    }
}
