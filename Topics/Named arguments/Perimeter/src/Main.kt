fun perimeter(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double = x1, y4: Double = y1): Double {
    val ab = Math.hypot(x2 - x1, y2 - y1)
    val bc = Math.hypot(x3 - x2, y3 - y2)
    val cd = Math.hypot(x4 - x3, y4 - y3)
    val da = Math.hypot(x1 - x4, y1 - y4)

    return ab + bc + cd + da
}

//fun main() {
//    println(perimeter(0.0, 0.0, 12.0, 0.0, 0.0, 5.0, 0.0, 0.0))
//}