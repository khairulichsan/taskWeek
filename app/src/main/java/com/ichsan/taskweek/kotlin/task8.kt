package com.ichsan.taskweek.kotlin

fun hasil(mtk : Int,bi : Int,bing : Int,ipa : Int) {
    var avr = (mtk + bi + bing + ipa) / 4
    println("Rata rata = $avr")

    if (avr >= 90){
        println("Grade = A")} else
    if (avr >= 80){
        println("Grade = B")} else
     if (avr >= 70){
         println("Grade = C")} else
    if (avr >= 60){
        println("Grade = D") }else
    {println("Grade = E")}

}

fun main(){
    print("nilai mtk : ")
    val mtk = readLine()!!.toInt()
    print("nilai bi : ")
    val bi = readLine()!!.toInt()
    print("nilai bing : ")
    val bing = readLine()!!.toInt()
    print("nilai ipa : ")
    val ipa = readLine()!!.toInt()
    var hasil = hasil(mtk, bi, bing, ipa)
    println(hasil)
}