import java.io.*
import java.util.*

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */

    val length = readLine().toString().toInt()
    val phoneBook = hashMapOf<String,String>()
    (0 until length).forEach {
        val line = readLine().toString()
        phoneBook[line.substringBefore(" ").trim()] = line.substringAfter(" ").trim()
    }

    for (i in 0 until 100000) {
        val tmp = readLine()
        if (tmp.isNullOrBlank()) break
        else {
            val prefix = if (phoneBook.containsKey(tmp))"$tmp=" else ""
            val suffix = phoneBook.getOrDefault(tmp, "Not found")
        println("$prefix$suffix")
        }
    }
}