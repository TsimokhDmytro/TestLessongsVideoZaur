package LessonCollections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        measureTimeAdd(arrayList);
        measureTimeAdd(linkedList);
        measureTimeGetAll(arrayList);
        measureTimeGetAll(linkedList);
        measureTimeDellElementBeginList(arrayList);
        measureTimeDellElementBeginList(linkedList);
        measureTimeDellIndexCenterList(arrayList);
        measureTimeDellIndexCenterList(linkedList);
        measureTimeDellIndexEndList(arrayList);
        measureTimeDellIndexEndList(linkedList);

    }
    public static void measureTimeAdd(List<Integer>list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time create the list = " + (end - start));
    }

    public static void measureTimeGetAll(List<Integer>list){
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time get every element of the list = "+(end - start));
    }

    public static void measureTimeDellElementBeginList(List<Integer>list){
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.remove(10);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time dell element of the begin list = "+(end - start));
    }

    public static void measureTimeDellIndexCenterList(List<Integer>list){
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.remove(45000);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time dell element of the center list = "+(end - start));
    }
    public static void measureTimeDellIndexEndList(List<Integer>list){
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.remove(99000);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time dell element of the end list = "+(end - start));
    }
}


