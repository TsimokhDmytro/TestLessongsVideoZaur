package Lesson24;

public class Test6 {
}

interface I1 {
    void abc();


    default void def() {
        System.out.println("this is method 'def'");
    }
    default void ghi() {
        System.out.println("this is method 'ghi'");
    }
}

interface I4 {

    static void def() {
        System.out.println("this is method 'def' is a static");
    }
}
interface I5 {

     static void def() {
        System.out.println("this is method 'def' is a static");
    }
}
class C1 implements I1{
    public void abc(){
        System.out.println("this is method 'abc'");
    }

    public static void main(String[] args) {
        C1 c2 = new C1();
        c2.abc();
        c2.def();
        c2.ghi();
    }
}
class C5 implements I4, I5{
    public static void main(String[] args) {
        I4.def();
    }
}

abstract class S{
}
class R {
    static public I5 method1(I5 i){
        return new C5();
    }
    public static void main(String[] args) {
        I5 i5 = new C5();
        method1(i5);
    }
}