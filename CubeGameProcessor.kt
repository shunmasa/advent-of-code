


import java.io.File
class CubeGameProcessor(private val puzzleInput: List<String>, private val targetCubes: Map<String, Int>) {
    fun calculatePossibleGamesSum(): Int {
        var possibleGamesSum = 0

     
        for (line in puzzleInput) {
           
            val (gameId, subsetsString) = line.split(":")
            val gameIdNumber = gameId.trim().split(" ")[1].toInt()

           
            val subsets = subsetsString.split(";").map { it.trim() }
            val cubeCounts = mutableMapOf("red" to 0, "green" to 0, "blue" to 0)

            for (subset in subsets) {
                val cubes = subset.split(", ")
                for (cube in cubes) {
                    val color = cube.split(" ")[1]
                    cubeCounts[color] = cubeCounts[color]!! + 1
                }
            }

            // Check if the game is possible based on cube counts
            if (cubeCounts == targetCubes) {
                possibleGamesSum += gameIdNumber
            }
        }

        return possibleGamesSum
    }
}