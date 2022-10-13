package exercises.kotlinfundamental.arrays

fun main() {
    arrays()
}

/*
* Array yaitu tipe data yang memungkinkan kita untuk menyimpan beberapa objek di dalam sebuah variabel.
* Array di Kotlin direpresentasikan oleh kelas Array yang memiliki fungsi get dan set serta properti size.
* Untuk membuat sebuah Array kita bisa memanfaatkan sebuah library function arrayOf().
*/
fun arrays() {
    // simple array
    val array = arrayOf(1, 3, 5, 7)

    // Array with a kind of data type
    val mixArray = arrayOf(1, 3, 5, 7 , "Dicoding" , true)

    // array for specific data type
    val intArray = intArrayOf(1, 3, 5, 7)

    // get value from array
    val intArrays = intArrayOf(1, 3, 5, 7)
    println(intArrays[2])
    /*
        Output: 5
    */

    // change value of array based on index position
    val intArrayy = intArrayOf(1, 3, 5, 7)  // [1, 3, 5, 7]
    intArrayy[2] = 11                       // [1, 3, 11, 7]
    println(intArrayy[2])
    /*
        Output: 11
    */

    // array using Array(). Constructor pada Array() membutuhkan 2 argumen yaitu size dan fungsi lambda.
    val intArrayys = Array(4, { i -> i * i }) // [0, 1, 4, 9]
}