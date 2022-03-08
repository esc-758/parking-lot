fun main() {    
    val firstAnswer = readLine().toBoolean() // read other values in the same way
    val secondAnswer = readLine().toBoolean()
    val confession = readLine().toBoolean()

    println(!(firstAnswer xor secondAnswer) && !confession)
}
