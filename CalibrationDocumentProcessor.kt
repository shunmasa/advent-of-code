

import java.io.File
class CalibrationDocumentProcessor(public val document: List<String>) {
    fun calculateCalibrationSum(): Int {
        var sum = 0

        for (line in document) {
            val firstDigit = line.firstOrNull { it.isDigit() }
            val lastDigit = line.lastOrNull { it.isDigit() }

            if (firstDigit != null && lastDigit != null) {
                val calibrationValue = ("" + firstDigit + lastDigit).toInt()
                sum += calibrationValue
            }
        }

        return sum
    }
}
