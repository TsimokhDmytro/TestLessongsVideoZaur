package LessonCollections.Internet;

import java.util.ArrayList;

class ArrayTest2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        System.out.println(list.get(1) + ":");
        list.add(1, "test4");
        System.out.println(list.get(1) + ":");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ":");
        }
    }
}
//Объяснение
//
//Элементы в ArrayList нумеруются начиная с нуля. Поэтому элемент с номером 1 — это test2.
//
//Следующим действием мы добавляем строку «test4» в ячейку с индексом 1. При этом элементы с бо́льшим индексом сдвигаются вправо.
//
//Вторая часть вывода (test4) показывает, что теперь по индексу 1 извлекается именно test4.
//
//Далее мы обходим все элементы списка и убеждаемся, что они выводятся именно в порядке добавления.
