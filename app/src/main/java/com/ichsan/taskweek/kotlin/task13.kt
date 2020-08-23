package com.ichsan.taskweek.kotlin

fun deret(t: String){
    val numbers = t.split("0")
    var wadah = ""
    for (i in numbers.indices) {
        wadah += numbers[i]
    }
    val tampil : Int = wadah.toInt()

    println(tampil)
}

fun main(){
    var deret = readLine()!!.toInt()
    var nilai : String = deret.toString()
    var hasil = deret(nilai)
    println(hasil)


}