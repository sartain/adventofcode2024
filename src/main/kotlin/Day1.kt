import kotlin.streams.toList

fun splitNumbersGivenString(input: String): List<Int> {
    val splitInput = input.split("    ")
    return splitInput.stream()
        .map { e -> e.toInt() }
        .toList()
}

fun getLeftSideGivenListOfNumbers(input: List<String>): List<Int> {
    return input.stream()
        .map { inputString -> splitNumbersGivenString(inputString)[0] }
        .toList()
}

fun getRightSideGivenListOfNumbers(input: List<String>): List<Int> {
    return input.stream()
        .map { inputString -> splitNumbersGivenString(inputString)[1] }
        .toList()
}