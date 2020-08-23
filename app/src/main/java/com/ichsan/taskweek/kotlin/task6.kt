package com.ichsan.taskweek.kotlin

fun luasLingkaran(jari:Int) = if (jari % 7 == 0 )   jari * jari * 22 / 7   else   jari * jari * 3.14

fun main(){
    print("Jari - jari : ")
    var j = readLine()!!.toInt()
    var luasL = luasLingkaran(j)
    println(luasL)
}