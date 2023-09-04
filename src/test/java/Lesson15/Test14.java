package Lesson15;

public class Test14 {
    public static void main(String[] args) {
        int money = 100;
        do{
            System.out.println("You must play");
            System.out.println("You loosed");
            money-=10;
        }while(money>50);
    }
}
