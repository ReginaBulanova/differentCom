import org.junit.Test

import org.junit.Assert.*

class FunctionsForTestKtTest {

    @Test
    fun comissionBasedOnType() {
        val expected = 112.5
        val result = ru.netology.comissionBasedOnType("VISA", 1500.0)

        assertEquals(expected.toInt(), result.toInt())

        val expected1 = 92.5
        val result1 = ru.netology.comissionBasedOnType("MIR", 1234.9)
        assertEquals(expected1.toInt(), result1.toInt())

        val expected2 = 80.0
        val result2 = ru.netology.comissionBasedOnType("MasterCard", 1000.0)
        assertEquals(expected2.toInt(), result2.toInt())
    }

    @Test
    fun transaction() {
        val expected = 112.0
        val result = ru.netology.transaction(80.0, 1500.0, 112.5)
        assertEquals(expected.toInt(), result.toInt())

        val expected1 = 92.5
        val result1 = ru.netology.transaction(34567.9, 1234.9, 92.5)
        assertEquals(expected1.toInt(), result1.toInt())

        val expected2 = 80.0
        val result2 = ru.netology.transaction(1000.0, 99.0, 80.0)
        assertEquals(expected2.toInt(), result2.toInt())
    }
}