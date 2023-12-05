package Lesson20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test8 {

    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        ArrayList<String> list1 = new ArrayList<>();
        list1.add(s4);
        list1.add(s1);
        list1.add(s3);
        list1.add(s2);
        Iterator<String> iter = list1.iterator();
//        while (iter.hasNext()) {
//            System.out.print(iter.next() + "; ");
//        }
        System.out.println(list1);

//        ListIterator<String> iter2 = list1.listIterator();
//        while (iter2.hasNext()) {
//            System.out.print(iter2.next() + "; ");
//        }
        while (iter.hasNext()) {
            iter.next();
            iter.remove();
        }
        System.out.println(list1);
    }

}
