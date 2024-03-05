package com.hank.kotin

import com.hank.Human
import com.hank.Person
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun humanBmiTest(){
        val human = Human("Hank",66.5f,1.7f)
        Assertions.assertEquals(66.5f/(1.7f*1.7f),human.bmi())
    }

    //測試 Person下的類別
    @Test
    fun personBmiTest(){
        val person = Person("Hank",66.5f,1.7f)
        Assertions.assertEquals(66.5f/(1.7f*1.7f),person.bmi())
    }
}