fun main() {
    val numbers = readLine()!!
    var sumOfFirst = 0
    var sumOfSecond = 0
    
    for (i in 0..2) {
        sumOfFirst += numbers[i].toInt()
    }
    
    for (i in 3..numbers.lastIndex) {
        sumOfSecond += numbers[i].toInt()
    }
    
    print(if (sumOfFirst == sumOfSecond) "Lucky" else "Regular")
}
