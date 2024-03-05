package com.hank.parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Car {
    private String id; //車牌
//    private long enter; //進場時間
//    private lonng leave; //離場時間

    private LocalDateTime enter; //進場時間
    private LocalDateTime leave; //離場時間

//    public Car(String id, long enter) { //建構子
    public Car(String id, LocalDateTime enter) {
        this.id = id;
        this.enter = enter;
    }

    public long getDuration(){ //停車的時間(min)
        Duration duration = Duration.between(enter,leave);
        return duration.toMinutes();
    }

    public void leave(){ //車子離開時間
//        leave = System.currentTimeMillis();
        leave = LocalDateTime.now();
    }

//    public void setLeave(long leave) { //設定車子離開時間
    public void setLeave(LocalDateTime leave) { //設定車子離開時間
//        if (leave > enter) {
        if (leave.isAfter(enter)) {
            this.leave = leave;
        }
    }
}
