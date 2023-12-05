package Lesson20.HomeWork;

import java.util.ArrayList;
import java.util.Collections;

public class MethodAbc1 {

    public static ArrayList<String> abc(String ... strings) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : strings) {
            list.add(s);
        }

        Collections.sort(list);
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            if (it.next().equals(it.next())) {
//                it.remove();
//            }
//        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                }
            }

        }
        return list;
    }

    static class Test {

        public static void main(String[] args) {
//            MethodAbc1 methodAbc1 = new MethodAbc1();
            System.out.println(abc("hello", "exit", "bye", "1234", "Hello", "Bye-bye", "Bye", "hello",
                    "1234", "Hello", "123", "Hello-hello", "exit", "12"));
        }
    }

}
