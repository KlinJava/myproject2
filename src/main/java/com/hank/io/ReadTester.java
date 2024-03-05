package com.hank.io;


import java.io.*;

public class ReadTester {
    public static void main(String[] args) {
        BufferReader();
//        FileReader();
//        InputStream();

    }

//   BufferReader練習，以行為讀取單位
    private static void BufferReader() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data2.txt"));
            String line = br.readLine();
            while (line != null) { //讀到沒資料會出現 null
                System.out.println(line);
                line = br.readLine(); //讀取「下一行」
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    FileReader練習，以Char為讀取單位
    private static void FileReader() {
        try {
            FileReader fr = new FileReader("data2.txt"); // Char為讀取單位
            int n = fr.read();
            while (n != -1) { //讀到沒資料會出現 -1
                System.out.print((char)n); //(char)轉型為字元
                n = fr.read(); //讀取「下一個字」
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    InputStream練習，以Byte為讀取單位
    private static void InputStream() {
        File file = new File("data.txt"); // Byte為讀取單位
        System.out.println(file.exists()); //判斷檔案是否存在
        System.out.println(file.getAbsolutePath());

        /*父類別的參照資料型態，可以放子類別的物件 InputStream是
        InputStream的父類別
        InputStream is = new FileInputStream(file);
        */

//        讀檔案內容，方法1
        /*FileInputStream is = null;
        try {
            is = new FileInputStream(file);
            int n = is.read();
            System.out.println("第1個字元碼：" + n);
            System.out.println("第2個字元碼：" + is.read());
            System.out.println("第3個字元碼：" + is.read());
            System.out.println("第4個字元碼：" + is.read()); //檔案內容只有abc，第4個讀不到就變「-1」
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

//        讀檔案內容，方法2
        try {
            FileInputStream is = new FileInputStream(file);
            int n = is.read();
            while (n !=-1) { //讀到沒資料會出現 -1
                System.out.println((char)n); //(char)轉型為字元
                n = is.read(); //讀取「下一個字」
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File open success");
    }
}
