package Lesson12;

import java.util.Scanner;

public class Lesson12 {

    public void maxNumber1(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("The maximum number is: " + a);
        } else if (b > a && b > c) {
            System.out.println("The maximum number is: " + b);
        } else {
            System.out.println("The maximum number is: " + c);
        }
    }

    public void maxNumber2(int a, int b, int c){
        int maxInt = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("The maximum number is: " + maxInt);
    }


    public void abc() {
        String str;
        int g = 10;
        if (g >= 10) {
            str = "Hello";
        }else if (g < 10) {
            str = "Goodbye";
        }else{
            str ="null";
        }
        System.out.println(str);
    }

    public void empWorkTime1() {
        System.out.println("Input name day of the week");
        Scanner sc = new Scanner(System.in);
        String nameOfDay = sc.nextLine();

        if (nameOfDay.equals("Monday") || nameOfDay.equals("Tuesday") || nameOfDay.equals("Wednesday") || nameOfDay.equals("Thursday")
                || nameOfDay.equals("Friday")) {
            System.out.println("Employee works to 6:00 PM");
        } else if (nameOfDay.equals("Saturday")) {
            System.out.println("Employee works to 4:00 PM");
        } else if (nameOfDay.equals("Sunday")) {
            System.out.println("Employee has rest day");
        } else {
            System.out.println("Not correct day");
        }
    }

    public void empWorkTime2(String nameDay){
        String name = nameDay;
        switch (name) {
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
    }


    static class Test {

        public static void main(String[] args) {

            int a = 21;
            if (a > 20) {
                System.out.println("It is a true");
                System.out.println("dfgdfgfdg");
                a++;
            }

            int b = 21;
            if (b > 20) {
                System.out.println("It is a true");
                System.out.println("ttttt");
                b++;
            } else {
                System.out.println("It is a false");
                System.out.println("fffff");
                b++;
            }

            int c = -21;
            if (c > 20) {
                System.out.println("It is a true");
                System.out.println("tttttt");
                c++;
            } else if (c < 0) {
                System.out.println("It is error");
                System.out.println("eeeeee");
                c++;
            } else {
                System.out.println("It is a false");
                System.out.println("fffffff");
                c++;
            }

            int x = 5;
            if (x > 10) {
                System.out.println("x більше 10");
            } else if (x < 0) {
                System.out.println("x менше 0");
            } else {
                System.out.println("x знаходиться між 0 і 10");
            }

            Lesson12 test1 = new Lesson12();
            test1.maxNumber1(10, 20, 30);
            test1.maxNumber2(10,20,30);
            test1.abc();
            test1.empWorkTime1();
            test1.empWorkTime2("Saturday");
        }
    }
}


