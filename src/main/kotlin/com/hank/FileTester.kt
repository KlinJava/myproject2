package com.hank

import java.io.File


fun main() {
    write()
//    read()
}

//讀取資料練習
private fun read() {
    //    bufferedReader.lines()=讀取多行資料； readLine()=讀取單行資料
    File("data.txt").bufferedReader().lines().forEach {
        println(it)
    }
}

private fun write() {
//    輸出資料，方法1
//    File("output2.txt").writeText("abc123")

//    輸出資料，方法2，輸出多「行」，printWriter()=輸出串流物件
    /*File("output2.txt").printWriter().use {
        it.println("1st line")
        it.println("2nd line")
        it.println("3rd line")
    }*/

    /*輸出資料，方法3，使用 bufferedWriter，它沒printWriter()功能
    利用系統緩衝區寫資料，效能會比較好*/
    File("output2.txt").bufferedWriter().use {
        it.write("4th line\n")
        it.write("5th line\n")
        it.write("6th line\n7th line")
    }
}
