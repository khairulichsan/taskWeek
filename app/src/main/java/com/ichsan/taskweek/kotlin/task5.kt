package com.ichsan.taskweek.kotlin

fun luasSegitiga(alas : Int, tinggi : Int): Int{
    return alas * tinggi * 1/2
}

fun main (){
    print("Alas : ")
    var A = readLine()!!.toInt()
    print("Tinggi : ")
    var T = readLine()!!.toInt()
    var luas = luasSegitiga(A,T)
    println("Luas Segitiga : $luas")
}