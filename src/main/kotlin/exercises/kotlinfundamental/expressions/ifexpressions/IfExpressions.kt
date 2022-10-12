package exercises.kotlinfundamental.expressions.ifexpressions

fun main() {
    ifExpressions()
}

/*
* If akan digunakan untuk menguji suatu kondisi untuk menjalankan sebuah proses.
* If akan mengeksekusi sebuah statement atau expression jika hasil evaluasi dari expressions yang diberikan pada blok if bernilai true.
* Sebaliknya, jika bernilai false maka proses yang ditentukan akan dilewatkan.
* */
fun ifExpressions() {
    // Simple if statement
    val openHours = 7
    val now = 20
    if (now > openHours){
        println("office already open")
    }

    // If expression with else branch
    val openHour = 7
    val timeNow = 20
    val office: String = if (timeNow > openHour) "Office already open" else "Office is closed"
    println(office)

    // If expression with else if branch
    val hourOpen = 7
    val thisTimeNow = 7
    val officeOpen: String = if (thisTimeNow > 7) {
        "Office already open"
    } else if (thisTimeNow == hourOpen){
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    print(officeOpen)
}