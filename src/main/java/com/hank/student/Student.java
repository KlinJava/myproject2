package com.hank.student;

public class Student {
    String id;
    String name;
    int english;
    int math;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int highest(){
//        直接回傳
        return (english > math)? english : math;
//        if三元運算式
        /*int max = (english > math)? english : math;
        return max;*/

//        if..else
        /*int max = 0;
        if (english > math) {
            max = english;
        } else {
            max = math;
        }
        return max;*/
    }


    public void print(){
        System.out.println(name + "\t" + english +"\t" + math +
                "\t" + (english+math)/2);
    }

    /*    public Student(String name,int english,int math){
        this.name = name;
        this.english = english;
        this.math = math;
    }*/

}
