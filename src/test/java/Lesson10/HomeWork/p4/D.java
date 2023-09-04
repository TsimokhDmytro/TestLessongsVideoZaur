package Lesson10.HomeWork.p4;
import Lesson10.HomeWork.p1.A;
import static Lesson10.HomeWork.p1.p2.B.*;
import Lesson10.HomeWork.p1.p2.p3.C;
import Lesson10.HomeWork.p4.p5.E;
public class D {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("Driver name: " + a.nameDriver1+"; " + "car info: " + engine + " " + speed);
        C c = new C();
        System.out.println("Driver name: " + c.nameDriver2+"; " + "car info: " + engine + " " + speed);
        E e = new E();
        System.out.println("Driver name: " + e.nameDriver3+"; " + "car info: " + engine + " " + speed);
    }
}
