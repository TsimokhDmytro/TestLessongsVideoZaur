package Lesson18;

import java.util.Arrays;

public class TestMinMaxAr1 {

    static public void maxMin(int [] arr) {
        Arrays.sort(arr);
        System.err.println("min element array: " + arr[0]);
        System.err.println("max element array: " + arr[arr.length - 1]);
    }

    static public void maxMin(double [] arr) {
        Arrays.sort(arr);
        System.err.println("min element array: " + arr[0]);
        System.err.println("max element array: " + arr[arr.length - 1]);
    }

    static public void maxMin(float [] arr) {
        Arrays.sort(arr);
        System.err.println("min element array: " + arr[0]);
        System.err.println("max element array: " + arr[arr.length - 1]);
    }

    public static void main(String[] args) {

        int[] array1 = {1226, 248, 6689, 58, 0, 88, -12, -1};
        double[] array2 = {12.4, 458.4, 66.89, 5.8, 0, 88, -1.2, -1.0};
        float[] array3 = {126.4f, 528.4f, -626.89f, 5.8f, 0f, 88f, -1.2f, -1.0f};

        maxMin(array1);

        maxMin(array2);

        maxMin(array3);

        maxMin(new int[]{1226, 248, 6689, 58, 0, 88, -12, -1});

    }
}