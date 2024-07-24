package Lesson18.HomeWork;

import org.testng.annotations.Test;

import java.util.Arrays;

public class Sorting3 {
@Test
    public  void main() {
        System.out.println(Arrays.toString(sorting(1,3,-2,89,-34,21,2,40,-100)));
    }

    public static int[] sorting(int...arr) {
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
}
