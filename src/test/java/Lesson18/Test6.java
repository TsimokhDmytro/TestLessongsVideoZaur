package Lesson18;

public class Test6 {
    static Test6 test1 = new Test6();
    static Test6 test2 = new Test6();
    static Test6 test3 = new Test6();
    static Test6 test4 = new Test6();

    static Test6[] array = {test1, test2, test3, test4, new Test6()};


    static String s1 = "54654";
    static String s2 = "Hello";
    static String s3 = "Good buy";

    static String[] array2 = {s1, s2, s3, new String("Ok"), "zdvdv"};


    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array.toString());
        }
    }

}
