import org.junit.Test

import org.junit.Assert.*

class FunctionsForTestKtTest {

    @Test
    fun main () {
    }

    @Test
    fun comissionBasedOnType() {
        val expected = 112.5
        val result = ru.netology.comissionBasedOnType("VISA", 1500.0)

        assertEquals(expected.toInt(), result.toInt())
    }

    @Test
    fun transaction() {
        val expected = 140.0
        val result = ru.netology.transaction(80.0, 1500.0, 112.5)

        assertEquals(expected.toInt(), result.toInt())
    }
    @Test
    fun limitations () {
    }
}