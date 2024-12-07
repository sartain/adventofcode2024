fun splitNumbersGivenString(input: String): List<Int>{
    val splitInput = input.split("    ")
    return splitInput.stream()
        .map { e -> e.toInt() }
        .toList()
}