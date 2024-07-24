package Lesson24;

import org.testng.annotations.Test;

public class Test5 {
    public static void main(String[] args) {
        Jumpable j1 = new Human();
        Jumpable j2 = new Animal();
        j1.jump();
        j2.jump();
    }
}

class Human implements Jumpable {
    public void jump() {
        System.out.println("Human jumps");
    }
}

class Animal implements Jumpable {
    public void jump() {
        System.out.println("Animal jumps");
    }
}

interface Jumpable {
    void jump();
}




interface A1 {
    void abc();
   default void def(){
       System.out.println("This is method 'def'");
   }
    default void ghi(){
        System.out.println("This is method 'ghi'");
    }
}

interface A2 extends A1, Jumpable {
    void def();
}
abstract class B2 implements A2{
}

class C2 implements A1{
    public void abc(){
        System.out.println("This is method 'abc'");
    }
    public void def(){
        System.out.println("This is override default method 'def'");
    }
    public static void main(String[] args) {
        C2 c2 = new C2();
        c2.abc();
        c2.def();
        c2.ghi();
    }
}
class C3 implements A1{
    public void abc(){
        System.out.println("This is method 'abc'");
    }
    public static void main(String[] args) {
        C3 c3 = new C3();
        c3.abc();
        c3.def();
        c3.ghi();
    }
}
class C4 implements A1{
    public void abc(){
        System.out.println("This is method 'abc'");
    }
    public static void main(String[] args) {
        C4 c4 = new C4();
        c4.abc();
        c4.def();
        c4.ghi();
    }
}