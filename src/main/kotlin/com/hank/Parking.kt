package com.hank

import java.time.Duration
import java.time.LocalDateTime

fun main() {
    val enter : LocalDateTime = LocalDateTime.of(2018,12,
        25,8,0,0)
    val leave : LocalDateTime = LocalDateTime.of(2018,12,
        25,10,0,0)
    var car = Car("ABC-001",enter)
    car.leave = leave
    println("停車時間(分鐘): ${car.duration()} ")
    var hours = Math.ceil(car.duration()/60.0).toLong() //double 資料轉型為 long，直接在最後加上.toLong
    println("停車時間(小時): $hours")
    println("停車費用(元): ${hours*30}") //每小時30元計算
}

class Car(val id:String,val enter: LocalDateTime){ //建構子+屬性設計
    var leave : LocalDateTime? = null //在它下一行加上set，即是 setter的功能
        set(value) {
            if (enter.isBefore(value)) {
                field = value // 不可寫成 this.leave = value，會造成「氣窮迴圈」，field = leave值
            }
        }

//    計算停車時間，方法1
    /*fun duration():Long{
        return Duration.between(enter,leave).toMillis()
    }*/

//    計算停車時間，方法2
    fun duration():Long = Duration.between(enter,leave).toMinutes() //因為等號右邊傳回 long值，故左邊 :long可不寫
}