package Lesson25;

public class Test5 {

    public static void main(String[] args) {
        Test10 t10 = new Test10();
        t10.abc();
//        System.out.println(t10.a);
        Test20 t20 = new Test20();
        t20.abc();
//        System.out.println(t20.a);
        Test30 t30 = new Test30();
//        t30.abc();
        ((Test10)t30).abc();
//        System.out.println(((Test10)t30).a);


    }
}

class Test10 {
    int a = 5;

    void abc() {
        System.out.println("ok1");
//        System.out.println(a);
    }
}

class Test20 extends Test10 {
    int a = 10;

    void abc() {
        System.out.println("ok2");
//        System.out.println(a);
    }
}

class Test30 extends Test20 {
    int a = 15;

    void abc() {
        System.out.println("ок3");
//        super.abc();
//        super.super.abc();
//        System.out.println(super.a);

    }
}