package com.hank.kotlin

import java.util.GregorianCalendar

fun main() {
    val yk = YearCheck(1900,2050,0)
    yk.startTitle()

    //閏年檢查，方法1，使用 if 判斷
    yk.yearDetect1()
    //  閏年檢查，方法2，使用 GregorianCalendar之 isLeapYear() 判斷
//    yk.yearDetect2()

    yk.endTitle()
}

class YearCheck(var startYear:Int,var endYear:Int,var j:Int){


    fun startTitle() = println("($startYear ~ $endYear)閏年如下")
    fun endTitle() = println("共計 $j 個")

    //  閏年檢查，方法1，使用 if 判斷
    fun yearDetect1(){
        for (i in startYear..endYear) {
            if (i % 400 == 0 || i % 4 == 0 && i % 100 != 0) { //判斷閏年
                println(i)
                j++
            }
        }
    }

    //  閏年檢查，方法2，使用 GregorianCalendar之 isLeapYear() 判斷
    fun yearDetect2(){
        val gc = GregorianCalendar()
        for (i in startYear..endYear) {
            if (gc.isLeapYear(i) == true) {
                println(i)
                j++
            }
        }
    }
}
