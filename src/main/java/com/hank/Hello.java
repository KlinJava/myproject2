package com.hank;

public class Hello {
//    main方法產生：手動打全名、指令psvm+Tab 或 main+Tab 產生
    public static void main(String[] args) {
//        System.out.println("Hello!");
        Person p = new Person("Tom",66.5f,1.7f);
        p.hello();
        System.out.println(p.bmi());
        int score = 88;
        System.out.println(score < 80 || score > 90);
        char c = 'A';
        System.out.println(c > 60);
        System.out.println(c > 'a');

        /*int age = 19;   // int=32bits,short=16bits,long=64bits
        Integer age2 = 19;  //基本資料型態，都有對應的參照資料型態物件，也稱包裝類別
        System.out.println(age2.intValue());
        char c = '我';   // char=16bits
        Character c2 = 'A';
        byte b = 120;   // byte=8bits
        float weight = 66.5f;   // float=32bits,double=64bits
        float height = 1.7f;
        boolean adult = true;   // boolean=1bit
        boolean enroll = false;
        String name = "Tom";*/

    }
}
