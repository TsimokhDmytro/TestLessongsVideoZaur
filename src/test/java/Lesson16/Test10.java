package Lesson16;

public class Test10 {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello".trim();
        String s3 = " Hello".trim();

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));

        System.out.println(s2==s3);
        System.out.println(s2.equals(s3));


    }
}
