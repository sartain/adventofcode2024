import kotlin.math.abs
import kotlin.streams.toList

fun completeDay1() {
    val puzzleInput = openFileAndSplitIntoLines(1)
    println("Part One: " + getTotalDifferenceAcrossAllIndexesGivenPuzzleInput(puzzleInput))
    println("Part Two: " + getTotalSimilarityScoreGivenPuzzleInput(puzzleInput))
}

fun getTotalDifferenceAcrossAllIndexesGivenPuzzleInput(input: List<String>): Int {
    val leftSide = getSortedLeftSideGivenListOfNumbers(input)
    val rightSide = getSortedRightSideGivenListOfNumbers(input)
    return getTotalDifferenceAcrossAllIndexes(leftSide, rightSide)
}

fun getSortedLeftSideGivenListOfNumbers(input: List<String>): List<Int> {
    return input.stream()
        .map { inputString -> splitNumbersGivenString(inputString)[0] }
        .sorted()
        .toList()
}

fun getSortedRightSideGivenListOfNumbers(input: List<String>): List<Int> {
    return input.stream()
        .map { inputString -> splitNumbersGivenString(inputString)[1] }
        .sorted()
        .toList()
}

fun getTotalDifferenceAcrossAllIndexes(leftInput: List<Int>, rightInput: List<Int>): Int {
    var total = 0
    rightInput.forEachIndexed { index, right ->
        total += abs(right.minus(leftInput[index]))
    }
    return total
}

fun splitNumbersGivenString(input: String): List<Int> {
    val splitInput = input.split("   ")
    return splitInput.stream()
        .map { e -> e.toInt() }
        .toList()
}

fun getTotalSimilarityScoreGivenPuzzleInput(puzzleInput: List<String>): Int {
    val leftSide = getSortedLeftSideGivenListOfNumbers(puzzleInput)
    val rightSide = getSortedRightSideGivenListOfNumbers(puzzleInput)
    val frequencyMap = getFrequencyMapOfValuesInRightSide(rightSide)
    return calculateSimilarityScoreGivenLeftAndFrequencyMap(leftSide, frequencyMap)
}

fun getFrequencyMapOfValuesInRightSide(sortedRightInput: List<Int>): Map<Int, Int> {
    val map = mutableMapOf<Int, Int>()
    for (inputNumber in sortedRightInput) {
        val currentCount = map[inputNumber] ?: 0
        map[inputNumber] = currentCount + 1
    }
    return map
}

fun calculateSimilarityScoreGivenLeftAndFrequencyMap(
    leftInput: List<Int>,
    frequencyMap: Map<Int, Int>
): Int {
    return leftInput.stream()
        .map { leftNumber -> leftNumber * (frequencyMap[leftNumber] ?: 0)}
        .toList()
        .sum()
}