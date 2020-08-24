package com.ichsan.taskweek.kotlin

fun main(){
    var printWord = readLine()!!.toString()

    var b = printWord.toCharArray()
    var vokal = ""
    var kons = ""


    for (e in b) {
        if ( e == 'a' || e == 'e' || e == 'i' || e == 'o' || e == 'u'
            || e == 'A' || e == 'E' || e == 'I' || e == 'O' || e == 'U')
        {vokal += e} else {kons += e}
    }

    var gabung = vokal + kons
    for (f in gabung){
    println(f)
    }

}