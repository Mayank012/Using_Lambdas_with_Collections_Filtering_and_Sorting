fun main(args: Array<String>) {

    val myNumbers = listOf(2, 3, 4, 6, 23, 90)

    val myPredicate = { num: Int -> num > 10 }

    val check1 = myNumbers.all(myPredicate) // are all elements greater than 10 ?
    println(check1)

    val check2 = myNumbers.any(myPredicate)  // does any these elements satisfy the predicate ?
    println(check2)

    val check3 = myNumbers.count(myPredicate) // Number of elements that specify the Predicates
    println(check3)

    val check4 = myNumbers.find(myPredicate)  // Return the first number that matches the predicate
    println(check4)

}