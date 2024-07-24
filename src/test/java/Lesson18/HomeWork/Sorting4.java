package Lesson18.HomeWork;

import org.testng.annotations.Test;

import java.util.Arrays;

public class Sorting4 {
    @Test
    public  void main() {
        System.out.println(Arrays.toString(sorting(1,3,2,-89,34,59,-21,2,40,600)));
    }

    public static int[] sorting(int...arr) {
        int a;
        for (int i = 0, j=1; i < arr.length-1 && j<arr.length-1; i++, j++) {
            int min = arr[i];
            int index = i;
            if (min>arr[j]){
                min=arr[j];
                index=j;
            }
            if (i != index) {
                a = arr[i];
                arr[i] = min;
                arr[index] = a;
            }
        }
        return arr;
    }
}
