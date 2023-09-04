package Lesson12;


import java.util.Scanner;

public class ScannerClass2 {

    static int age;
    static String name;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How old are you?");

        age = sc.nextInt();

        if (age >= 18 && age <= 65) {
            System.out.println("You are adult");
        } else if (age == 0 && age < 18) {
            System.out.println("You are very yang");
        } else {
            System.out.println("You are very old");
        }

        Scanner sc1 = new Scanner(System.in);

        System.out.println("What is your name");

        name = sc1.nextLine();

        if (name.length() >= 4 && name.length() <= 6) {
            System.out.println("You have a good name");
        } else {
            System.out.println("You have a not good name");
        }
    }
}
