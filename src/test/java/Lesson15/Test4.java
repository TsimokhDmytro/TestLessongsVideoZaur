package Lesson15;

public class Test4 {

    public static void main(String[] args) {

//        System.out.println(0%2);

        int a =1;

        while(a<=100){
            if(a%2==0 && a%3==0){
                System.out.println(a + " - it is fizz & bazz");
            }else if(a%2==0){
                System.out.println(a + " - it is fizz");
            }else if(a%3==0){
                System.out.println(a + " - it is bazz");
            }else {
            }
            a++;
        }
    }
}
