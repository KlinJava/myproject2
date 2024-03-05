package com.hank

import java.io.BufferedReader
import java.io.File
import java.io.FileInputStream
import java.io.FileReader


fun main() {
//    以下參考java資料匣中的ReadTester方式自已寫的

//    BufferReader()
//    FileReader()
    IntpuStream()
}

//IntputStream練習
private fun IntpuStream() {
    val file = File("data.txt")
    var fis = FileInputStream(file) // is是特殊字，改 fis
    var n = fis.read()
    while (n != -1) {
        println(n.toChar()) //(char)轉型為字元
        n = fis.read() //讀取「下一個字」
    }
}

//BufferReader練習
private fun BufferReader() {
    val br = BufferedReader(FileReader("data2.txt")) //BufferReader括號內要放「Reader」
    var line = br.readLine()
    while (line != null) {
        println(line)
        line = br.readLine() //讀取「下一行」
    }
}

//FileReader練習
private fun FileReader() {
    val fr = FileReader("data.txt")
    var n = fr.read()
    while (n != -1) {
        println(n.toChar()) //(char)轉型為字元
        n = fr.read() //讀取「下一個字」
    }
}