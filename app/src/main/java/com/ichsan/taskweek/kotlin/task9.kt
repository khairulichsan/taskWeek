package com.ichsan.taskweek.kotlin

fun main () {
    var printSegitiga = 5
    for (i in printSegitiga downTo 1) {
        for (j in 1..i) {
            print(j)
        }
        println()
    }
}