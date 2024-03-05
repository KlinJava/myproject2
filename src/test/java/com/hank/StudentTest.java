package com.hank;

import com.hank.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    void highestScoreTest(){
        Student student = new Student("Hank",60,80);
        Assertions.assertEquals(80,student.highest());
    }

    @Test
    void averageTes(){
        Student student = new Student("Hank",60,80);
        Assertions.assertEquals((60+80)/2,student.getAverage());
    }
}
