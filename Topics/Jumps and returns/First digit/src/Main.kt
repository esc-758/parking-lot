fun main() {
    val sequence = readLine()!!
    
    for (char in sequence) {
        if (char !in 'A'..'z') {
            print(char)
            break
        }
    }
}
