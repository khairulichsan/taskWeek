package com.ichsan.taskweek.kotlin

fun main(){
    print("input number: ")
    var i = readLine()!!.toInt()

    if (i % 2 == 0){
         println("the number is even")}
    else {
         println("the number is odd")}
}