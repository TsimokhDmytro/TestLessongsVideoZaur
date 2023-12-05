package Lesson20;

import java.util.ArrayList;

public class Test2 {

    public static void main(String[] args) {

//        ArrayList <String> list1 = new ArrayList();
//        list1.add("Hello");
//        list1.add(new String("Bye"));
//        list1.add(new String("ok"));
//        list1.add("aaa");
//        System.out.println(list1);
//
//
//
//
//        class Car{}
//        Car c = new Car();
//        class Human{}
//        Human h = new Human();
//        int arr1[] = {1,2,3};
//
//        ArrayList  list2 = new ArrayList<>();
//        list2.add("Hello");
//        list2.add(new String("Ok"));
//        list2.add(arr1);
//        list2.add("!!!");
//        list2.add(c);
//        list2.add(new StringBuilder("WWW"));
//        list2.add(h);
//        for (Object s: list2)
//            System.out.print(s + "; ");
//        System.out.println();
////        System.out.println(list1.get(2));
////        array1.set(3,"???");
////        System.out.println(array1);
//
//
//
//
//        ArrayList <String> list3 = new ArrayList<>();
//        list3.add("Hello");
//        list3.add("Ok");
//        System.out.println(list3);
//        list3.add(2,"Bye-bye");
//        System.out.println(list3);
////        System.out.println(array1.size());
////        System.out.print(array1);


//        ArrayList <String> list4 = new ArrayList<>();
//        list4.add("Hello");
//        list4.add("Ok");
//        list4.add(1,"Bye-bye");
//        list4.add("!!!");
////        System.out.println(list4.get(4));
//        list4.set(3,"???");
//        System.out.println(list4);
////        list4.remove(4);
//        list4.remove(new String("Hello"));
//        System.out.println(list4);


        StringBuilder sb1 = new StringBuilder("Hi");
        StringBuilder sb2 = new StringBuilder("Hello");
        StringBuilder sb3 = new StringBuilder("Bye");

        ArrayList<StringBuilder> list5 = new ArrayList<>();
        list5.add(sb1);
        list5.add(sb2);
        list5.add(sb3);
//
//        for (int i = 0; i < list5.size(); i++) {
//            list5.get(i).append("!!!");
//        }
        System.out.println(list5);
//        list5.remove(new StringBuilder("Hi"));
//        for (StringBuilder sb: list5){
//            System.out.print(sb + "; ");
//        }
        list5.remove(sb2);
//        list5.remove(new StringBuilder("Hi"));
        System.out.println(list5);


    }
}
