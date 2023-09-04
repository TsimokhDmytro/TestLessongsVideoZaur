package LessonCollections.Internet;

import java.util.HashSet;

public class SetTest5 {

    public static void main (String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("Иван");
        set.add("Марья");
        set.add("Пётр");
        set.add("Иван");
        System.out.print(set.size()+":");
        for (String s: set){
            System.out.print(s+" ");
        }
    }
}
//Объяснение
//
//Так как строки сравниваются по значению, а дубликаты во множествах недопустимы, второй «Иван» не станет частью множества. В итоге размер множества будет равен 3.
//
//В каком порядке будут выведены элементы множества — определённо мы сказать не можем: во множествах порядок добавления не сохраняется.