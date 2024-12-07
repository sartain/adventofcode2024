import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Day1Test {

    @Test
    fun splitNumbersGivenWhitespace() {
        val input = "12345    67892"
        val expected = listOf(12345, 67892)
        val actual = splitNumbersGivenString(input)
        assertEquals(actual, expected)
    }

    @Test
    fun givenSortedListOfInputsGetLeftSide() {
        val input = listOf(
            "3    2",
            "2    5",
            "9    8",
            "6    5666",
            "5655    5"
        )
        val expected = listOf(
            2,
            3,
            6,
            9,
            5655
        )
        val actual = getSortedLeftSideGivenListOfNumbers(input)
        assertEquals(actual, expected)
    }

    @Test
    fun givenSortedListOfInputsGetRightSide() {
        val input = listOf(
            "1    2",
            "2    8",
            "6    5",
            "9    5666",
            "5655    1"
        )
        val expected = listOf(
            1,
            2,
            5,
            8,
            5666
        )
        val actual = getSortedRightSideGivenListOfNumbers(input)
        assertEquals(actual, expected)
    }

}