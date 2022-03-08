package parking


fun main() {
    var parkingLot: ParkingLot? = null

    do {
        val userInput = readLine()!!.split(" ")
        val command = userInput.first()

        try {
            when {
                command == "create" -> parkingLot = createParkingLot(userInput[1].toInt())
                command == "park" && parkingLotExists(parkingLot) -> parkingLot?.parkCar(Car(userInput[1], userInput[2]))
                command == "leave" && parkingLotExists(parkingLot) -> parkingLot?.removeCar(userInput[1].toInt())
                command == "status" && parkingLotExists(parkingLot) -> parkingLot?.getStatus()
                command == "reg_by_color" && parkingLotExists(parkingLot) -> parkingLot?.getRegByColor(userInput[1])
                command == "spot_by_color" && parkingLotExists(parkingLot) -> parkingLot?.getSpotByColor(userInput[1])
                command == "spot_by_reg" && parkingLotExists(parkingLot) -> parkingLot?.getSpotByReg(userInput[1])
            }
        } catch (re: RuntimeException) {
            println(re.message)
        }
    } while (userInput.isNotEmpty() && userInput[0] != "exit")
}

fun createParkingLot(spots: Int): ParkingLot {
    val parkingLot = ParkingLot(spots)
    println("Created a parking lot with $spots spots.")

    return parkingLot
}

fun parkingLotExists(parkingLot: ParkingLot?): Boolean {
    if (parkingLot == null) {
        println("Sorry, a parking lot has not been created.")
        return false
    }

    return true
}

data class Car(val plateNumber: String, val color: String)

class ParkingLot(size: Int) {
    private val cars: MutableList<Car?> = MutableList(size) { null }

    fun parkCar(car: Car) {
        val spot = cars.indexOf(null)

        if (spot == -1) {
            throw RuntimeException("Sorry, the parking lot is full.")
        }

        cars[spot] = car
        println("${car.color} car parked in spot ${spot + 1}.")
    }

    fun removeCar(spot: Int) {
        cars[spot - 1] = null
        println("Spot $spot is free.")
    }

    fun getStatus() {
        if (cars.filterNotNull().isEmpty()) {
            println("Parking lot is empty.")
        } else {
            cars.forEachIndexed { index, car -> if (car != null) {
                println("${index + 1} ${car.plateNumber} ${car.color}")
            } }
        }
    }

    fun getRegByColor(color: String) {
        println(getCarsByColor(color).values.joinToString(separator = ", "){ it.plateNumber })
    }

    private fun getCarsByColor(color: String): Map<Int, Car> {
        val results: Map<Int, Car> = cars.filterNotNull().filter { it.color.equals(color, ignoreCase = true) }.associateBy { cars.indexOf(it) + 1 }

        if (results.isEmpty()) {
            throw RuntimeException("No cars with color $color were found.")
        }

        return results
    }

    fun getSpotByColor(color: String) {
        println(getCarsByColor(color).keys.joinToString(separator = ", "){ it.toString() })
    }

    fun getSpotByReg(plateNumber: String) {
        val result: Car? = cars.firstOrNull { it?.plateNumber == plateNumber }

        if (result == null) {
            throw RuntimeException("No cars with registration number $plateNumber were found.")
        } else {
            println(cars.indexOf(result) + 1)
        }
    }
}
