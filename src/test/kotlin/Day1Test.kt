import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Day1Test {

    @Test
    fun splitNumbersGivenWhitespace() {
        val input = "12345   67892"
        val expected = listOf(12345, 67892)
        val actual = splitNumbersGivenString(input)
        assertEquals(actual, expected)
    }

    @Test
    fun givenSortedListOfInputsGetLeftSide() {
        val input = listOf(
            "3   2",
            "2   5",
            "9   8",
            "6   5666",
            "5655   5"
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
            "1   2",
            "2   8",
            "6   5",
            "9   5666",
            "5655   1"
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

    @Test
    fun givenSortedListsFindTotalDifferenceBetweenEachIndex() {
        val leftInput = listOf(
            10,
            20,
            30,
            40,
            50
        )
        val rightInput = listOf(
            15, //5
            23, //8
            31, //9
            40, //9
            49 //10
        )
        val expected = 10
        val actual = getTotalDifferenceAcrossAllIndexes(leftInput, rightInput)
        assertEquals(actual, expected)
    }

    @Test
    fun givenPuzzleInputFindTotalDifferenceBetweenEachIndex() {
        val input = listOf(
            "10   23",
            "20   15",
            "50   49",
            "30   40",
            "40   31"
        )
        val expected = 10
        val actual = getTotalDifferenceAcrossAllIndexesGivenPuzzleInput(input)
        assertEquals(actual, expected)
    }

    @Test
    fun givenRightInputCalculateFrequencyOfValue() {
        val rightInput = listOf(
            2,
            2,
            6,
            6,
            6,
            10,
            12
        )
        val expected = mapOf(
            2 to 2,
            6 to 3,
            10 to 1,
            12 to 1
        )
        val actual = getFrequencyMapOfValuesInRightSide(rightInput)
        assertEquals(actual, expected)
    }

    @Test
    fun givenLeftInputAndFrequencyMapCalculateSimilarityScore() {
        val leftInput = listOf(
            1
        )
        val frequencyMap = mapOf(
            1 to 2
        )
        val expected = 2
        val actual = calculateSimilarityScoreGivenLeftAndFrequencyMap(leftInput, frequencyMap)
        assertEquals(actual, expected)
    }

    @Test
    fun givenLeftInputAndFrequencyMapCalculateSimilarityScoreCalculateSum() {
        val leftInput = listOf(
            1,
            5,
            5,
            10
        )
        val frequencyMap = mapOf(
            1 to 2,
            5 to 1,
            9 to 7
        )
        val expected = 12
        val actual = calculateSimilarityScoreGivenLeftAndFrequencyMap(leftInput, frequencyMap)
        assertEquals(actual, expected)
    }

    @Test
    fun givenPuzzleInputCalculateSimilarityScoreCalculateSum() {
        val puzzleInput = listOf(
            "1   5",
            "10   5",
            "5   1",
            "6   9",
            "5   12"
        )
        val expected = 21
        val actual = getTotalSimilarityScoreGivenPuzzleInput(puzzleInput)
        assertEquals(expected, actual)
    }



}