import kotlin.Exception

fun parseCardNumber(cardNumber: String): Long {
    val numberList = cardNumber.split(" ");

    if (numberList.size != 4) {
        throw Exception("Wrong card number!")
    }

    numberList.forEach {
        if (it.length != 4) {
            throw Exception("Wrong card number!")
        }
    }

    return cardNumber.replace(" ", "").toLong()
}