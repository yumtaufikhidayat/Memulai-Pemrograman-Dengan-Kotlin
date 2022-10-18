package exercises.controlflow.expressions.whenexpressions

import kotlin.random.Random

fun main() {
    whenExpressions()
}

/*
* When expressions merupakan salah satu expressions seperti halnya switch case pada Java.
* When expressions merupakan mekanisme yang memungkinkan nilai dari sebuah variabel/expression, mampu mengubah alur program.
* When akan mencocokan semua argumen yang berada di setiap branch secara berurutan sampai salah satu kondisi terpenuhi.
* Di dalam when kita juga bisa menambahkan branch else.
* Branch else akan dievaluasi jika tiada satupun kondisi yang terpenuhi pada branch sebelumnya.
* Sama halnya seperti if expression, when expression dapat mengembalikan nilai dan dapat disimpan di dalam sebuah variabel
* If expression sebaiknya digunakan ketika kondisi yang diberikan tidak lebih dari 2 (dua) dan kondisi yang diberikan tidak terlalu rumit.
* When expression digunakan ketika kondisi yang diberikan lebih dari dua (2).
*/
fun whenExpressions() {
    // contoh when expressions
    var value = 7
    when (value) {
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
    }
    /*
        output: value is 7
    */

    // contoh when dengan branch else
    value = 20
    when (value) {
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("value cannot be reached")
    }
    /*
       output: value cannot be reached
    */

    // contoh when sebagai statement
    value = 7
    val stringOfValue = when (value) {
        6 -> "value is 6"
        7 -> "value is 7"
        8 -> "value is 8"
        else -> "value cannot be reached"
    }

    println(stringOfValue)
    /*
       output : value is 7
    */

    // contoh when expression dengan lebih dari satu baris body
    value = 7
    val stringOfValues = when (value) {
        6 -> {
            println("Six")
            "value is 6"
        }

        7 -> {
            println("Seven")
            "value is 7"
        }

        8 -> {
            println("Eight")
            "value is 8"
        }

        else -> {
            println("undefined")
            "value cannot be reached"
        }
    }
    println(stringOfValues)
    /*
   output :
            Seven
            value is 7
    */

    // contoh when menggunakan is atau !is untuk memeriksa instance tipe tertentu
    val anyType : Any = 100L
    when(anyType){
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }
    /*
       output : the value has a Long type
    */

    // contoh when untuk memeriksa nilai pada sebuah Range atau Collection
    value =  27
    val ranges = 10..50
    when(value) {
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
        else -> println("value undefined")
    }
    /*
       output : value is in the range
    */

    // menangkap subjek dari when expression
    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }
    println(registerNumber)
}

fun getRegisterNumber() = Random.nextInt(100)

