package com.ichsan.taskweek.kotlin

fun luasLingkaran(jari:Int) = if (jari % 7 == 0 )   22/7 * jari * jari  else  3.14 * jari * jari

fun main(){
    print("Jari - jari :")
    var j = readLine()!!.toInt()
    var luasL = luasLingkaran(j)
    println(luasL)
}