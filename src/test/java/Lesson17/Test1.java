package Lesson17;

class Car{}

public class Test1 {



    public static void main(String[] args) {
        StringBuilder sb1 =new StringBuilder();// by default 16 characters
        StringBuilder sb2 =new StringBuilder("Good day!!!");// by default 16 characters && 11 created characters, summ = 27 characters
        StringBuilder sb3 =new StringBuilder(50);// Capabilities 50 characters
        StringBuilder sb4 =new StringBuilder(sb2);
//
//        System.out.println(sb2==sb4);
//
//        System.out.println(sb2.length());
//        System.out.println(sb3.length());
//
//        System.out.println(sb2.charAt(4));
//
//        System.out.println(sb2.indexOf(" "));
//        System.out.println(sb2.indexOf("x"));
//        System.out.println(sb2.indexOf("!!!"));
//        System.out.println(sb2.indexOf("o"));
//        System.out.println(sb2.indexOf("o",2));
//
//        String s1 = sb2.substring(5);
////        sb2.append("123");
//        System.out.println(sb2);
//        System.out.println(s1);
//        String s2 = sb2.substring(5,8);
//        System.out.println(s2);
//
//        System.out.println(sb2.subSequence(5,8));
//
//        System.out.println(sb2.capacity());
//
//        sb2.append(22);
//        System.out.println(sb2);
//        sb2.append(true);
//        System.out.println(sb2);
//        sb2.append(sb2);
//        System.out.println(sb2);
//        sb2.append("Hello");
//        System.out.println(sb2);
//        sb2.append('H');
//        System.out.println(sb2);
//        sb2.append(new Car());
//        System.out.println(sb2);

        System.out.println(sb2.insert(4,1234));
//        System.out.println(sb2.length());
        System.out.println(sb2.insert(sb2.length(),5678));

//        System.out.println(sb2.insert(15,48566));

        StringBuilder sb10 = new StringBuilder("Hello World");
//        sb10.delete(6,9);
//        System.out.println(sb10);
//
//        sb10.deleteCharAt(3);
//        System.out.println(sb10);

        sb10.reverse();
        System.out.println(sb10);
//
//        StringBuilder sb11= new StringBuilder("Hello");
//        System.out.println(sb11);
//        String s4 = String.valueOf(sb11);
//        String s3 = String.valueOf(sb11.reverse());
//        System.out.println(s3.equals(s4));
//
        StringBuilder sb12 =new StringBuilder("Hello everyone");
        sb12.replace(1,5,"i");
        System.out.println(sb12);
        sb12.replace(0,2,"Good bay");
        System.out.println(sb12);

        System.out.println(sb4.capacity());
        System.out.println(sb3.capacity());
        System.out.println(sb12.capacity());


    }
}
