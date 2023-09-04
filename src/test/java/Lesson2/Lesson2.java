package Lesson2;

import org.testng.annotations.Test;

public class Lesson2 {

    @Test
    public void Task1() {
        byte b1 = 0b1100;
        byte b2 = 0_14;
        byte b3 = 12;
        byte b4 = 0xC;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        short s1 = 0b10100010100;
        short s2 = 0_2424;
        short s3 = 1300;
        short s4 = 0x514;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        int i1 = 0b0;
        int i2 = 0_0;
        int i3 = 0;
        int i4 = 0x0;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        long l1 = 0b111010110111100110100010101L;
        long l2 = 0_726746425L;
        long l3 = 123456789L;
        long l4 = 0X75BCD15L;
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
    }

    @Test
    public void Task2() {
        float f1 = 0.125345F;
        float f2 = 0.1254678F;
        double d1 = 0.654645655555788;
        double d2 = 0.123567425;
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(bool1);
        System.out.println(bool2);
    }

    @Test
    public void Task3() {
        char char1 = 'z';
        char char2 = 122;
        char char3 = '\u007A';

        System.out.println(char1);
        System.out.println(char2);
        System.out.println(char3);
    }
}