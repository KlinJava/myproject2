package com.hank.many;

import java.lang.reflect.Array;
import java.util.*;

public class Tester {
    public static void main(String[] args) {
//        arrayTest();
//        list();
//        set();
        map();

    }

    //    Map練習
    private static void map() {

        HashMap<String,String> stocks = new HashMap<>();
        stocks.put("2330","台積電");
        stocks.put("2317","鴻海");
        stocks.put("2330","TSMC"); // key重覆，value將取代"台積電"
/*        System.out.println("MapGet value: " + stocks.get("2330"));
        System.out.println("MapList: "+ stocks);
        for (String key : stocks.keySet()){
            System.out.println(key + " : " + stocks.get(key));
        }*/
        for (Map.Entry<String, String> stringEntry : stocks.entrySet()) {
            System.out.println(stringEntry);
        }
        System.out.println();
        for (Map.Entry<String, String> stringStringEntry : stocks.entrySet()) {
            System.out.println(stringStringEntry);
        }
        System.out.println();
        for (Map.Entry<String, String> entry : stocks.entrySet()) {
            System.out.println(entry);
        }
    }

    //    set練習
    private static void set() {
        //        Set無 index，故讀(找)資料時需「重頭讀過一遍」
        HashSet<Integer> set = new HashSet<>();
        set.add(6);
        set.add(7);
        set.add(1);
        set.add(8);
        set.add(7);
        System.out.println(set);
        for (int n : set){
            System.out.println(n);
        }
    }

    //    list練習
    private static void list() {
        //list集合1，可放不同資料型態
        ArrayList<Integer> list = new ArrayList(); //加上 <>符號，又稱鑽石符號
//       List<Integer> list = new ArrayList(); //加上 <>符號，又稱鑽石符號
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(7);
        list.add(1);

        System.out.println("list內容： " + list);
        int n1 = list.get(0); // 左邊為int，右邊為object，要轉型；使用泛型語法，就不用轉型
        int n2 = list.get(3);
        System.out.println("list長度: " + list.size());

        //list集合2
        List<Integer> scores = Arrays.asList(68,88,77,99,50);
        for (int n : scores){
            System.out.println(n);
        }
    }

//    array練習
    private static void arrayTest() {
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[4] = 3;
//        numbers[5] = 7; //超出陣列範圍，出現 Index out of bounds

        int[] scores = {68,88,77,99,50};
        System.out.println(scores); //結為陣列的記憶體位置
        // 陣列資料取出，方法1，用一般 for
        for (int i=0;i<5;i++){
            System.out.println(scores[i]);
        }
        System.out.println();

        //陣列取出，方法2，用 for each
        for (int n : scores){
            System.out.println(n);
        }
    }
}
