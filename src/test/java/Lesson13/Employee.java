package Lesson13;

public class Employee {

    public static void main(String[] args) {

        switch ("Saturday") {
            case "Monday":

            case "Tuesday":

            case "Wednesday":

            case "Thursday":

            case "Friday":
                System.out.println("Employee works to 6:00 PM");
                break;
            case "Saturday":
                System.out.println("Employee works to 4:00 PM");
                break;
            case "Sunday":
                System.out.println("Employee has rest day");
                break;
            default:
                System.out.println("Not correct day");
        }

        int dayOfTheWeek = 1;

        switch (dayOfTheWeek * 3) {
            case 3:
                System.out.println("Employee works to 3:00 PM");
                break;
            case 2:
                System.out.println("Employee works to 4:00 PM");
                break;
            case 5:
                System.out.println("Employee works to 6:00 PM");
                break;
        }

        final int a = 1;
        final int b = 2;

        switch (2) {
            case a * b:
                System.out.println("........");
                break;
            default:
                System.out.println("-------");
        }

//        final int a;
//        final int b;
//        a = 1;
//        b = 2;
//
//        switch (2) {
//            case a * b:
//                System.out.println("........");
//                break;
//            default:
//                System.out.println("-------");
//        }



        switch ((int) 3.14) {
            case (int) 3.14:
                System.out.println("........");
                break;
            default:
                System.out.println("-------");
        }

        switch ("Hi") {
            case "Good buy":
                System.out.println("........");
                break;
            default:
                System.out.println("-------");
        }

//        switch ("Hi") {
//            case (3):
//                System.out.println("........");
//                break;
//            default:
//                System.out.println("-------");
//        }

//        switch ("Hi") {
//            case null:
//                System.out.println("........");
//                break;
//            default:
//                System.out.println("-------");
//        }
    }
}



