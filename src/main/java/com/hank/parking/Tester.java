package com.hank.parking;

import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        LocalDateTime enter =
                LocalDateTime.of(2018,12,25,
                        8,0,0 ); //設定一固定時間為「車子進場時間」
        LocalDateTime leave =
                LocalDateTime.of(2018,12,25,
                        10,3,0); //設定一固定時間為「車子離場時間」
        /*Car car = new Car("ABC-0001",enter.atZone(ZoneId.systemDefault()).toEpochSecond());
        car.setLeave(System.currentTimeMillis()+1000*60*60*2); //加2個小時計算方式，1000ms(1s)*60s(1min)*60m(1h)*2h*/
        Car car = new Car("ABC-0001",enter);
        car.setLeave(leave);
        System.out.println("停車時間: " + car.getDuration() + " 分鐘"); //停車時間
        long hours = (long)Math.ceil(car.getDuration()/60.0);
        System.out.println("停車時間 :" + hours);
        System.out.println("停車費用 :" + 30*hours); //1小時30塊
//        Java8();
//        java();
    }

    private static void Java8() {
//        java8的新類別，含格林威治時間
        Instant instant = Instant.now();
        System.out.println(instant);

//        Local
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now的時間:" + now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); //設定時間格式
        System.out.println(formatter.format(now));
        System.out.println("now.plus新吐出的時間： " + now.plus(Duration.ofHours(3)));
        LocalDateTime other = LocalDateTime.of(2024,3,5,14,01,01);
        System.out.println(other);
        System.out.println(formatter.format(other));
    }


    private static void java() {
//    舊java
        Date date = new Date(); // Java舊式Date，用new方式
        System.out.println(date);  //1970/1/1_00:00:00到現在的一個毫秒數
        System.out.println(date.getTime()); //使用Date.getTime獲得長整數值
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date)); //使用format方法轉換為自已想要的日期格式

        //other產生時間
        String s = "2024/03/04 17:00:00";
        Date other = null ;
        try {
            other = sdf.parse(s);
            System.out.println(other);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH,9); //月份設定：月份index 由0-11，故設定9，表示成10月
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR,3); //設定加幾天
        System.out.println(calendar.getTime());
    }
}
