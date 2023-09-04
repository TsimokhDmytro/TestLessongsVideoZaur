package LessonCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>(); //в скркдені не гарантує ніякого порядку
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();//в якому порядку пара (ключ, значення) були добавлені, в такому порядку вони повернуться
        Map<Integer, String> treeMap = new TreeMap<>();//пара (ключ, значення) сортуються сортуються по ключу (природний порядок)

        testMap(hashMap);
        testMap(linkedHashMap);
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(50, "Ivan");
        map.put(25, "Max");
        map.put(35, "Serhiy");
        map.put(41, "Petro");
        map.put(18, "Ivan");
        map.put(16, "Leonid");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("");
    }
}
