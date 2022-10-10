package exercises.kotlinfundamental.fundamental

// single line comment
/* main function */
fun main() {
    println("Halo dunia!")
    name()
}
/*
* multi line comment
*/
fun name() {
    val name = "Taufik Hidayat"

    print("Hello my name is ")
    println(name)
    print(if (true) "Always true" else "Always false")
}