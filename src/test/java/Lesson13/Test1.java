package Lesson13;

public class Test1 {

    static class Student {
        int grade;

        Student(int grade) {
            this.grade = grade;
        }

        public static void main(String[] args) {
            Student st1 = new Student(3);
            switch (st1.grade) {
                case 2:
                    System.out.println("The student is bad");
                    break;
                case 3:
                    System.out.println("The student isn't good");
                    break;
                case 4:
                    System.out.println("The student is good");
                    break;
                case 5:
                    System.out.println("The student is perfect");
                    break;
                default:
                    System.out.println("The grade isn't correct");
            }
        }
    }
}
