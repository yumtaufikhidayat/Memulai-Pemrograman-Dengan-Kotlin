package exercises.kotlinfundamental.stringtemplate

fun main() {
    stringTemplate()
}

/*
* Kotlin mendukung sebuah fitur bernama String Template.
* Sebuah fitur yang memungkinkan kita untuk menyisipkan sebuah variabel ke dalam sebuah String tanpa concatenation (penggabungan objek String menggunakan +)
*/
fun stringTemplate() {
    val name = "Kotlin"

    // traditional string concatenation
    println("My name is " + name)
    /*
        output : My name is Kotlin
    */

    // using string template
    println("My name is $name")
    /*
        output : My name is Kotlin
    */

    // Variabel yang dapat disisipkan tidak sebatas String. Kita juga bisa menyisipkan objek lain misal Int atau Double
    val old = 3
    println("My name is $name, I am $old years old")
    /*
        output : My name is Kotlin, im 3 years old
    */

    /*
    * Kita juga bisa menyisipkan sebuah expression ke dalam sebuah string template.
    * Caranya, sisipkan expression ke dalam curly braces yang diikuti karakter $.
    */
    val hour = 7
    println("Office ${if (hour > 7) "already close" else "is open"}")
    /*
        output : Office is open
    */
}