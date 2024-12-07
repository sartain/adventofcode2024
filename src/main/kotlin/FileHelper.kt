import java.util.Objects.toString

fun openFileAndSplitIntoLines(dayNumber: Int): List<String> {
    return object {}.javaClass.getResourceAsStream("day" + toString(dayNumber) + ".txt")?.bufferedReader()?.readLines()!!
}
