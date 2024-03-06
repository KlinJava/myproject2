package com.hank.day;


import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

//第8章，作業一：實作「印出從1900年到2050年之前潤年」
public class DayOfYear2 {
    public static void main(String[] args) {
        YearCheck yk = new YearCheck(1900,2050,0);
        yk.startTitle();

//閏年檢查，方法1，使用 if 判斷
        yk.yearDetect1();
//閏年檢查，方法2，使用 GregorianCalendar之 isLeapYear() 判斷
//        yk.yearDetect2();

        yk.endTitle();
    }
}

class YearCheck{
    int startYear;
    int endYear;
    int j;
    public YearCheck(int startYear,int endYear,int j){
        this.startYear = startYear;
        this.endYear = endYear;
        this.j = j;
    }

//  開始訊息
    public void startTitle(){
        System.out.println("(" + startYear + " ~ " + endYear + ")閏年如下");
    }

//  結束訊息
    public void endTitle(){
        System.out.println("共計 " + j + " 個");
    }
//  閏年檢查，方法1，使用 if 判斷
    public void yearDetect1(){
        for (int i = startYear;i<=endYear;i++) {
            if (i % 400 == 0 || i % 4 ==0 && i % 100 !=0) { //判斷閏年
                System.out.println(i);
                j++;
            }
        }
    }

//  閏年檢查，方法2，使用 GregorianCalendar之 isLeapYear() 判斷
    public void yearDetect2(){
        GregorianCalendar gc = new GregorianCalendar();
        for (int i = startYear;i<=endYear;i++) {
            if (gc.isLeapYear(i) == true) {     //判斷閏年
                System.out.println(i);
                j++;
            }
        }
    }
}
