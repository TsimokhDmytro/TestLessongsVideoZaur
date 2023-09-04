package LessonCollections;

import java.util.*;

public class SetTest2 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        testSet(hashSet);
        System.out.println(hashSet.contains("Dmytro"));
        System.out.println(hashSet.contains("Mike"));
        System.out.println("\n");
        testSet(linkedHashSet);
        System.out.println("\n");
        testSet(treeSet);
    }

    public static void testSet(Set<String> set) {
        set.add("George");
        set.add("Mike");
        set.add("Jenifer");
        set.add("Kate");

        for (String name : set) {
            System.out.println(name);
        }
    }
}
