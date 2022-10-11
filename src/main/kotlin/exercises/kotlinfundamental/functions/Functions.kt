package exercises.kotlinfundamental.functions

/*
* Function atau fungsi merupakan sebuah prosedur yang memiliki keterkaitan dengan pesan dan objek.
* Ketika kita memanggil sebuah fungsi maka sebuah mini-program akan dijalankan.
* Fungsi sendiri bisa diartikan sebagai cara sederhana untuk mengatur program buatan kita.
*/
fun main() {
    println(setUsers("Taufik Hidayat", 25))
    printUser("Taufik Hidayat")

    /*
    output :
    Your name is Taufik Hidayat, and you 25 years old
    Your name is Taufik Hidayat
    */
}
// Fungsi tanpa kembalian dengan dua parameter
fun setUser(name: String, age: Int) {}

// Fungsi dengan kembalian dengan dua parameter
fun setUsers(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}