package Lesson19;

public class Test7 {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4};
//        for (int i = 0; i < array1.length; i++) {
//            array1[i] = 3;
//        }

        for(int a:array1){
            a = 4;
        }

        for (int i=0; i<array1.length; i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println();


        String[] array2 = {"Hello", "Buye-Buye", "See you later"};

        for(String s:array2){
            s = "Go in pussy";
        }

        for (int i=0; i<array2.length; i++){
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        StringBuilder sb1 = new StringBuilder("Good day");
        StringBuilder sb2 = new StringBuilder("Bad day");
        StringBuilder sb3 = new StringBuilder("Fine day");

        StringBuilder[] array3 = {sb1, sb2, sb3};

        for(StringBuilder sb:array3){
            sb = new StringBuilder("Normal Day");
        }
        for (int i=0; i<array3.length; i++){
            System.out.print(array3[i] + " ");
        }
        System.out.println();

        StringBuilder sb4 = new StringBuilder("Ok");
        StringBuilder sb5 = new StringBuilder("Fine");
        StringBuilder sb6 = new StringBuilder("Bad");

        StringBuilder[] array4 = {sb4, sb5, sb6};

        for(StringBuilder sb:array4){
            sb.append(" Jva");
        }
        for (int i=0; i<array4.length; i++){
            System.out.print(array4[i] + " ");
        }
        System.out.println();
    }
}
