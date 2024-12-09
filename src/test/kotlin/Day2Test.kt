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

    @Test
    fun givenListOfReportsCountSafe() {
        val listOfReports = listOf(
            "1 2",
            "20 30",
            "31 30 29",
            "2 1 0"
        )
        val expected = 3
        val actual = countNumberOfSafeReports(listOfReports)
        assertEquals(expected, actual)
    }

    @Test
    fun givenDampenerMarkSafeWithAscendingNode() {
        val report = mutableListOf(1, 2, 3, 2, 4)
        val actual = givenReportMarkSafetyWithDampener(report)
        assertTrue(actual)
    }

    @Test
    fun givenDampenerMarkUnSafeWithSeveralIncorrectNodes() {
        val report = mutableListOf(1, 2, 3, 2, 1)
        val actual = givenReportMarkSafetyWithDampener(report)
        assertFalse(actual)
    }

    @Test
    fun givenDampenerMarkSafeWithFirstIncorrectNodes() {
        val report = mutableListOf(1, 5, 6, 7, 8)
        val actual = givenReportMarkSafetyWithDampener(report)
        assertTrue(actual)
    }

    @Test
    fun givenDampenerMarkSafeWithFinalIncorrectNodes() {
        val report = mutableListOf(1, 2, 3, 4, 12)
        val actual = givenReportMarkSafetyWithDampener(report)
        assertTrue(actual)
    }

    @Test
    fun givenDampenerMarkSafeWithMatchingFirstNode() {
        val report = mutableListOf(1, 1, 2, 3, 4)
        val actual = givenReportMarkSafetyWithDampener(report)
        assertTrue(actual)
    }

    @Test
    fun givenListOfReportsCountSafeDampener() {
        val listOfReports = listOf(
            "7 6 4 2 1",
            "1 2 7 8 9",
            "9 7 6 2 1",
            "1 3 2 4 5",
            "8 6 4 4 1",
            "1 3 6 7 9"
        )
        val expected = 4
        val actual = countNumberOfSafeReportsWithDampener(listOfReports)
        assertEquals(expected, actual)
    }

}