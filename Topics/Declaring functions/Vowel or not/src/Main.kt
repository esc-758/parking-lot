fun isVowel(char: Char): Boolean {
    val vowels = listOf('a', 'e', 'i', 'o', 'u')

    return char.lowercaseChar() in vowels
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}