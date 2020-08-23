package com.ichsan.taskweek.kotlin

fun main(){
        var kalimat = readLine()!!.toString()
        val word = kalimat.split(" ")
        var rw = ""
        for (i in word.indices.reversed()) {
            rw += word[i] + " "
        }
        println("Reversed String:")
        println(rw)

}