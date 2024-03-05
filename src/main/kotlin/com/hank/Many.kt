package com.hank

fun main() {
//    list：可讀，無法寫入
    val list = listOf(5,1,2,7)
    println("list內容: $list")
    val scores = listOf<Int>(68,88,77,99,50)
    for (score in scores){
//    for (score in 0..scores.size){
        println(score)
    }
    println("list.get(): ${list.get(3)}") //list僅可讀

//    MutableList：可讀可寫
//    var mutableList:MutableList<Int> = mutableListOf(5,1,2,7)
    var mutableList = mutableListOf<Int>(5,1,2,7)
    mutableList.add(6)
    println("mutableList內容： $mutableList")
    mutableList.add(3,88) //指定位置「插入值」
    println("mutableList內容： $mutableList")
    mutableList.set(3,99)   //指定位置「更改值」
    println("mutableList內容： $mutableList")
    mutableList.removeAt(3) //指定位置「刪除值」
    println("mutableList內容： $mutableList")
}