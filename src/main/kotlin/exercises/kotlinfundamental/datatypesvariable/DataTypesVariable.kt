package exercises.kotlinfundamental.datatypesvariable

fun main() {
    // tipe data String
    // var -> nilai yang sudah diinisialisasikan bisa diubah-ubah
    var company: String = "Dicoding"
    company = "Dicoding Academy"

    // val -> nilai yang sudah diinisialisasikan tidak dapat diubah-ubah
    val companyNew: String = "Dicoding"
//    companyNew = "Dicoding Academy" // val cannot be reassigned

    val firstWord = "Dicoding "
    val lastWord = "Academy"
    println(firstWord + lastWord) // output: Dicoding Academy

    val valueA: Int = 10
    val valueB = 20
    println(valueA + valueB) // output: 30
}