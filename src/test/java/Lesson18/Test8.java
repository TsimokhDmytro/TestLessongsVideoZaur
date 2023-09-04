package Lesson18;

public class Test8 {


    public static void main(String[] args) {

        char[] arr1 = {'H', 'e', 'l', 'l', 'o', '!'};
        char[] arr2 = {'H', 'e', 'l', 'l', 'o', ' ','W', 'o', 'r', 'l', 'd', '!'};


        String s1 = new String(arr1);
        StringBuilder sb1 = new StringBuilder(new String(arr2));

        System.err.println(s1);
        System.err.println(sb1);

//        sb1.append(arr1,2,3);
//        System.err.println(sb1);

        sb1.insert(2, arr1, 1,3);
        System.err.println(sb1);
    }
}
