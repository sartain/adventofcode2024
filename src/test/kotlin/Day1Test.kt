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

}