package com.hank.kotlin

fun main() {
    val stu = Student("Jack",66,88)
    stu.print()
}

class Student(var name:String,var english:Int,var math:Int) {
    fun print(){
        println(name + "\t" + english + "\t" + math +
                "\t" + (english+math)/2)
    }

}