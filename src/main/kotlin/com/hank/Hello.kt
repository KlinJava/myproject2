package com.hank

import kotlin.contracts.contract

//main方法產生：指令main+Tab
fun main() {
//    println("Hello Kotlin!")   //可使用sout+Tab產生
//    Human().hello()
    var s:String? = "abcde" //加「?」，表示允許「null」值
//    s = null
    println("abcde字串長度: ${s!!.length}")
    println("取abcde某個字元: ${s?.get(3)}")
    println("取abcde子字串: ${s?.substring(3)}")

    val h = Human("ABC",weight = 66.5f, height = 1.7f)
    h.hello()
    println(h.bmi())
    val score:Int = 88
    println( score > 60)
    val c:Char = 'A'    //kotlin中，c不是以整數值來比較
    println(c.toInt() >60)


    /* 特色
    Kotlin沒有基本資料型態，只有物件的型態，如 Int，也稱「資料型態自動推斷」
    分號，可有可無
    */
   /* var age : Int = 19
    age = 20
    var weight = 66.5f
    val name : String
    name = "Hank"*/

}

class Human(var weight:Float,var height:Float) {    //Kotlin有分「主建構子」、「次建構子」，此為「主建構子」 primary constructor，已省略 constructor這個

    //init會在建構子完成後自動執行
    init {
        println("初始 test $weight") //「字串」串接只要用「$」
    }

    //次要建構子，不可使用「var, val宣告」
    constructor(name:String,weight: Float,height: Float):this(weight,height){
        println("次要建構子測試OK：w=$weight,h=$height")
    }

    fun bmi():Float {
        val bmi = weight / (height*height)
        return bmi
    }
    fun hello() {   //不回傳任何資料，void不用寫
        println("Hello kotlin")
    }
}