package com.hank

//main方法產生：指令main+Tab
fun main() {
//    println("Hello Kotlin!")   //可使用sout+Tab產生
//    Human().hello()
    val h = Human()
    h.hello()
    /* 特色
    Kotlin沒有基本資料型態，只有物件的型態，如 Int，也稱「資料型態自動推斷」
    分號，可有可無
    */
    var age : Int = 19
    age = 20
    var weight = 66.5f
    val name : String
    name = "Hank"


}

class Human {
    fun hello() {   //不回傳任何資料，void不用寫
        println("Hello kotlin")
    }

}