package com.ichsan.taskweek.kotlin

fun main(){
val string = "12340567"
    var p = 0
val numbers = string.split("0").map { it.toInt() }
    for(harga in numbers){
        p = p + harga
    }
println(p)
}