package Lesson14;

public class Test7 {
    public void printHour() {
        OUTER:
        for (int time = 0; time < 24; time++) {
            System.out.println("Starting outer loop");
            INNER:
            for (int minute = 0; minute < 60; minute++) {
                System.out.println(time + ":" + minute);
            }
            System.out.println("Finishing outer loop");
        }
    }



    public static void main(String[] args) {
        Test7 t7 = new Test7();
        t7.printHour();
    }
}


