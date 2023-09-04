package Lesson14.HomeWork;

public class OstatokOtDeleniya {

    public static void showOstatokOtDeleniya(int a, int b){
        int ostatok = a%b;
        System.out.println(ostatok);
        if (ostatok == 0)
        System.out.println("Fizz");
    }

    public static void main(String[] args) {
        showOstatokOtDeleniya(100,10);
    }
}
