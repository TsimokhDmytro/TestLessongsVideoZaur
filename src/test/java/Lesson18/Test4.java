package Lesson18;

public class Test4 {
    static String s;
    public static void main(String[] args) {
        int array1 [] = new int [3];
        array1 [0]=2;
        array1 [1]=2;
        array1 [2]=2;
//        array1 [3]=2;


        int [][] array2 = new int[3][];
        array2[0] = array1;
        array2[0][1] = 1;
        System.out.println(array2[1][2]);
//        System.out.println(s.length());
    }



}
