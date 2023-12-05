package Lesson19;

import java.util.Arrays;

public class LostNums {

    public static void lostNums(int... nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + 1 !=nums[j]) {
                    System.out.println();
                }
                System.out.println(result);
            }

        }
    }






    static class Test1 {
        public static void main(String[] args) {
            lostNums(0,4);
        }
    }
}





