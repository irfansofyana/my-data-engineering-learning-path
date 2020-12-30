object Learn4 {
    def main(args: Array[String]) : Unit = {
        // Data Structures
        
        // Tuples
        // Immutable lists

        val people = ("irfan", "abdul", "firman")
        println(people)

        // Refer to individual field with 1-based indexing
        val irfan = people._1
        val abdul = people._2
        val firman = people._3
        println(irfan)
        println(abdul)
        println(firman)

        // key-value
        val kv1 = "irfan" -> "ganteng"
        println(kv1._2)

        // mixing data structure
        val aBunchOfStuff = ("irfan", 1999, true)
        println(aBunchOfStuff)

        // Lists

        // Like a tuple but more functionality and should be the same type
        val students = List("sofyana", "najib", "winanda")
        println(students)

        // extract first student
        // remember to use 0-indexing
        println(students(0))

        // head -> the first element
        println(students.head)
        // tail -> all element except head
        println(students.tail)

        // iterating list
        for (student <- students) {
        println(student)
        }

        // map() : apply function to collection
        val backwardStudents = students.map((student: String) => student.reverse)
        for (student <- backwardStudents) {
            println(student)
        }

        // reduce(): combine together all the items in collection
        val numberList = List(1, 2, 3, 4, 5)
        val sum = numberList.reduce((x: Int, y: Int) => x + y)
        println(sum)

        // filter(): remove stuff
        val iHateFives = numberList.filter((x : Int) => x != 5)
        println(iHateFives)
        val iHateFivesVer2 = numberList.filter(_ != 5)
        println(iHateFivesVer2)

        // Concatenate Lists
        val moreNumbers = List(6, 7, 8)
        val lotsOfNumbers = numberList ++ moreNumbers
        println(lotsOfNumbers)

        // reverse a list
        val reversed = numberList.reverse

        // sort a list
        val sorted = reversed.sorted

        // concatenate list
        val lotsOfDuplicates = numberList ++ numberList

        // unique/distinct list
        val distinctValues = lotsOfDuplicates.distinct

        // max element
        val maxValue = numberList.max

        // sum all element
        val total = numberList.sum

        // check availability
        val hasThree = numberList.contains(3)

        // Maps
        val favLanguages = Map("irfan" -> "scala", "winanda" -> "haskell", "najib" -> "java")
        println(favLanguages("irfan"))
        println(favLanguages.contains("jevan"))
        val check = util.Try(favLanguages("jevan")) getOrElse "unknown"
        println(check)

        // practice
        var multipleThree = List(1)
        for (i <- 2 to 20) {
            multipleThree = multipleThree ++ List(i)
        }
        println(multipleThree)
        println(multipleThree.filter((num: Int) => num % 3 == 0))
    }
}