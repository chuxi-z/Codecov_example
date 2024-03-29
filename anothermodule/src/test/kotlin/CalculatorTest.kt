import com.example.anothermodule.Calculator
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CalculatorTest {

    @Test
    fun testAdd() {
        val result = Calculator().add(2, 3)
        val expected = 5
        assertEquals(expected, result)
    }

    @Test
    fun testSubtract() {
        val result = Calculator().subtract(2, 3)
        val expected = -1
        assertEquals(expected, result)
    }

    @Test
    fun testMultiply() {
        val result = Calculator().multiply(2, 3)
        val expected = 6
        assertEquals(expected, result)
    }

    @Test
    fun testDivide() {
        val result = Calculator().divide(6, 3)
        val expected = 2
        assertEquals(expected, result)
    }

    @Test
    fun testSquare() {
        val result = Calculator().square(6)
        val expected = 36
        assertEquals(expected, result)
    }

    @Test
    fun testSquare_failure() {
        val result = Calculator().square(6)
        val failureExpected = 35
        assertEquals(failureExpected, result)
    }

    @Test
    fun testDivide_failure() {
        val result = Calculator().divide(6, 3)
        val failureExpected = 3
        assertEquals(failureExpected, result)
    }
}