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
    fun givenListOfInputsGetLeftSide() {
        val input = listOf(
            "1    2",
            "2    5",
            "6    8",
            "9    5666",
            "5655    5"
        )
        val expected = listOf(
            1,
            2,
            6,
            9,
            5655
        )
        val actual = getLeftSideGivenListOfNumbers(input)
        assertEquals(actual, expected)
    }

    @Test
    fun givenListOfInputsGetRightSide() {
        val input = listOf(
            "1    2",
            "2    5",
            "6    8",
            "9    5666",
            "5655    5"
        )
        val expected = listOf(
            2,
            5,
            8,
            5666,
            5
        )
        val actual = getRightSideGivenListOfNumbers(input)
        assertEquals(actual, expected)
    }

}