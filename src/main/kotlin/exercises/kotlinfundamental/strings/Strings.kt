package exercises.kotlinfundamental.strings

fun main() {
    /*
    * Tipe data String bisa menampung beberapa karakter di dalamnya
    * String direpresentasikan menggunakan tipe String.
    * Nilai yang berada di dalam sebuah variabel dengan tipe data String merupakan kumpulan dari beberapa karakter
    */
    val textString: String = "Kotlin"

    /*
    * Mendapatkan karakter tunggal pada String menggunakan indexing
    * Indexing merupakan sebuah cara yang memudahkan kita untuk mengakses elemen yang berada di dalam sebuah Collection
    * dengan memanfaatkan index atau posisi dari elemen tersebut. Posisi dari sebuah elemen pada umumnya dimulai dari angka 0.
    * Nilai 0 yaitu posisi dari karakter yang diakses
    */
    val text  = "Kotlin"
    val firstChar = text[0] // text[0] = indexing
    println("First character of $text is $firstChar")

    // Iterasi terhadap objek String
    val texts  = "Kotlin"
    for (char in texts){
        print("$char ")
    }
    // output : K o t l i n

    /*
    * Literal String pada Kotlin ada 2, yaitu:
    * 1. Escaped String yang memungkinkan kita untuk mengurangi ambiguitas nilai yang berada di dalam sebuah String.
    * 2. Raw String memungkinkan kita menuliskan multiline dan arbitrary text. Ketika ingin membuat beberapa baris String,
    * biasanya kita melakukan escaped terhadap String dengan memanfaatkan karakter escape \n
    */
    println()
    val statement = "Kotlin is \"Awesome!\"" // escaped string
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent() // raw string
    println(line)
}