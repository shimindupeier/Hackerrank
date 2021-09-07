fun main(args: Array<String>) {

    val arr = Array<Array<Int>>(6, { Array<Int>(6, { 0 }) })

    for (i in 0 until 6) {
        arr[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val temp = (0 until 4).flatMap { row -> (0 until 4).map { col -> val sum = computeSum(arr, row, col)
        sum
    } }
    println(temp.maxOrNull())
}

private fun computeSum(arr: Array<Array<Int>>, row: Int, col: Int) =
    arr[row][col] + arr[row][col + 1] + arr[row][col + 2] +
            arr[row + 1][col + 1] +
            arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2]


