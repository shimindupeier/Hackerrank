import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'factorial' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER n as parameter.
 */

tailrec fun factorial(n: Long, a:Long = 1L): Long {
    // Write your code here
//    return if (n == 1L) n
//    else n * factorial(n-1)
    return if (n == 1L) a
    else factorial(n-1, n*a)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toLong()

    val result = factorial(n)

    println(result)
}