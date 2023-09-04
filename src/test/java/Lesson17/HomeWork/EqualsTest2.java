package Lesson17.HomeWork;

public class EqualsTest2 {

    public static boolean equals1(StringBuilder sb1, StringBuilder sb2) {
        boolean res = true;
        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    res = false;
                    break;
                }
            }
        } else {
            res = false;
        }
        return res;
    }

    public static void main(String[] args) {
        StringBuilder sb3 = new StringBuilder("hello");
        StringBuilder sb4 = new StringBuilder("hello");
        StringBuilder sb5 = new StringBuilder("Hello");

        boolean a = equals1(sb3, sb4);
        System.out.println(a);

        System.out.println(equals1(sb4, sb5));

        System.out.println(equals1(new StringBuilder(""), new StringBuilder("")));
        System.out.println(equals1(new StringBuilder(), new StringBuilder()));


    }

}
