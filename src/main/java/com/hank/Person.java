package com.hank;

public class Person {
//    name,weight,height寫在此，是 Person身上的一個屬性(Field or Property)
    String name;
    float weight;
    float height;

//    建構子，名稱和類別名稱一樣，無回傳值，可依需求，建構一個以上的建構子
    public Person(float weight,float height){
        this.weight = weight;
        this.height = height;
    }

    public Person(String name,float weight,float height){
        this(weight,height); // this()一定要在第1行，減少重覆的參數語法，如 this.weight = weight; this.height = height;
        this.name = name;
    }

    public float bmi(){
        float bmi = weight/(height*height);
        return bmi;
    }
    public void hello(){
        System.out.println("Hello world");
    }
}
