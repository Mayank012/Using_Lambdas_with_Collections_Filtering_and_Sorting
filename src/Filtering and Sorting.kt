fun main(args: Array<String>) {

    val myNumbers: List<Int> = listOf(2, 4, 6, 10, 50, 100)

    // Filter
    val mySmallNums: List<Int> = myNumbers.filter { it < 10 }

    for (num in mySmallNums)
        println(num)

    println()

    // Map
    val mySquaredNums = myNumbers.map { it * it }

    for (num in mySquaredNums)
        println(num)

    println()

    var mySmallSquaredNums = myNumbers.filter { it < 10 }
                                      .map { it * it }

    for (num in mySmallSquaredNums)
        println(num)

    println()

    var people = listOf<Person>(Person("Luffy", 19), Person("Sanji", 20), Person("Zoro", 24))

    var names = people.filter { it.name.startsWith("S") }
                      .map { it.name }

    for (name in names)
        println(name)
}

class Person(var name: String, var age: Int) {
    // Some other code..
}