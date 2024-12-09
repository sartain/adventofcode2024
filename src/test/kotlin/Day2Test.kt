import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Day2Test {

    @Test
    fun formatStringToNumberList() {
        val input = "73 75 78 81 80"
        val expected = listOf(73, 75, 78, 81, 80)
        val actual = givenInputStringGetListOfNumbers(input)
        assertEquals(expected, actual)
    }

    @Test
    fun givenSafeReportMarkSafe() {
        val report = listOf(1, 4, 5, 6, 8)
        val actual = givenReportMarkSafety(report)
        assertTrue(actual)
    }

    @Test
    fun givenDescendingSafeReportMarkSafe() {
        val report = listOf(10, 7, 4, 2, 1)
        val actual = givenReportMarkSafety(report)
        assertTrue(actual)
    }

    @Test
    fun givenMatchMarkUnsafe() {
        val report = listOf(1, 1)
        val actual = givenReportMarkSafety(report)
        assertFalse(actual)
    }

    @Test
    fun givenTooHighADifferenceMarkUnsafe() {
        val report = listOf(1, 5)
        val actual = givenReportMarkSafety(report)
        assertFalse(actual)
    }

}