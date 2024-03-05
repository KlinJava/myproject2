package com.hank


import java.util.Random
import java.util.Scanner

fun main() {
    val secret = Random().nextInt(10) + 1
    println(secret)
//    val scanner = Scanner(System.`in`) //in是kotlin關鍵字，要加鍵盤1左邊「`」符號
    var number = 0
    while (number != secret) {
        print("Please enter a number : ")
//        number = scanner.nextInt()
        number = readln()!!.toInt() //kotlin自已的Scanner，!!表示自行處理例外 exception問題
        if (number > secret) {
            println("Lower")
        } else if (number < secret) {
            println("Higher")
        } else {
            println("Great, the number is $number")
        }

    }
}