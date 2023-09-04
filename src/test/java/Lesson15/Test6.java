package Lesson15;

public class Test6 {

    public static void main(String[] args) {

        int a = 0;

        while (a < 100) {
            a++;
            if (a % 3 == 0 && a % 5 == 0) {
                continue;
            }
            System.out.println(a);
        }
    }
}
