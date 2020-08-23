package com.ichsan.taskweek.kotlin

fun main(){
    var printWord = readLine()!!.toString()

    var b = printWord.toCharArray()



    for (e in b) {
        if ( e == 'a' || e == 'e' || e == 'i' || e == 'o' || e == 'u'
            || e == 'A' || e == 'E' || e == 'I' || e == 'O' || e == 'U')
            println(e)
    }
    for (f in b){
        if ( f == 'a'  || f == 'e' || f == 'i' || f == 'o' || f == 'u'
            || f == 'A'  || f == 'E' || f == 'I' || f == 'O' || f == 'U' )
        {
            print("")}else{
            println(f)}
    }

}