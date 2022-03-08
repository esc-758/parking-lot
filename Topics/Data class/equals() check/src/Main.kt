data class Client(val name: String, val age: Int, val balance: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Client

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }

}

fun main() {
    val name = readLine()!!
    val age = readLine()!!.toInt()
    val balance = readLine()!!.toInt()
    val client = Client(name, age, balance)

    val secondName = readLine()!!
    val secondAge = readLine()!!.toInt()
    val secondBalance = readLine()!!.toInt()
    val secondClient = Client(secondName, secondAge, secondBalance)

    println(client == secondClient)
}