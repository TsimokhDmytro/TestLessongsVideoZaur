package Lesson18.HomeWork;


public class Sorting2 {

    public static int[] sorting(int[] arr) {

        int a;
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            if (i != index) {
                a = arr[i];
                arr[i] = min;
                arr[index] = a;
            }
        }
        return arr;
    }

    public static void printResult1(int[] sortArr) {
        sorting(sortArr);
        System.out.println("Array after sorting: ");
        System.out.print("[");
        for (int i = 0; i < sortArr.length; i++) {
            if (i == sortArr.length - 1) {
                System.out.print(sortArr[i]);
            } else {
                System.out.print(sortArr[i] + "; ");
            }
        }
        System.out.println("]\n");
    }

//    public static void printResult2(int[] sortArr) {
//        sorting(sortArr);
//        System.out.println("Array after sorting: ");
//        System.out.print("[");
//        for (int a : sortArr) {
//            System.out.print(sortArr[a] + "; ");
//        }
//        System.out.println("]");
//    }


    public static void main(String[] args) {
        int[] array1 = {-1, -101, 36, 2, 7, 56, 79, 32, 4, 5, 33, 8, 5, 99, 1000, 2369, -12, 0, 5};
        int[] array2 = {-1 - 101, 36, 2, -12, 0, 57, 56, 79, 32, 5, 9, 1000, 23699};
        int[] array3 = {-1, -101, 0, 2, 7, 56, 0, 32, 4, 5, 0, 8, 5, 99, 1000, 2369, -12, 0, 5};


        printResult1(array1);
        printResult1(array2);
        printResult1(array3);
        printResult1(new int[]{1, 6, -4, 8, 9, 3, 364, 54, 567, 7, -2, -1});


//        printResult2(array1);
//        printResult2(array2);
//        printResult2(array3);
//        printResult2(new int[]{1, 6, -4, 8, 9, 3, 364, 54, 567, 7, -2, -1});

    }
}
