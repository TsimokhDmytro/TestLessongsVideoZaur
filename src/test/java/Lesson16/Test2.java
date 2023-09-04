package Lesson16;

public class Test2 {

    public static void main(String[] args) {

        String st1 = "jhhdpsapkfj";
        String st2 = "        jhhdp    sapkfj       ";
        String st3 = "Microsoft";

        String st4 = st1.substring(5);
        System.out.println(st4);

        String st5 = st1.substring(6,8);
        System.out.println(st5);

        String st6 = st1.substring(7,11);
        System.out.println(st6);

        String st7 = st2.trim();
        System.out.println(st7);

        String st8 = st3.replace('o', 'y');
        System.out.println(st8);

        String st9 = st3.replace("sift", "shift");
        System.out.println(st9==st3);

        String st10 = st3.replace('s', 's');
        System.out.println(st10==st3);

        String st11 = st3.replace("s", "s");
        System.out.println(st11==st3);

        String st12= "Hello, ";
        String st13= "friend";
        System.out.println(st12.concat(st13));
        System.out.println(st12 + st13);
    }
}
