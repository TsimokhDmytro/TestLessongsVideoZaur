package Lesson26;

public class Test5 {
    //    String s;
//    {
//        System.out.println("Hello");
////        int a = 5;
////        System.out.println(a);
//        s = "Bye";
//        System.out.println(s);
//    }
//    String s;
    {
        System.out.println("This is initializer block3");
    }

    Test5() {
        System.out.println("This is constructor1");
    }

    Test5(int a) {
        this();
        System.out.println("This is constructor2");
    }

    {
        System.out.println("This is initializer block1");
    }

    static {
        System.out.println("This is STATIC initializer block1");
    }

    {
        System.out.println("This is initializer block2");
    }

    static {
        System.out.println("This is STATIC initializer block2");
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        Test5 t2 = new Test5(2);
    }
}
