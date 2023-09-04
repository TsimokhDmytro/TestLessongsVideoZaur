package Lesson13.HomeWork;

public class Month {

    public static void numbersOfTheMonth(int monthNumber) {

        int number = monthNumber;

        switch (number) {
            case 1:
            case 3:
            case 5:
            case 8:
            case 10:
            case 12:
                System.out.println("This month has 31 days");
                break;
            case 2:
                System.out.println("This month has 28 days");
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
                System.out.println("This month has 30 days");
                break;
            default:
                System.out.println("Not correct number of the month");
        }
    }

    public static void main(String[] args) {
        Month.numbersOfTheMonth(0);
        numbersOfTheMonth(0);
        numbersOfTheMonth(1);
        numbersOfTheMonth(05);
        numbersOfTheMonth(12);
        numbersOfTheMonth(13);

    }
}
