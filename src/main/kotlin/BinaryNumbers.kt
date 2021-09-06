fun main() {
    val n = readLine()!!.toInt()
    val binaryList = mutableListOf<Int>()
    var counter = 0
    var maximum = 0
    var dividend = n
    while (dividend > 0) {
        val remainder = dividend.rem(2)
        dividend /= 2
        if (remainder == 1) counter++
        else {
            if (counter > maximum) maximum = counter
            counter = 0
        }
        if (dividend == 0 && counter > maximum) maximum = counter
    }
    println(maximum)
}