package Lesson18;

import java.lang.reflect.Array;

public class Test1 {
//    public static void showArray(double [][] arr){
//        for(int i=0; i<arr.length; i++){
//            for (int j=0; j< arr.length; j++){
//                System.out.println(i+j);
//            }
//        }
//    }

    public static void main(String[] args) {
        int [] array1;
        String [] array2;
        double [][] array3;
        int [][] array4;
        double [] array5;
        double [] array6;
        int [] array7;


        array1 = new int [3];
        array2 = new String[6];
        array3 = new double[4][2];
        array4 = new int[4][];
        array5 = new double[2];
        array6 = new double[2];
        array7 = new int[2];


        array1[0]=5;
        array1[1]=3;
        array1[2]=-10;

        array2[0]="Hello";
        array2[1]="Good bay";
        array2[2]="Ok";
        array2[3]="d";
        array2[4]="356";
        array2[5]=" ";

//        array3[0][0]=3.14;
//        array3[0][1]=2.5;
//        array3[0][2]=6.7;
//        array3[0][3]=3;
//        array3[0][4]=12.98;
//        array3[1]=array5;
//        array3[2][0]=7.14;
//        array3[2][1]=0.19;
//        array3[2][2]=7.2;
//        array3[2][3]=8.255732;
//        array3[2][4]=0.98245;
//        array3[3][0]=799.14;
//        array3[3][1]=0.1239;
//        array3[3][2]=723.2;
//        array3[3][3]=8.255;
//        array3[3][4]=0.9;


        array5[0]=3.14;
        array5[1]=-2.5;

        array7[0]=3;
        array7[1]=-2;


        array3[0][0]=3.14;
        array3[0][1]=2.5;
        array3[1]=array5;
        array3[2][0]=7.14;
        array3[2][1]=0.19;
        array3[3][0]=-799.14;
        array3[3][1]=0.1239;


        System.out.println(array3[1][0]);
        System.out.println(array3[1][1]);

        array6=array5;

        System.out.println(array6[0]);
        System.out.println(array6[1]);


//        showArray(array3);

    }

}
