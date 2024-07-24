package Lesson25;

public class Test4 {
    public static void main(String[] args) {
        String[] array1 = {"Hello", "Good-buye"};
        Object[] array2 = array1;
//        String[] array3 = array2;
        String[] array3 = (String[]) array2;
//        array3[0]=new StringBuilder("Hi");
        array2[0]=new StringBuilder("Hi");
    }
}
