import kotlin.math.abs
import kotlin.streams.toList

fun completeDay1Part1() {
    val puzzleInput = openFileAndSplitIntoLines(1)
    println("Part One: " + getTotalDifferenceAcrossAllIndexesGivenPuzzleInput(puzzleInput))
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
