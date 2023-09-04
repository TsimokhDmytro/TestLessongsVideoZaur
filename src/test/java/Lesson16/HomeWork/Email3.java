package Lesson16.HomeWork;

public class Email3 {

    public void email(String s) {
        int a = s.indexOf('@');
        int b = s.indexOf('.');//позиція символу '.'

        System.out.println(s.substring(a+1, b));

    }


    public static void main(String[] args) {
        Email3 emTest = new Email3();
        emTest.email("iam@yahoo.com");

    }
}





