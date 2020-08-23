package com.ichsan.taskweek.kotlin



fun main() {
    print("masukan text : ")
    var s = readLine()!!.toString()
    if ( s == s.reversed()){
        println("$s adalah palindrome")}
    else{
        println("$s bukan palindrome")}

}


