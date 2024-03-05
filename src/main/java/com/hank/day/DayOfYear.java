package com.hank.day;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Scanner;

public class DayOfYear {
    public static void main(String[] args) {
//        輸入讀取，方式1，使用 Scanner
        /*Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();*/

//        輸入讀取，方式2，使用 BufferedReader，只會得到字串
        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31}; //每月的天數
        Calendar now = Calendar.getInstance();
        System.out.println("今天為當年第 " + now.get(Calendar.DAY_OF_YEAR)  + "天"); //顯示這天為當年第幾天
        System.out.println("今年是否為潤年: " + now.isLenient()); //判斷是否為潤年
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Please enter year: (" + year + ")");
            String yearString = reader.readLine();
            year = (yearString.length() > 0) ? Integer.parseInt(yearString) : year;
            /*if (yearString.length() > 0) {
                year = Integer.parseInt(yearString);
            }*/
            System.out.println(year);

            System.out.print("Please enter month: (" + month + ")");
            String monthString = reader.readLine();
            month = (monthString.length() > 0) ? Integer.parseInt(monthString) : month;
            /*if (monthString.length() > 0) {
                month = Integer.parseInt(monthString);
            }*/
            System.out.println(month);

            System.out.print("Please enter day: (" + day + ")");
            String dayString = reader.readLine();
            day = (dayString.length() > 0) ? Integer.parseInt(dayString) : day;
            /*if (dayString.length() > 0) {
                day = Integer.parseInt(dayString);
            }*/
            System.out.println(day);

            int days = 0;
            for (int i=0;i<month-1;i++){
                days += months[i]; // days = days + mohths[i]
            }
            days += day; // days = days + day

            //判斷是否為潤年計算方式，如下：
            if (year % 400 == 0 || (year % 4 == 0 && year != 100)){
                days ++ ; // days = days +1
            }
            System.out.println("今天為 " + year + "年的第 " + days); //2月有潤月，可能會少1天

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
