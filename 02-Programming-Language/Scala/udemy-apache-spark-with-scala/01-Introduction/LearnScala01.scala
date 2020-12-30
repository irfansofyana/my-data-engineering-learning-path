object Learn1 {
    def main(args: Array[String]): Unit = {
        // Values is immutable
        val hello: String = "Hola!"

        // Variables are mutable
        var helloThere: String = hello
        helloThere = helloThere + " There!"
        println(helloThere)

        // Data Types
        val numberOne: Int = 1
        val truth: Boolean = true
        val letterA: Char = 'a'
        val pi: Double = 3.14159265
        val piSinglePrecision: Float = 3.14159265f
        val bigNumber: Long = 1231231231
        val smallNumber: Byte = 127

        // Standard println
        println("Here is a mess: " + numberOne + truth + letterA + pi + bigNumber + smallNumber)

        // Use f-format like printf in C/C++
        println(f"Pi is about $piSinglePrecision%.3f")
        println(f"Zero padding on the left: $numberOne%05d")

        // Print as string
        println(s"I can use the s prefix to use variables like $numberOne $truth and $letterA")

        // Expression in println
        println(s"s-prefix is not limited to the variables. Like ${1+2}")

        val theUltimateAnswer: String = "To life, the universe, and everything is 42."
        val pattern = """.* ([\d]+).*""".r
        val pattern(answerString) = theUltimateAnswer
        val answer = answerString.toInt
        println(answer)

        // Booleans
        val isGreater = 1 > 2
        println(isGreater)

        val isLesser = 1 < 2
        println(isLesser)

        val impossible = isGreater && isLesser
        println(impossible)

        val picard: String = "Picard"
        val bestCaptain: String = "Picard"
        val isBest: Boolean = picard == bestCaptain

        // EXERCISE
        // Write some code that takes the value of pi, doubles it, and then prints it within a string with
        // three decimal places of precision to the right.
        val doublePi: Double = 2 * pi
        println(f"The double of pi = $doublePi%.2f")
    }
}