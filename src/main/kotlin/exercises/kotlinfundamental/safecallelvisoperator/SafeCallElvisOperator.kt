package exercises.kotlinfundamental.safecallelvisoperator

fun main() {
    safeCall()
    elvisOperator()
}

/*
* Safe call akan menjamin kode yang kita tulis aman dari NullPointerException.
* Dalam menggunakan safe call, kita akan mengganti tanda titik (.) dengan tanda (?.) saat mengakses atau mengelola nilai dari objek nullable.
* Dengan safe call, kompiler akan melewatkan proses jika objek tersebut bernilai null.
*/
fun safeCall() {
    val text: String? = null
    text?.length
}

/*
* Elvis operator memungkinkan kita untuk menetapkan default value atau nilai dasar jika objek bernilai null.
*/
fun elvisOperator() {
    val text: String? = null
    val textLength = text?.length ?: 7

    // traditional if else
    val textLengths = if (text != null) text.length else 7

    /*
    * assertion non null
    * Dengan menggunakan non-null assertion kompiler akan mengizinkan kita untuk mengakses atau mengelola nilai dari sebuah objek nullable.
    * Namun penggunaan operator tersebut sangat tidak disarankan karena akan memaksa sebuah objek menjadi non-null.
    * Sehingga ketika objek tersebut bernilai null, Anda tetap akan berjumpa dengan NullPointerException.
    */
    val textLengthss = text!!.length // ready to go ???
}