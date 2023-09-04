package LessonCollections;

import java.util.HashSet;
import java.util.Set;

public class SetTest1 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);
        System.out.println(set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(6);
        set2.add(7);
        set2.add(8);
        set2.add(9);
        set2.add(10);
        set2.add(11);
        set2.add(12);
        System.out.println(set2);

        Set<Integer> union = new HashSet<>(set1);//union - об'єднання елементів списків
        union.addAll(set2);
        System.out.println(union);

        Set<Integer> intersection = new HashSet<>(set1);//intersection - пересікання елементів списків
        intersection.retainAll(set2);
        System.out.println(intersection);

        Set<Integer> difference = new HashSet<>(set1);//difference - різність елементів списків
        difference.removeAll(set2);
        System.out.println(difference);
    }
}
