package Lesson20.HomeWork;

import java.util.ArrayList;
import java.util.Collections;

public class MethodAbc2 {

    public ArrayList<String> abc(String... strings) {
        ArrayList<String> aL = new ArrayList<>();
        for (String s : strings) {
            if (!aL.contains(s)) {
                aL.add(s);
            }
        }
        Collections.sort(aL);
        System.out.println(aL);
        return aL;
    }

    public static void main(String[] args) {
        MethodAbc2 methodAbc2 = new MethodAbc2();
        methodAbc2.abc("hello", "exit", "bye", "1234", "Hello", "Bye-bye", "Bye", "hello",
                "1234", "Hello", "123", "Hello-hello", "exit", "12");
    }
}





