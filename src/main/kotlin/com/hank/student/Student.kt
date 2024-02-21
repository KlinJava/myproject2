package com.hank.kotlin

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`) //in是關鍵字，需左右加上重音符號「`in`」
    print("Please enter student's name:")
    var name:String = scanner.next()
    print("Please enter student's english:")
    var english = scanner.nextInt()
    print("Please enter student's math:")
    var math = scanner.nextInt()
    val stu = Student(name,english,math)
    stu.print()
}

class Student(var name:String,var english:Int,var math:Int) {
    fun print(){
        println(name + "\t" + english + "\t" + math +
                "\t" + (english+math)/2)
    }

}