package Lesson14;

public class Test5 {

    public static void main(String[] args) {

//
//        for(int i=0; 3<2; i++){
//            System.out.println(i);
//        }

        int i = 10;
        if (false) {
            System.out.println("sdgdfg");
        }

        for (int j = 0; j < 10; j++) {
            if (j == 7) {
                break;
            }
            System.out.println(j);
        }

        for (int j = 0; j < 100; j++) {
            if (j >= 6 && j <= 96) {
                continue;
            }
            System.out.println(j);
        }

        for (int j = 0; j < 10; j++) {
            if (j == 6) {
                continue;
            }
            System.out.println(j);
        }
    }
}


