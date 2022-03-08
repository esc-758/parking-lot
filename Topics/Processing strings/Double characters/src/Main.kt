fun main() {
    val string = readLine()!!
    var output = ""
    
    for (letter in string) {
        repeat(2) {
            output += letter
        }
    }
    
    print(output)
}
