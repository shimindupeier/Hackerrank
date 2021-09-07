fun main(args: Array<String>) {

    val arr = Array<Array<Int>>(6, { Array<Int>(6, { 0 }) })

    for (i in 0 until 6) {
        arr[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val temp = (0 until 4).flatMap { row ->
        (0 until 4).map { col ->
            val sum = computeSum(arr, row, col)
            sum
        }
    }
    println(temp.maxOrNull())
}

private fun computeSum(arr: Array<Array<Int>>, row: Int, col: Int) : Int {
    val relativeList = listOf(Pair(0,0), Pair(0,1), Pair(0,2), Pair(1,1), Pair(2,0), Pair(2,1), Pair(2,2))
    return relativeList.sumOf { i -> arr[row + i.first][col + i.second] }
}


