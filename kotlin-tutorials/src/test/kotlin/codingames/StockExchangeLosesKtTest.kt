package codingames

import kotlin.test.Test
import kotlin.test.assertEquals

internal class StockExchangeLosesKtTest {

    @Test
    fun testWorstCase() {
        assertEquals(-3, getTheWorstCase2(listOf(3, 2, 4, 2, 1, 5)))
    }

    @Test
    fun testWorstCaseForum() {
        assertEquals(-14, getTheWorstCase2(listOf(5, 3, 2, 20, 6, 14)))
    }

    @Test
    fun testWorstCaseVaried() {
        assertEquals(-3, getTheWorstCase(listOf(3, 2, 10, 7, 15, 14)))
    }
}