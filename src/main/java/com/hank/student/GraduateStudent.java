package com.hank.student;

//繼承Student練習
public class GraduateStudent extends Student{

//    如果此類別沒寫建構子會送一個，如下
    /*public GraduateStudent(){
        super(); //繼承 Student
    }*/

//    自已寫建構子
    int thesis;
    static int pass = 60;

    public GraduateStudent(String name,int english,int math,int thesis){
        super(name,english,math);
        this.thesis = thesis;
    }

    @Override   //覆寫父類別的方法
    public void print() {
        int average = getAverage();
        System.out.print(name + "\t" + english +"\t" + math +
                "\t" + thesis +
                "\t" + getAverage() + "\t" +
                ((average >= pass)? "PASS" : "FAILED") + "\t");

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
    }
}
