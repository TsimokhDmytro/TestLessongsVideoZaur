package Lesson16.HomeWork;

public class Email1 {

    public void email(String email1, String email2, String email3) {

        String em1 = email1;
        String em2 = email2;
        String em3 = email3;

        for (int i = em1.indexOf('@') + 1; i < em1.length(); i++) {
            char c1 = em1.charAt(i);
            if (c1 == '.') {
                break;
            }
            System.out.print(c1);
        }
        System.out.println();

        for (int i = em2.indexOf('@') + 1; i < em2.length(); i++) {
            char c2 = em2.charAt(i);
            if (c2 == '.') {
                break;
            }

            System.out.print(c2);
        }
        System.out.println();

        for (int i = em3.indexOf('@') + 1; i < em3.length(); i++) {
            char c3 = em3.charAt(i);
            if (c3 == '.') {
                break;
            }
            System.out.print(c3);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Email1 emTest = new Email1();
        emTest.email("iam@yahoo.com", "hi@ukr.net.com", "she@gmail.com");

    }
}




