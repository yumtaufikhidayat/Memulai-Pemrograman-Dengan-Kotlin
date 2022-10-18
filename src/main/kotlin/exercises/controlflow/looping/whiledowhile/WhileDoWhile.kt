package exercises.controlflow.looping.whiledowhile

/*
* Looping atau perulangan adalah proses perulangan blok yang sama tanpa henti sampai kondisi yang diberikan tidak terpenuhi atau bernilai false.
* While dan Do While sendiri tidak dapat digunakan untuk melakukan perulangan pada rentan angka.
*/
fun main() {
    whiles()
    doWhile()
    infiniteWhileDoWhile()
}

/*
* While bersifat Entry Controlled Loop. Artinya, kondisi yang diberikan akan dievaluasi terlebih dahulu.
* Jika kondisi pada while terpenuhi, maka proses perulangan akan dijalankan.
* Dan jika kondisi pada while tidak terpenuhi sejak awal, maka proses perulangan tidak akan dijalankan.
*/
fun whiles() {
    // contoh while
    var counter = 8
    while (counter <= 7){
        println("Hello, World!")
        counter++
    }
    println(counter)
}

/*
* Berbeda dengan While, Do While bersifat Exit Controlled Loop di mana proses perulangan akan langsung dijalankan di awal.
* Jika telah selesai, barulah kondisi yang diberikan akan dievaluasi.
*/
fun doWhile() {
    // contoh do while
    var counter = 1
    do {
        println("Loop ke-$counter: Hello, World!")
        counter++
    } while (counter <= 7)
    /*
   output:
       Loop ke-1: Hello, World!
       Loop ke-2: Hello, World!
       Loop ke-3: Hello, World!
       Loop ke-4: Hello, World!
       Loop ke-5: Hello, World!
       Loop ke-6: Hello, World!
       Loop ke-7: Hello, World!
    */
}

/*
* Saat menggunakan While dan Do While perhatikan infinite loop, yaitu kondisi di mana proses perulangan
* berlangsung terus menerus sampai aplikasi menjadi crash.
* Infinite loop terjadi jika kondisi yang diberikan selamanya terpenuhi atau bernilai true.
*/
fun infiniteWhileDoWhile() {
    var value = 'A'
    do {
        print(value)
    } while (value <= 'Z')
}