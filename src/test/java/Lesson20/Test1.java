package Lesson20;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
        ArrayList <Object> list = new ArrayList();

        Car c = new Car();
        Human h = new Human();

        list.add("Hello");
        list.add(c);
        list.add(h);
        list.add(new String("Bye"));
        list.add(new StringBuilder("ok"));
        list.add(new StringBuffer("aaa"));

        for (Object s: list)
        System.out.print(s + " ");
//
//        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("sdef");
//        list2.add("qqq");
//
//        List<Object> list4 = new ArrayList<>();
//        list4.add(c);
//        list4.add(h);
//
//        ArrayList<List> list3 = new ArrayList<>();
//        list3.add(list);
//        list3.add(list2);
//        list3.add(list4);
//
//        ArrayList<String> list5 = new ArrayList<>(3);
//
//        for (Object a : list) {
//            System.out.print(a + " ");
//        }
//        System.out.println();
//
//        for (List l : list3) {
//            System.out.println(l + " ");
//        }
//        System.out.println();
//
//        ArrayList list6 = new ArrayList<>();
//        list6.add("sdfg");
//        System.out.println(list6);
//
//        ArrayList list7 = new ArrayList<>(list6);
//
//        System.out.println(list7);
//        System.out.println(list6==list7);


    }
   static class Car {
    }

  static   class Human {
    }


}

