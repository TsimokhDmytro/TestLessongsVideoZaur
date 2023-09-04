package Lesson16;

import java.util.Locale;

public class Test6 {
    public static void main(String[] args) {
        String s1 = "HELLO";
        String s2 = s1.toLowerCase();
        System.out.println(s2);
        String s3 = s2.toUpperCase();
        System.out.println(s3);

        boolean b1 = s2.contains("el");
        boolean b2 = s2.toUpperCase().contains("EL");
        System.out.println(b1);
        System.out.println(b2);
    }
}
