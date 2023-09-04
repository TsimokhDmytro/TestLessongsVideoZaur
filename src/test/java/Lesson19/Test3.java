package Lesson19;

public class Test3 {
    public static void main(String[] args) {
        int [] array1;
        array1 = new int[4];
        array1[0] =1;
        array1[1] =2;
        array1[2] =3;
        array1[3] =4;
        for (int a:array1) {
            System.out.print(a + " ");
        }

        for (int i = 0; i<array1.length; i++)
        System.out.print(array1[i] + " ");
    }
}
