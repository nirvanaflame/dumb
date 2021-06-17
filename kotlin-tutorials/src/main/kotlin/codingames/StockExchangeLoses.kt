package codingames

import java.nio.charset.Charset
import java.util.*

fun main() {
    val input = Scanner(System.`in`, Charset.defaultCharset())
    val n = input.nextInt()
    var m = 0
    var s = 0

    for (i in 0 until n) {
        val v = input.nextInt()
        s = if (v > s) v else s
        m = if (v - s < m) v - s else m
    }

    println(m)
}

fun getTheWorstCase(stonks: List<Int>): Int? {
    val diffs = mutableListOf(stonks[1] - stonks[0])
    val maxLosses = mutableListOf(diffs[0])

    for (i in 2 until stonks.size) {
        val diff = stonks[i] - stonks[i - 1]
        diffs.add(diff)

        val loss = maxLosses[i - 2] + diffs[i - 1]
        maxLosses.add(diff.coerceAtMost(loss))
    }

    return if (maxLosses.minOrNull()!! > 0) 0 else maxLosses.minOrNull()
}

fun getTheWorstCase2(stonks: List<Int>): Int {
    var loss = 0
    var max = 0

    for (i in stonks.indices) {
        val value = stonks[i]
        max = if (value > max) value else max
        loss = if (value - max < loss) value - max else loss
        println("i=$i and $value and max=$max and loss=$loss")
    }

    return loss
}
