package com.hank

import java.util.Random
import java.util.Scanner

fun main() {
    val secret = Random().nextInt(10)+1
    println(secret)
    val scanner = Scanner(System.`in`)
    for (i in 1..5) {
        print("Please enter a number(${i}/4): ")
        var number = scanner.nextInt()
        println("第${i}次$number")
        if (number > secret) {
            println("Lower")
        } else if (number < secret) {
            println("Higher")
        } else {
            println("Great, the number is $number")
            break
        }

        /*if (number == secret) //因內容只有一行，可省略大括號 {}
            break*/
    }

}