fun main() {
    val word = readLine()!!
    
    for (i in 'a'..'z') {
        if (i in word) continue
        print(i)
    }
}
