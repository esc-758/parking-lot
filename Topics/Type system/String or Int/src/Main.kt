fun isNumber(input: String): Any {
    if (input.all { it in '0' until '9' }) {
        return input.toInt()
    }
    return input
}