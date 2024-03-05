package com.hank.student;

public class Student {
    String id;
    String name;
    int english;
    int math;
    static int pass = 60;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

//    最大存取修飾字，public
//    public int highest(){

//    介於public及private間的存取修飾字，protected = private + 子類別
//    protected int highest(){

//    介於public及private間的存取修飾字，protected = private + package可見
      int highest(){

//    最小存取修飾字，private
//    private int highest(){ //
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
        int average = getAverage();
        System.out.print(name + "\t" + english +"\t" + math +
                "\t" + getAverage() + "\t" +
//                ((average >= 60)? "PASS" : "FAILED"));
                ((average >= pass)? "PASS" : "FAILED") + "\t");
        /*if (getAverage() >=60 ) {
            System.out.println("\tPASS");
        } else {
            System.out.println("\tFAILED");
        }*/

        char grading = 'F';
//      switch case判斷
        switch (average/10) {
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'F';
        }
        System.out.println(grading);

        //      多層次判斷式，又叫「巢狀判斷式」
        /*if (average >= 90 && average <=100) {
            grading = 'A';
        } else if (average >=80 && average <= 89){
            grading = 'B';
        } else if (average >=70 && average <=79){
            grading = 'C';
        } else if (average >=60 && average <=69){
            grading = 'D';
        }*/

    }

    /*    public Student(String name,int english,int math){
        this.name = name;
        this.english = english;
        this.math = math;
    }*/

    public int getAverage(){
        return (english+math)/2;
    }
}
