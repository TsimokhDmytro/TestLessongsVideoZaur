package LessonCollections;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest1 {

    @Test
    void t1() {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        for (Integer x : arrayList) {
            System.out.println(x);
        }

        arrayList.remove(5);
        System.out.println(arrayList);

        arrayList.set(4,444);
        System.out.println(arrayList);

        System.out.println(arrayList.isEmpty());

        arrayList.remove(0);
        System.out.println(arrayList);

        arrayList.size();
    }
}

