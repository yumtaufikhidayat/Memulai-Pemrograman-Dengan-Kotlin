fun main() {
    val listNumber = 1.rangeTo(100)

    for (number in listNumber) {
        // TODO 1
        if (number % 2 == 0) continue

        // TODO 2
        if (number > 15) break

        // TODO 3
        var result : Int
        val numb = number * (number + 10)
        result = numb
        println("range result is $result")
    }
}