package com.hank

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main() {
//    jsonGet1()
//    jsonGet2()
    jsonGet3()
}

//讀json資料練習，方法3，使用 readText()方法連線，將全部資料讀回來
private fun jsonGet3() {
    val url = URL("https://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0daad6e6-0632-44f5-bd25-5e1de1e9146f")
//    println(url.readText()) //印出全部資料
    val json = StringBuffer()
    url.readText().lines().forEach {
        json.append(it)  //收集資料，自動去除跳行的資料，每讀到一行完整資料，就把那行資料放進來
    }
    println(json.toString())
}

//讀json資料練習，方法2，使用 with()方法，其下可省略 connection
private fun jsonGet2() {
    val url = URL("https://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0daad6e6-0632-44f5-bd25-5e1de1e9146f")
    with(url.openConnection() as HttpURLConnection) {
//        in特殊字，不能用在 kotlin，故改為 br
//        使用 Stream API => .lines()forEach{} 將每行資料讀出
        val json = StringBuffer()
        val br = inputStream.bufferedReader().lines().forEach {
//            println(it) //印出資料
            json.append(it)
        }
        println(json.toString())
    }
}

//讀json資料練習，方法1
private fun jsonGet1() {
    val url = URL("https://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0daad6e6-0632-44f5-bd25-5e1de1e9146f")
    val connection = url.openConnection() as HttpURLConnection // kotlin轉型 HttpURLConnection 使用「as」
    val br = BufferedReader(InputStreamReader(connection.inputStream)) // in特殊字，不能用在 kotlin，故改為 br
    var line = br.readLine()
    val json = StringBuffer()
    while (line != null) {
//        println(line) //印出資料
        json.append(line) //收集資料，自動去除跳行的資料，每讀到一行完整資料，就把那行資料放進來
        line = br.readLine()
    }
    println(json.toString())
}