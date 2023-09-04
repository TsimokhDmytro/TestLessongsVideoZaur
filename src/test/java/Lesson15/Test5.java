package Lesson15;

public class Test5 {

    public static void main(String[] args) {

        int a = 1;

        while (a<=100){
            System.out.println(a);
            if(a%3==0 && a%7==0){
                break;
            }
            a++;
        }
    }
}
