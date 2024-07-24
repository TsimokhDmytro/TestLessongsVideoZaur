package Lesson25;

import java.util.Collections;

public class Test2 {
    public static void main(String[] args) {
        Jump_able j = new Man();
        Man m = new Man();
        Student s = new Student();
        if (j instanceof Jump_able) {
            System.out.println("j is Jump_able");
        }
        if (m instanceof Human) {
            System.out.println("m is Human");
        }
//        if (s instanceof Human) {
//            System.out.println("s is Human");
//        }
        if (s instanceof Jump_able) {
            System.out.println("s is Jump_able");
        }
    }
}

interface Jump_able {
}

class Human implements Jump_able {
}

class Man extends Human {
}

class Student {
}
