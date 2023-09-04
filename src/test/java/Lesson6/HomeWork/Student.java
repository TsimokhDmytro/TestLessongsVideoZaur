package Lesson6.HomeWork;

public class Student {
    int studentId;
    String nameStudent;
    String surnameStudent;
    int courseStudent;
    float avgMarkMath;
    float avgMarkEconomy;
    float avgMarkForeignLanguage;

    Student(int id1, String name1, String surname1, int course1, float markMath1, float markEconomy1, float markLanguage1) {
        studentId = id1;
        nameStudent = name1;
        surnameStudent = surname1;
        courseStudent = course1;
        avgMarkMath = markMath1;
        avgMarkEconomy = markEconomy1;
        avgMarkForeignLanguage = markLanguage1;
    }

    Student(int id2, String name2, String surname2, int course2) {
        this(id2, name2, surname2, course2, 0.0f, 0.0f, 0.0f);
    }

    Student() {
        this(0, null, null, 0, 0.0f, 0.0f, 0.0f);
    }

    public static void main(String[] args) {
        Student st1 = new Student(15, "Dmytro", "Tsimokh", 5, 94.3f, 88.2f, 79.4f);
        Student st2 = new Student(15, "Ilon", "Musk", 3);
        Student st3 = new Student();
        System.out.println("Student 1: " + st1.surnameStudent);
        System.out.println("Student 2: " + st2.surnameStudent);
        System.out.println("Student 3: " + st3.surnameStudent);
    }
}
