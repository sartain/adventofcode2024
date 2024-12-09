import java.util.*
import kotlin.math.abs

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