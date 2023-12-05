package Lesson20;

import java.util.ArrayList;

public class Test3 {

    public static void main(String[] args) {
//        ArrayList<String> list1 = new ArrayList();
//        list1.add("Hello");
//        list1.add(new String("Bye"));
//        list1.add(new String("ok"));
//        list1.add("aaa");
//        System.out.println(list1);
//
//        ArrayList<String> list2 = new ArrayList();
//        list2.add("qqq");
//        list2.add(new String("www"));
//        list2.add(new String("eee"));
//        list2.add("rrr");

//        ArrayList<StringBuilder> list3 = new ArrayList();
//        list3.add(new StringBuilder("qqq"));
//        list3.add(new StringBuilder("www"));
//        list3.add(new StringBuilder("eee"));
//        list3.add(new StringBuilder("rrr"));

//        list1.addAll(list2);
//        list1.addAll(list3);
//        list1.addAll(3,list2);
//        list2.set(0,"q");
//        list2.set(1,"w");
//        list2.set(2,"e");
//        list2.set(3,"r");

//        System.out.println(list2);
//
//        System.out.println(list1);


        ArrayList<StringBuilder> list4 = new ArrayList();
        list4.add(new StringBuilder("Hello"));
        list4.add(new StringBuilder("Bye"));
        list4.add(new StringBuilder("ok"));
        list4.add(new StringBuilder("aaa"));
        System.out.println(list4);

        ArrayList<StringBuilder> list5 = new ArrayList();
        list5.add(new StringBuilder("qqq"));
        list5.add(new StringBuilder("www"));
        list5.add(new StringBuilder("eee"));
        list5.add(new StringBuilder("rrr"));

//        list4.addAll(list5);
        System.out.println(list5);
//        System.out.println(list4);

//        list5.get(1).append("!!!");

//        System.out.println(list4);
//        System.out.println(list5);

        list4.clear();
        list5.clear();
        System.out.println(list4);
        System.out.println(list5);
    }
}
