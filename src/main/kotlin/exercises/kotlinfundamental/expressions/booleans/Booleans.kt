package exercises.kotlinfundamental.expressions.booleans

fun main() {
    booleans()
}

/*
* Boolean adalah sebuah tipe data yang hanya memiliki dua nilai, yaitu true dan false.
*/
fun booleans() {
    // Boolean expression with conjunction or AND (&&)
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = now >= officeOpen && now <= officeClosed
    println("Office is open : $isOpen")
    /*
        Output : Office is open : false
     */

    // Boolean expression with disjunction or OR (||)
    val officeIsOpen = 7
    val officeIsClosed = 16
    val timeNow = 20

    val isOfficeClose = timeNow < officeIsOpen || timeNow > officeIsClosed
    println("Office is closed : $isOfficeClose")
    /*
        Output : Office is closed : true
     */

    // Boolean expression with negation or NOT (!)
    val officeOpenHour = 7
    val hourNow = 10
    val isOpenOffice = hourNow > officeOpenHour

    if (!isOpenOffice) println("Office is closed") else println("Office is open")
    /*
        Output : Office is open
     */
}