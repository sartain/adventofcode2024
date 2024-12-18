import kotlin.math.abs

fun completeDay2() {
    givenInputPrintCountOfSafeReports()
    givenInputPrintCountOfSafeReportsWithDampener()
}

fun givenInputPrintCountOfSafeReportsWithDampener() {
    val puzzleInput = openFileAndSplitIntoLines(2)
    println("Part Two: " + countNumberOfSafeReportsWithDampener(puzzleInput))
}

fun countNumberOfSafeReportsWithDampener(inputList: List<String>): Int {
    return inputList.map { input -> givenInputStringGetListOfNumbers(input) }
        .filter { report -> givenReportMarkSafetyWithDampener(report) }
        .size
}

fun givenInputPrintCountOfSafeReports() {
    val puzzleInput = openFileAndSplitIntoLines(2)
    println("Part One: " + countNumberOfSafeReports(puzzleInput))
}

fun countNumberOfSafeReports(inputList: List<String>): Int {
    return inputList.map { input -> givenInputStringGetListOfNumbers(input) }
        .filter { report -> givenReportMarkSafety(report) }
        .size
}

fun givenInputStringGetListOfNumbers(input: String): List<Int> {
    return input.split(" ")
        .map { e -> e.toInt() }
        .toList()
}

fun givenReportMarkSafety(report: List<Int>): Boolean {
    val ascendingReport = report.sorted()
    val descendingReport = report.sortedDescending()
    if ((ascendingReport != report) && (descendingReport != report)) {
        return false
    }
    else {
        val offsetReport = report.drop(1)
        val firstOffsetReport = report.dropLast(1)
        for (indexedValue in firstOffsetReport.withIndex()) {
            val index = indexedValue.index
            val difference = abs(indexedValue.value.minus(offsetReport[index]))
            if (difference < 1 || difference > 3) {
                return false
            }
        }
        return true
    }
}

fun givenReportMarkSafetyWithDampener(report: List<Int>): Boolean {
    for (indexedValue in report.withIndex()) {
        val index = indexedValue.index
        if (givenReportMarkSafety(report.filterIndexed { i, _ -> i != index})) {
            return true
        }
    }
    return givenReportMarkSafety(report)
}