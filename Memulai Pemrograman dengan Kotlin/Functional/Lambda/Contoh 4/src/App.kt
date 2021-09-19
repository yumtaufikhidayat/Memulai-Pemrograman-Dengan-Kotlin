// main function
fun main() {

    printResult(30, { value ->
        value + value
    })
}

fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

fun print_result(nilai : Int,summ : (Int) -> Int ){
    val result = summ(nilai)
    print(result)
}

var summ : (Int) -> Int = { value -> value + value}