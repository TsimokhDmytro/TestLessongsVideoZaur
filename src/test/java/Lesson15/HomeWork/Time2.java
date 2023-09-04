package Lesson15.HomeWork;

public class Time2 {

     static void printTime() {
        int hour = 0;

        OUTER:
        while (hour < 6) {

            int minute = -1;

            MIDDLE:
            do {
                System.out.println("Starting iteration OUTER loop");
                minute++;

                if (hour > 1 && minute % 10 == 0) {
                    break OUTER;
                }
                int second = 0;
                INNER:
                while (second < 60) {
                    if (second * hour > minute) {
                        continue MIDDLE;
                    }

                    System.out.println(hour + ":" + minute + ":" + second);
                    second++;
                }
                System.out.println("Finishing iteration OUTER loop");
            }

            while (minute < 59);
            hour++;
        }
    }

    public static void main(String[] args) {
        printTime();
    }
}
