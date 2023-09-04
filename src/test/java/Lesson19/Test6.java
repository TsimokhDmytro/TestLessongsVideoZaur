package Lesson19;

public class Test6 {

    public static void main(String[] args) {
        int[] array1[] = {{2, 5}, {8, 9, 7, 3, 5,}, {8, 3, 6}};
//        for (int i = 0; i < array1.length; i++) {
//            for (int j = 0; j < array1[i].length; j++) {
//                System.out.print(array1[i][j] + " ");
//            }
//        }
        for (int [] array2 : array1) {
            for (int a : array2) {
                System.out.print(a + " ");
            }
        }
//        System.out.println();
//        System.out.println(array1.toString());
    }
}
