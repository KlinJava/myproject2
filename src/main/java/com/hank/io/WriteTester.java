package com.hank.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    public static void main(String[] args) throws IOException {
//        FileWriter fw2 = new FileWriter("C:\\123.txt"); // 「\」是特殊符號，C:\要多加一個 \，變成 C:\\

        /*使用 throws語法(Add exception to method signature)，表示 main方法會拋出IOException，出現錯誤的時候
        整支程式「就會中斷」*/

        File jkDir = new File("C:\\jk"); //建立 C:\jk 資料匣
        jkDir.mkdir(); //True/False判斷

        /*File jkDir = new File("C:\\jk\\123"); //建立 C:\jk\123 資料匣
        jkDir.mkdirs(); //True/False判斷*/

        FileWriter fw = new FileWriter("output.txt");
        fw.write("abc\n"); //寫入字串第1行 \n為換行
        fw.write("789"); //寫入字串第2行
        fw.flush(); //把資料衝到目的地去
        fw.close(); //關閉檔案

    }
}
