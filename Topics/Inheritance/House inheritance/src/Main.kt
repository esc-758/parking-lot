fun main() {
    val rooms = readLine()!!.toInt()
    val price = readLine()!!.toInt()
    val house = House(rooms, price)
    println(totalPrice(house).toInt())
}

fun totalPrice(house: House): Double = house.calculateFinalPrice()

open class House(val rooms: Int, val price: Int) {
    fun getCoefficient(): Double {
        return when {
            rooms <= 1 -> 1.0
            rooms in 2..3 -> 1.2
            rooms == 4 -> 1.25
            rooms in 5..7 -> 1.4
            else -> 1.6
        }
    }

    fun getCost(): Int {
        if (price < 0) return 0
        if (price > 1_000_000) return 1_000_000
        return price;
    }

    fun calculateFinalPrice(): Double = getCost() * getCoefficient()
}