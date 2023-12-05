package Lesson20;

import java.util.ArrayList;

public class Test5 {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList();
        list1.add(new String("Hello"));
        list1.add("Bye");
        list1.add(new String("ok"));
        list1.add("Hello");
        list1.add("aaa");
        System.out.println(list1.toString());
////        System.out.println(list1.indexOf(new String("Hello")));
////        System.out.println(list1.indexOf("Hello"));
////        System.out.println(list1.lastIndexOf("hello"));
////        System.out.println(list1.size());
//        System.out.println(list1.isEmpty());
//        list1.clear();
//        System.out.println(list1.isEmpty());

        ArrayList<StringBuilder> list2 = new ArrayList();
        StringBuilder sb1 = new StringBuilder("Bye");
        list2.add(new StringBuilder("Hello"));
        list2.add(sb1);
        list2.add(new StringBuilder("ok"));
        list2.add(new StringBuilder("aaa"));
        System.out.println(list2.toString());
//        System.out.println(list2.indexOf(new StringBuilder("Hello")));
//        System.out.println(list2.contains(sb1));
//        System.out.println(list2.contains(new StringBuilder("Bye")));

        ArrayList <Object> list3 = new ArrayList<>();
        class Car{}
        Car c = new Car();
        class Human{}
        Human h =new Human();
        list3.add("Hello");
        list3.add(c);
        list3.add(new StringBuilder("Bye"));
        list3.add(h);
        System.out.println(list3);
    }
}
