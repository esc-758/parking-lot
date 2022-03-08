fun main() {
    val numbers = readLine()!!.toCharArray()
    val halfMark = numbers.size / 2
    var sumOfFirstHalf = 0
    var sumOfSecondHalf = 0
    
    for (index in 0 until halfMark) {
        sumOfFirstHalf += numbers[index].toInt()
    }
    
    for (index in halfMark..numbers.lastIndex) {
        sumOfSecondHalf += numbers[index].toInt()
    }
    
    print(if (sumOfFirstHalf == sumOfSecondHalf) "YES" else "NO")
}
