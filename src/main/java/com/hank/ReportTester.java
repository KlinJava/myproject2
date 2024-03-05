package com.hank;

import java.util.ArrayList;
import java.util.List;

public class ReportTester {
    public static void main(String[] args) {
        Report finance = new FinanceReport(); //父類別的參照資料型態，可放置子類別所生出來的物件
        Report health = new HealthReport();
        List<Report> reports = new ArrayList<>(); //Report為「參照資料型態」
        reports.add(finance);
        reports.add(health);
        for (Report report : reports){
            report.load();
            report.print();
        }
    }
}

