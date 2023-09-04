package Lesson12;

import java.util.Scanner;

public class ScannerClass1 {

    public static void checkAge() {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("How old are you?");

        int age = sc1.nextInt();

        if (age >= 18 && age <= 65) {
            System.out.println("You are adult");
        } else if (age >= 0 && age < 18) {
            System.out.println("You are very yang");
        } else {
            System.out.println("You are very old");
        }
        return;
    }

    public static void checkName() {
        Scanner sc2 = new Scanner(System.in);

        System.out.println("What is your name");

        String name = sc2.nextLine();

        if (name.length() >= 4 && name.length() <= 6) {
            System.out.println("You have a good name");
        } else {
            System.out.println("You have a not good name");
        }
    }

    public static void maxInt(int a, int b){
        int maxInt = (a>b) ? (a) : (b);
        System.out.println("The maximum number is: " + maxInt);
    }

    static class Test {
        public static void main(String[] args) {
//            checkAge();
//            checkName();
            maxInt(10,15);
        }
    }
}

