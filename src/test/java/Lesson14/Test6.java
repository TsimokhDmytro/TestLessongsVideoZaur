package Lesson14;

public class Test6 {
    public static void main(String[] args) {

        for (int i = 0; i<=18; i++) {
            if (i == 8) {
                continue;
            }
            if (i % 12 == 0) {
                break;
            }
            System.out.println(i);
        }
    }
}
