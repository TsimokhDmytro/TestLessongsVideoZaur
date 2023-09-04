package Lesson16.HomeWork;

public class Email2 {

    public void email(String s) {

        int a = 0; //позиція символу '@'
        int b = 0; //позиція символу '.'
        int c = 0; //позиція символу ';'


        while (c < s.length() - 1) {
            a = s.indexOf('@', c);
            b = s.indexOf('.', c);
            c = s.indexOf(';', c+1);
            System.out.println(s.substring(a+1,b));

        }
    }


    public static void main(String[] args) {
        Email2 emTest = new Email2();
        emTest.email("iam@yahoo.com; hi@ukr.net.com; she@gmail.com;");

    }
}





