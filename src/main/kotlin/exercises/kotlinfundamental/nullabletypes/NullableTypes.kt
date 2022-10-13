package exercises.kotlinfundamental.nullabletypes

fun main() {
    nullableTypes()
}

/*
* Pada Kotlin kita dimudahkan untuk mengelola variabel nullable sehingga dapat meminimalisir terjadinya NullPointerException.
* Kotlin hadir dengan penanganan nullability yang mudah.
* Kotlin mampu membedakan objek yang boleh bernilai null dan objek yang tidak boleh bernilai null pada saat objek tersebut dibuat.
* */
fun nullableTypes() {
    // val text: String = null // compile time error

    // Add ? after data type for nullable value
    val text: String? = null // ready to go
    // val textLength = text.length // compile time error
    if (text != null){
        val textLength = text.length // ready to go
        println(textLength)
    }
}