package com.ichsan.taskweek.kotlin

fun kabisat(t: Int) {
    if (t % 400 == 0) {
       println ("kabisat")
    } else
    if (t % 100 == 0) {
        println ("bukan")
    } else
    if (t % 4 == 0) {
       println ("kabisat")
    } else {
        println ("bukan")
    }

}
fun main(){
    print("apakah tahun kabisat : ")
    var t = readLine()!!.toInt()
    var kabisat = kabisat(t)
    println(kabisat)
}