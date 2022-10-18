package exercises.controlflow.expressionsstatements

fun main() {
    expressionsStatements()
}

/*
* Expression adalah statement yang dapat mengembalikan nilai dan bisa kita simpan ke dalam sebuah variabel.
* Statement pada Kotlin adalah suatu percabangan biasa yang tidak mengembalikan nilai apapun.
*/
fun expressionsStatements() {
    // contoh statement
    val openOffice = 7
    val now = 8
    if (now > openOffice)
        println("Office already open")
    else
        println("Office close")

    // contoh statement
    val office = if (now > openOffice) "Office already open" else "Office close"
    println(office)

    // contoh nested statement
    println(sum(1, 1 * 4))

    val value1 = 10
    val value2 = 10
    println(sum(value1, value2))
}

fun sum(value1: Int, value2: Int) = value1 + value2