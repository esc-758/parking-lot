fun main() {
    val words = readLine()!!.split(" ")
    var longestWord = words.first()
    
    for (i in 1..words.lastIndex) {
        val currentWord = words[i]

        if (currentWord.length > longestWord.length) {
            longestWord = currentWord
        }
    }
    
    print(longestWord)
}
