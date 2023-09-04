package Lesson18.HomeWork;

import java.util.Arrays;

public class Sorting {

    public static int[] sorting(int[] arr) {
        System.out.println("Array before sorting: ");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==arr[arr.length-1]){
                System.out.print(arr[i]);
            }
            else {
                System.out.print(arr[i] + "; ");
            }
        }
        System.out.println("]");

        Arrays.sort(arr);

        System.out.println("Array after sorting: ");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==arr[arr.length-1]){
                System.out.print(arr[i]);
            }
            else {
                System.out.print(arr[i] + "; ");
            }
        }
        System.out.println("]");
        return arr;
    }

    public static void main(String[] args) {
        int[] array1 = {-1, -101, 36, 2, 7, 56, 79, 32, 4, 5, 33, 8, 5, 99, 1000, 2369, -12, 0, 5};
        int[] array2 = {-1 - 101, 36, 2, -12, 0, 57, 56, 79, 32, 5, 9, 1000, 23699};
        int[] array3 = {-1, -101, 0, 2, 7, 56, 0, 32, 4, 5, 0, 8, 5, 99, 1000, 2369, -12, 0, 5};

        sorting(array1);
        System.out.println();
        sorting(array2);
        System.out.println();
        sorting(array3);
        System.out.println();
        sorting(new int[]{1, 6, -4, 8, 9, 3, 364, 54, 567, 7, -2, -1});
    }
}
