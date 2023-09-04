package Lesson17;

public class Test4 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Hello");
        String s1 = new String(sb1);
        System.out.println(s1);
        sb1.append(" my friend");
        System.out.println(s1);

        StringBuffer sb2 = new StringBuffer("Good buy");
        String s2 = new String(sb2);
        System.out.println(s2);
        sb2.append(" my friend");
        System.out.println(s2);


        StringBuilder sb3 = new StringBuilder("Hello");
        StringBuilder sb4 = new StringBuilder("Hello");
        System.out.println(sb3==sb4);
        System.out.println(sb3.equals(sb4));
    }
}


