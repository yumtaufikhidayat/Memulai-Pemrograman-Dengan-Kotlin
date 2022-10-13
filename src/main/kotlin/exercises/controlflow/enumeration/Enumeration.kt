package exercises.controlflow.enumeration

fun main() {
    enumeration()
}

/*
* Enumeration merupakan salah satu fitur yang bisa kita gunakan untuk menyimpan kumpulan objek yang telah didefinisikan menjadi tipe data konstanta.
* Enumeration dapat ditetapkan sebagai nilai ke dalam sebuah variabel dengan cara yang lebih efisien.
* Selain itu, Enumeration juga dapat digunakan untuk meminimalisir kesalahan dalam pengetikan nilai sebuah variabel.
* */
fun enumeration() {
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE

    val color : Colors = Colors.RED
    println(color)
    /*
        output: RED
    */

    // Setiap enum class memiliki sebuah synthetic method yang memungkinkan kita mendapatkan daftar objek Enum dan nama dari tiap Enum itu sendiri.
    val colour: Array<Colour> = Colour.values()
    colour.forEach { colour ->
        println("$colour ")
    }
    /*
        output : RED GREEN BLUE
    */

    /*
    * Untuk mendapatkan daftar objek Enum kita bisa menggunakan fungsi values().
    * Sedangkan untuk mendapatkan nama dari objek Enum kita bisa menggunakan fungsi valueOf()
    */
    val colorss: Color = Color.valueOf("RED")
    println("Color is $colorss")
    println("Color value is ${colorss.value.toString(16)}")
    /*
       output :
       Color is RED
       Color value is ff0000
    */

    /*
    * Kita bisa mendapatkan daftar objek Enum dan nama dari objek Enum dengan cara yang lebih umum.
    * Caranya, gunakan fungsi enumValues() dan fungsi enumValueOf().
    */
    val colors: Array<Color> = enumValues()
    colors.forEach {color ->
        println(color)
    }

    val colorzz: Color = enumValueOf("RED")
    println("Color is $colorzz")
    /*
       output :
           RED
           GREEN
           BLUE
           Color is RED
    */

    /*
    * Konsep dari Enumeration sendiri sama seperti Array.
    * Oleh karena itu, selain mendapatkan daftar dan nama dari tiap objek Enum, kita juga bisa mendapatkan posisi tiap objek menggunakan properti ordinal
    * */
    val colorz: Color = Color.GREEN
    println("Position GREEN is ${colorz.ordinal}")
    /*
        output : Position GREEN is 1
    */

    /*
    * Bagaimana cara kita mengecek instance dari Enum itu sendiri? Nah, untuk mengeceknya, gunakan When Expression.
    */
    val colorxx: Color = Color.GREEN
    when(colorxx){
        Color.RED -> print("Color is Red")
        Color.BLUE -> print("Color is Blue")
        Color.GREEN -> print("Color is Green")
    }
    /*
        output : Color is Green
    */
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

/*
* Untuk mendefinisikan sebuah kelas Enum, kita bisa menggunakan kata kunci enum dan setiap objek yang berada di dalamnya dipisahkan oleh karakter koma (,).
* Selain itu, objek yang berada di dalam Enum secara implisit bersifat static dan final sehingga kita tidak dapat mengubahnya setelah dideklarasikan.
*/
enum class Colors {
    RED, GREEN, BLUE
}

/*
* Setiap objek yang dideklarasikan merupakan instance dari kelas Enum tersebut
*/
enum class Colour(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

// Anonymous class untuk setiap objek Enum
enum class Colours(val value: Int) {
    RED(0xFF0000){
        override fun printValue() {
            println("value of RED is $value")
        }
    },
    GREEN(0x00FF00){
        override fun printValue() {
            println("value of GREEN is $value")
        }
    },
    BLUE(0x0000FF){
        override fun printValue() {
            println("value of BLUE is $value")
        }
    };

    abstract fun printValue()
}