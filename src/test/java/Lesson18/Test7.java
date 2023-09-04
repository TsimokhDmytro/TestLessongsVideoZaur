package Lesson18;

public class Test7 {


    public static void main(String[] sdv) {

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int array3[] = array2;

        System.err.println(array1.equals(array2));
        System.err.println(array1 == array2);
        System.err.println(array3 == array2);
        System.err.println(array3.equals(array2));

        array1 [1]=3;
        array3 [10-5]=16;

        System.err.println(array1[1]);
        System.err.println(array3[5]);
        System.err.println(array2[5]);

        System.err.println(array1[10-3]=222);
        System.err.println(array3[5]);
        System.err.println(array2[5]);

    }
}
