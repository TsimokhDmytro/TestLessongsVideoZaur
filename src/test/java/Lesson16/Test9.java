package Lesson16;

public class Test9 {
    public static void main(String[] args) {

        String s1 = new String("Ok");
        String s2 = new String("Ok");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        String s3 = "Hello";
        String s4 = "Hello";

        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));

        System.out.println(s1!=s4);

        String s5 = "How are you?";
        String s6 = "how are you?";
        String s7 = "How Are you?";

        System.out.println(s5.equals(s6));
        System.out.println(s5.equals(s7));
        System.out.println(s6.equals(s7));
        System.out.println(s5.equalsIgnoreCase(s6));
        System.out.println(s5.equalsIgnoreCase(s7));
        System.out.println(s6.equalsIgnoreCase(s7));
        System.out.println(s5==s6);

    }
}
