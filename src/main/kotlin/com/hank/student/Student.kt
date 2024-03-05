package com.hank.kotlin

import java.util.Scanner

fun main() {
//    userInput()
    Student.pass = 50
    val stu = Student("Hank",77,99)
    val stu1 = Student("Jane",44,68)
    val stu2 = Student("Eric",30,49)
    val gstu = GraduateStudent("jack",55,65,60)
    gstu.print()
    stu.print()
    stu1.print()
    stu2.print()
    var test = 123
    println("Test is : $test")
    println("High score : ${stu.highest()}")
}

//繼承Student父類別練習
class GraduateStudent(name: String?,english: Int,math: Int,var thesis : Int):Student(name,english,math){
    companion object{
       @JvmStatic
        var pass = 70
    }

    override fun print() {
        grading()
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}")
    }

    override fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"
}

open class Student(var name:String?,var english:Int,var math:Int) {
//    類似java中的static功能，屬「類別層級的變數及方法」
    companion object {
        @JvmStatic  //利用這個字讓 java存取時少一層 companion
        var pass = 60  // java中static的概念
        fun test(){
            println("testing")
        }
    }

    open fun print(){
//        方法1
        /*print(name + "\t" + english + "\t" + math +
                "\t" + getAverage() + "\t" +passOrFailed()
               )
        println("\t" + grading())*/

//        方法2
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}")
    }

//    fun grading():Char {
////        when方法1
//       /* var grading : Char = when(getAverage()) {
//            in 90..100 -> 'A'
//            in 80..89 -> 'B'
//            in 70..79 -> 'C'
//            in 60..69 -> 'D'
//            else -> 'F'
//        }
//        return grading*/

////        when方法2
//        return when(getAverage()) {
//            in 90..100 -> 'A'
//            in 80..89 -> 'B'
//            in 70..79 -> 'C'
//            in 60..69 -> 'D'
//            else -> 'F'
//        }
//    }

//    when方法3
//    internal = 同一個module下都可使用，如srcSet
    fun grading():Char =when(getAverage()) { //Char可省略
    in 90..100 -> 'A'
    in 80..89 -> 'B'
    in 70..79 -> 'C'
    in 60..69 -> 'D'
    else -> 'F'
}

/*    fun getAverage():Int{
        return (english+math)/2
    }*/

    fun getAverage():Int = (english+math)/2 //Int可省略

/*    fun highest():Int {
//        if方法1
        *//*var max = if (english > math) english else math
        return max*//*

//        if方法2
        *//*var max = if (english > math) {
            println("englist")
            english
        } else {
            println("math")
            math
        }
        return max*//*

//        if方法3
        return if (english > math) {
            println("englist")
            english
        } else {
            println("math")
            math
        }
    }
    */

//    fun passOrFailed() = if (getAverage() >=60) "PASS" else "FAILED"
    open fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"

//    if 方法4
    fun highest():Int =if (english > math) { //Int可省略
        println("englist")
        english
    } else {
        println("math")
        math
    }

    /*fun nameCheck(){
        println(name?.length)
    }*/

    fun nameCheck() = println(name?.length)
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