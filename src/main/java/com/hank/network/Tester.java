package com.hank.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Tester {
    public static void main(String[] args) {
        try {
//            URL url = new URL("https://api.jsonserve.com/S_0WvU"); // 產生 url物件
            URL url = new URL("https://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0daad6e6-0632-44f5-bd25-5e1de1e9146f"); // 產生 url物件

            /*左邊為 HttpURLConnection，右邊為 URLConnection
            URLCOnnection轉型為HttpURLConnection*/
            HttpURLConnection connection = (HttpURLConnection)url.openConnection(); //參照資料型類 HttpURLConnection
            InputStream is = connection.getInputStream(); //參照資料型態 InputStream
            BufferedReader in = new BufferedReader(new InputStreamReader(is)); //InputStream放到 BufferedReader中
            String line = in.readLine();
            StringBuffer json = new StringBuffer(); //收集資料
            while (line != null){
//                System.out.println(line); //印出資料
                json.append(line); //收集資料，自動去除跳行的資料，每讀到一行完整資料，就把那行資料放進來
                line = in.readLine(); //讀下一行
            }
            System.out.println(json.toString());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
