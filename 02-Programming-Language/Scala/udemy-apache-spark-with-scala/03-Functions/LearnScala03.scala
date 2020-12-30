object Learn3 {
    def main(args: Array[String]) : Unit = {
        // Functions
        // format def <function name>(parameter name: type...): return type = {}

        def squareIt(x: Int) : Int = {
            x * x
        }

        def cubeIt(x: Int) : Int =  x * x * x

        println(squareIt(5))
        println(cubeIt(3))

        // function with input parameter function
        def transformInt(x: Int, f: Int => Int): Int = f(x)

        val result = transformInt(2, cubeIt)
        println(result)

        // function with input parameter lambda function
        val result2 = transformInt(3, x => x * x * x)
        val result3 = transformInt(10, x => x / 2)
        val result4 = transformInt(2, x => {val y = x * 2; y * y})

        def transformString(str: String): String = str.toUpperCase()
        val capitalizeString = (str: String) => str.toUpperCase()

        val string1 = transformString("irfan")
        val string2 = capitalizeString("irfan")
        println(string1)
        println(string2)
    }
}