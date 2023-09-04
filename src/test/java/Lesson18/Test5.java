package Lesson18;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int [] array1 = {1,2,78,6,-45,100,0,1203};
        for (int i=0; i<array1.length; i++){
            System.out.print(array1[i] + "; ");
        }
        System.out.println();
        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "; ");
        }
        System.out.println();
        int index = Arrays.binarySearch(array1,9);
        System.err.println(index);
        System.err.println(Arrays.binarySearch(array1,126));

        System.err.println(array1.toString().toUpperCase());

    }


}
