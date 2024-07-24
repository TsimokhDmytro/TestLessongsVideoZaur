package Lesson26;

public class Test6 {
    String s = "";

    //    int a = 3;
//
//    Test6() {
//        a = 4;
//    }
//
//    {
//        a = 5;
//    }
//
    String abc(String s1) {
        return s += s1;
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
//        System.out.println(t.a);
        t.abc("A");
        t.abc("B");
        t.abc("C");
        t.abc("D");
        System.out.println(t.s);
    }
}

class A {
    static final int b;
    int c = 5;

    //        A(){
//           b=10;
//        }
    static {
        b = 10;
//            c = 10;
    }
}

class B {
    static int c;
    static final int d;
    static final int e = 1;
    static final int f;

    static {
        c = 5;
        d = 3;
//            d=15;
//            e = 2;
        f = 0;
    }
}

//class C {
//    String s = "ok";
//
//    {
//        System.out.println(s);
//    }
//
//    static int i = 0;
//    static{
//        System.out.println(i);
//    }
//    static {
//        i =i+1;
//        System.out.println(i);
//    }
//    C(){
//        System.out.println("This is constructor");
//    }
//
//    public static void main(String[] args) {
//        C c = new C();
//    }
//}
class C {
    String s = "ok";

    {
        System.out.println(s);
    }

    static int i = 0;

    static {
        System.out.println(i);
    }

    {
        i = i + 1;
        System.out.println(i);
    }

    C() {
        System.out.println("This is constructor");
    }

    public static void main(String[] args) {
        System.out.println("Hello everybody");
        C c = new C();
    }
}

class D {
    static {
        abc(2);
    }

    static void abc(int a) {
        System.out.println(a + " ");
    }

    D() {
        abc(5);
    }

    static {
        abc(4);
    }

    {
        abc(6);
    }

    static {
        new D();
    }

    {
        abc(8);
    }

    public static void main(String[] args) {

    }
}
