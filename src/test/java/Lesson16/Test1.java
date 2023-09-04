package Lesson16;

public class Test1 {


    public static void main(String[] args) {

        String st1 = new String("Hello");

        String st2 = "jhhdpsapkfj";

        int a = st1.length();
        System.out.println(a);

        char c1 = st1.charAt(3);
        System.out.println(c1);

        int i1 = st1.indexOf('e');
        System.out.println(i1);

        int i2 = st1.indexOf("l");
        System.out.println(i2);

        int i3 = st1.indexOf("lo");
        System.out.println(i3);

        int i4 = st1.indexOf("w");
        System.out.println(i4);

        int i5 = st2.indexOf('p', 5);
        System.out.println(i5);

        boolean i6 = st2.startsWith("jhhd");
        System.out.println(i6);

        boolean i7 = st2.startsWith("jhhd", 5);
        System.out.println(i7);

        boolean i8 = st2.endsWith("jhhd");
        System.out.println(i8);
        System.out.println(st1.length());
    }
}
