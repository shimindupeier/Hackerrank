fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()
    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    var numSwaps = 0
    for (eachElement in 0 until n) {
        for (i in 0 until n - 1) {
            val curr = a[i]
            val next = a[i+1]
            if (curr > next) {
                a[i] = next
                a[i+1] = curr
                numSwaps++
            }
        }
    }
    println("Array is sorted in $numSwaps swaps.")
    println("First Element: ${a.first()}")
    println("Last Element: ${a.last()}")
}
