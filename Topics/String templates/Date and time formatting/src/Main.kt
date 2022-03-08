fun main() {
    val (hour, minute, seconds) = readLine()!!.split(" ")
    val (day, month, year) = readLine()!!.split(" ")

    print("$hour:$minute:$seconds $day/$month/$year")
}