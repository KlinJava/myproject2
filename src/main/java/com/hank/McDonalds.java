package com.hank;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

//設計點餐
public class McDonalds {

    Map<String, Item> menu = new HashMap<>();

    public McDonalds() {
        File file = new File("mcdonalds.txt");
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line = in.readLine();
            while (line != null) {
                String[] tokens = line.split(",");
                Item item = new Item(
                        tokens[0],
                        tokens[1],
                        Integer.parseInt(tokens[2]), //將字串轉為整數值
                        Integer.parseInt(tokens[3])); //將字串轉為整數值
                menu.put(item.id, item);
                line = in.readLine(); // 讀下一行資料，必需有，不然會變「無窮迴圈」
            }
        } catch (IOException e) { //IOException是FileNotFoundException的上層類別，故2者合併用IOException
            e.printStackTrace();
            System.out.println("讀取menu失敗");
        }
    }

    public void printMenu() {
        for (Map.Entry<String, Item> itemEntry : menu.entrySet()) { //for Each讀入
//            印出，方法1
/*
            System.out.println(itemEntry.getValue().id + "\t" +itemEntry.getValue().name +
                    "\t" + itemEntry.getValue().calories + "\t" + itemEntry.getValue().price);
*/

//            印出，方法2，使用 @Override 覆寫 String toString()
            System.out.println(itemEntry.getValue());
        }
    }

    public static void main(String[] args) {
        McDonalds mcDonalds = new McDonalds(); //呼叫 McDonalds建購子
        mcDonalds.printMenu();
    }

    class Item {
        String id;
        String name;
        int calories;
        int price;

/*
        @Override //覆寫 String方法
        public String toString() {
            return id + "\t" + name + "\t" + calories + "\t" + price;
        }
*/

        public Item(String id, String name, int calories, int price) {
            this.id = id;
            this.name = name;
            this.calories = calories;
            this.price = price;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCalories() {
            return calories;
        }

        public void setCalories(int calories) {
            this.calories = calories;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }
}
