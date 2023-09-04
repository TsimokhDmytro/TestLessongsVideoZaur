package Lesson20;

import java.util.ArrayList;

public class Test2 {

    public static void main(String[] args) {
        ArrayList <String> array1 = new ArrayList<>();
        array1.add("Hello");
        array1.add("Ok");
        array1.add(1,"Bye-bye");
//        array1.add(4,"!!!");
        for(String s1:array1){
            System.out.println(s1);
        }
        System.out.println(array1.size());
    }
}
