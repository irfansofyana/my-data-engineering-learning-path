object Learn2 {
    def main(args: Array[String]): Unit = {
        //flow control

        // If /else
        if (1 > 3) println("Impossible!") else println("The world make sense!")

        if (1 > 3) {
            println("Impossible!")
            println("Really?")
        } else {
            println("The world makes sense.")
            println("still.")
        }

        val number = 3
        number match {
            case 1 => println("One")
            case 2 => println("two")
            case 3 => println("three")
            case _ => println("something else")
        }

        // for statement
        for (x <- 1 to 4) {
            val squared = x * x
            println(squared)
        }

        // while statement
        var x = 10
        while (x >= 0) {
            println(x)
            x -= 1
        }

        // do-while statement
        x = 0
        do {
            println(x)
            x += 1
        } while (x <= 10)

        // expression
        { val x = 10; x+20 }
        println({ val x = 10; x+20 })

        var a = 0
        var b = 1

        println(a)
        println(b)
        for (i <- 2 to 9) {
            var c = a + b
            println(c)
            a = b
            b = c
        }
    }
}