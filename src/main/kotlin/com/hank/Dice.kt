package com.hank

fun main() {
    println("max: ${Dice().max} , point: ${Dice().point}")
}

class Dice(){
    val max : Int = 6
    val point:Int = 1
}