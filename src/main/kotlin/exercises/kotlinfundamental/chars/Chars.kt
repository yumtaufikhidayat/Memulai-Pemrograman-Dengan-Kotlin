package exercises.kotlinfundamental.chars

fun main() {
    /*
    * Tipe data Char hanya dapat kita gunakan untuk menyimpan karakter tunggal.
    * Sebaliknya jika kita memasukkan lebih dari 1 (satu) karakter, maka akan terjadi error
    */
    val character = 'A'
    // val longCharacter: Char = 'ABC' // Incorrect character literal

    // Increment (++) dan decrement (--) pada Char
    var vocal = 'A'

    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)

    /*
   output:
       Vocal A
       Vocal B
       Vocal C
       Vocal D
       Vocal C
       Vocal B
       Vocal A
    */
}