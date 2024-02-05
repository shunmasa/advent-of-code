

import java.io.File




fun main() {
 
     val calibrationDocumentFilePath = "calibration_document.txt"
     val calibrationDocument = File(calibrationDocumentFilePath).readLines()
 

     val calibrationProcessor = CalibrationDocumentProcessor(calibrationDocument)
 

     val sum = calibrationProcessor.calculateCalibrationSum()
 
     // Print the result
     println("Sum of calibration values: $sum")




     ////For CubeGameProcessor

    val puzzleInputFileName = "puzzle_input.txt"
    val puzzleInput = File(puzzleInputFileName).readLines()

    // Target cube counts
    val targetCubes = mapOf("red" to 12, "green" to 13, "blue" to 14)


    val cubeGameProcessor = CubeGameProcessor(puzzleInput, targetCubes)


    val possibleGamesSum = cubeGameProcessor.calculatePossibleGamesSum()

    println("Sum of IDs of possible games: $possibleGamesSum")

}