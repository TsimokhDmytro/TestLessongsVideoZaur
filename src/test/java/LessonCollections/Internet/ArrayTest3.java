package LessonCollections.Internet;

import java.util.ArrayList;

class ArrayTest3 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        String t1 = "test1";
        String t2 = "test2";
        list.add(t1);
        list.add(t2);
        System.out.print(list.size() + ":");
        t1 = "test3";
        list.remove(t1);
        System.out.print(list.size());
    }
}
//Объяснение
//
//Первая часть понятна: добавили два элемента, поэтому размер списка равен двум. Остаётся вопрос: почему не был удалён «test1»?
//
//Перед удалением элемента его нужно найти в списке. ArrayList и остальные коллекции, которые не используют алгоритмы хеширования, применяют для поиска метод equals().
//
//Строки сравниваются по значению, поэтому «test3» не эквивалентно «test1» и «test2». А раз ни один элемент не соответствует критерию поиска, ничего не удалится — размер списка останется прежним.
//
//Проверьте себя: подумайте, что произойдёт, если вместо
//
// list.remove(t1);
//написать
//
//list.remove(“test1”);