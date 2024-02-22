package com.hank.kotlin

import java.util.Scanner

fun main() {
//    userInput()
    val stu = Student("hank",77,99)
    stu.print()
    var test = 123
    println("Test is : $test")
    println("High score : ${stu.highest()}")
}

class Student(var name:String?,var english:Int,var math:Int) {
    fun print(){
        println(name + "\t" + english + "\t" + math +
                "\t" + (english+math)/2)
    }
    fun highest():Int {
//        if方法1
        /*var max = if (english > math) english else math
        return max*/

//        if方法2
        /*var max = if (english > math) {
            println("englist")
            english
        } else {
            println("math")
            math
        }
        return max*/

//        if方法3
        return if (english > math) {
            println("englist")
            english
        } else {
            println("math")
            math
        }
    }
    fun nameCheck(){
        println(name?.length)
    }

}

private fun userInput() {
    val scanner = Scanner(System.`in`) //in是關鍵字，需左右加上重音符號「`in`」
    print("Please enter student's name:")
//    var name:String = scanner.next()
    var name = null
    print("Please enter student's english:")
    var english = scanner.nextInt()
    print("Please enter student's math:")
    var math = scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
    stu.nameCheck()
}