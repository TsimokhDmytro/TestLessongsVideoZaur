package Lesson3;

import org.testng.annotations.Test;

public class Lesson3 {
    @Test
    public void Task1(){
        int i1=5;
        int i2=11;
        double d1=5.5;
        double d2=1.3;
        long l=20l;
        double result=0;
        result = i2/d1+d2%i1-l;
        System.out.println(result);
    }
}