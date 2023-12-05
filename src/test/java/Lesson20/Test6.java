package Lesson20;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6 {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Good day");
        StringBuilder sb2 = new StringBuilder("Bad day");
        StringBuilder sb3 = new StringBuilder("Normal day");
//        ArrayList <StringBuilder> list1 = new ArrayList<>();
//        list1.add(sb1);
//        list1.add(sb2);
//        list1.add(sb3);
////        ArrayList <StringBuilder> list2 = (ArrayList<StringBuilder>) list1.clone();
////        ArrayList <StringBuilder> list3 = list1;
////        System.out.println(list1==list2);
////        System.out.println(list1.get(1)==list2.get(1));
////        System.out.println(list1==list3);
//
//
////        list1.get(1).append("!!!");
////        list1.set(1,new StringBuilder("Fuck"));
////        System.out.println(list1);
////        System.out.println(list2);
//        Object [] array1 = list1.toArray();
//
//        System.out.print("[");
//        for (Object a:array1) {
//            int lastIndex = array1.length-1;
//            if (a != array1[lastIndex]){
//                System.out.print(a + "; ");
//            }else {
//                System.out.print(a);
//            }
//        }
//        System.out.println("]");
//
//        StringBuilder[] array2 = list1.toArray(new StringBuilder[7]);
//        System.out.print("[");
//        for (int i=0; i< array2.length; i++) {
//            if (i != array2.length-1){
//                System.out.print(array2[i] + "; ");
//            }else {System.out.print(array2[i]);}
//        }
//        System.out.println("]");


        StringBuilder[] array3 = {sb1, sb2, sb3};
        List<StringBuilder> list2 = Arrays.asList(array3);
        System.out.println(list2);
        array3[1].append("!!!");
        System.out.println(list2);
        array3[2] = new StringBuilder("???");
        System.out.println(list2);


    }
}
