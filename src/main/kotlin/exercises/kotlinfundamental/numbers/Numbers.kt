package exercises.kotlinfundamental.numbers

fun main() {
    numbers()
}

/*
* Number adalah sebuah tipe data yang khusus digunakan untuk menyimpan nilai dalam bentuk numerik
* Int (32 Bit) -> Int dapat menyimpan data dari range -2^31 sampai +2^31-1
* Long (64 Bit) -> Long adalah tipe data yang digunakan untuk menyimpan nilai numerik yang lebih besar yaitu dari range -2^63 sampai +2^63-1
* Short (16 Bit) -> Short merupakan sebuah bilangan bulat yang hanya dapat menyimpan nilai yang kecil karena hanya berukuran 16 Bit
* Byte (8 Bit) -> Dengan ukuran yang kecil, Byte hanya mampu menyimpan nilai yang kecil sama halnya seperti Short
* Byte biasa digunakan untuk keperluan proses membaca dan menulis data dari sebuah stream file atau jaringan
* Double (64 Bit) -> Double digunakan untuk menyimpan nilai numerik pecahan sampai dengan maksimal 15-16 angka di belakang koma
* Float (32 Bit) -> Sama seperti Double, hanya saja memiliki ukuran yang lebih kecil, yakni hanya sampai 6-7 angka di belakang koma
*/
fun numbers() {
    val intNumber: Int = 100
    val longNumber: Long = 100
    val longNumberL: Long = 100L
    val shortNumber: Short = 10
    val byteNumber = 0b11010010
    val doubleNumber: Double = 1.3
    val floatNumber: Float = 0.123456789f //yang terbaca hanya 0.1234567

    // Untuk mengetahui nilai max dan nilai min yang dapat disimpan oleh suatu tipe Number
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE
    println(maxInt)
    println(minInt)
    /*
     output :
            2147483647
            -2147483648
     */

    /*
    * Jika memasukan nilai melebihi nilai maksimal yang dapat disimpan, maka akan terjadi overflow.
    * Nilai yang akan dikembalikan adalah nilai minimal yang dapat disimpan.
    */
    val maxInts = Int.MAX_VALUE
    val overRangeInt = Int.MAX_VALUE + 1 // This operation has led to an overflow

    println("Max Int: $maxInts")
    println("Over range Int: $overRangeInt")
    /*
    Output :
    Max Int: 2147483647
    Over range Int: -2147483648
    */

    /*
    * Operator pada tipe data Numbers meliputi:
    * (+) -> penjumlahan
    * (-) -> pengurangan
    * (*) -> perkalian
    * (/) -> pembagian
    */
    // penjumlahan
    val numberOne = 1
    val numberTwo = 2
    println(numberOne + numberTwo)
    /*
        output : 3
     */

    // pembagian
    val number1: Int = 27
    val number2: Int = 10
    println(number1 / number2)
    /*
        output : 2
     */

    // penjumlahan + perkalian
    println(5 + 4 * 4)
    /*
     output: 21
     */

    println((5 + 4) * 4)
    /*
     output: 36
     */

    // konversi
    val stringNumber = "23"
    val intNumb = 3
    println(intNumb + stringNumber.toInt())
    /*
     output: 26
     */

    // readable number
    val readableNumber = 1_000_000
    print(readableNumber)
    /*
     output : 1000000
     */
}