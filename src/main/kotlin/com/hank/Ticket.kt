package com.kotlin

import java.util.Random


data class Ticket(val orgin:Int,val destination:Int,val price:Int)

fun main() {
    val ticket = Ticket(20,51,420)
    val s ="abcd"
    println(s.validate())
    println((1..10).radmon())
//    val r = Random().nextInt(10)+1 //如上 (1..10).random()功能
}

//擴充 Extensions，以 String擴充 validate功能，檢查長度是否大於6
fun String.validate():Boolean {
    return this.length >=6
}

fun IntRange.radmon():Int {
    val r = Random().nextInt(endInclusive-start)+start
    return r
}