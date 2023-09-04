package Lesson19;

public class Test9 {


    public static void main(String[] args) {
        int[] array1 = {1, 6, 9, 7, 8, 4};
        int[] array2 = {8, 7, 69, 9, 87, 44};
        for (int a : array1) {
            a = 10;
            System.out.print(a + " ");
        }
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println(array1.length);
    }
}
