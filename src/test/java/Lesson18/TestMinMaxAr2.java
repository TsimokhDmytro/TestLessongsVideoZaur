package Lesson18;

import java.util.Arrays;

public class TestMinMaxAr2 {

    static public void maxMin(int [] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i <arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }if(arr[i]>max){
                max = arr[i];
            }
        }
        System.err.println("min element array: " + min);
        System.err.println("max element array: " + max);
    }

    static public void maxMin(double [] arr) {
        double min = arr[0];
        double max = arr[0];
        for (int i = 1; i <arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }if(arr[i]>max){
                max = arr[i];
            }
        }
        System.err.println("min element array: " + min);
        System.err.println("max element array: " + max);
    }

    static public void maxMin(float [] arr) {
        float min = arr[0];
        float max = arr[0];
        for (int i = 1; i <arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }if(arr[i]>max){
                max = arr[i];
            }
        }
        System.err.println("min element array: " + min);
        System.err.println("max element array: " + max);
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