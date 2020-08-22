package com.ichsan.taskweek.kotlin

fun checkAge(i: Int):Int {
    var year = 2020
    return year - i
}

fun main(){
    print("tahun lahir : ")
    var y = readLine()!!.toInt()
    var age = checkAge(y)
    println(age)

}