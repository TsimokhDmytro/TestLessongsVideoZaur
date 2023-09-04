package Lesson6.HomeWork;

public class Student2 {
    int studentId;
    String nameStudent;
    String surnameStudent;
    int courseStudent;
    float avgMarkMath;
    float avgMarkEconomy;
    float avgMarkForeignLanguage;

    float SredniyaArifmeticheskayaOtsenka() {
        float result = avgMarkMath + avgMarkEconomy + avgMarkForeignLanguage;
        System.out.println("Sredniya arifmeticheskaya otsenka " + nameStudent + " " + surnameStudent + ": " + result);
        return result;
    }

    Student2(int id1, String name1, String surname1, int course1, float markMath1, float markEconomy1, float markLanguage1) {
        studentId = id1;
        nameStudent = name1;
        surnameStudent = surname1;
        courseStudent = course1;
        avgMarkMath = markMath1;
        avgMarkEconomy = markEconomy1;
        avgMarkForeignLanguage = markLanguage1;
    }

    Student2(int id2, String name2, String surname2, int course2) {
        this(id2, name2, surname2, course2, 0.0f, 0.0f, 0.0f);
    }

    Student2() {
    }

    public static void main(String[] args) {
        Student2 st1 = new Student2();
        st1.studentId = 25;
        st1.nameStudent = "Jon";
        st1.surnameStudent = "Dolson";
        st1.courseStudent = 5;
        st1.avgMarkMath = 81.45f;
        st1.avgMarkEconomy = 56.37f;
        st1.avgMarkForeignLanguage = 45.78f;
        st1.SredniyaArifmeticheskayaOtsenka();

        Student2 st2 = new Student2(15, "Ilon", "Musk", 3);
        st2.avgMarkMath = 81.45f;
        st2.avgMarkEconomy = 56.37f;
        st2.avgMarkForeignLanguage = 45.78f;
        st2.SredniyaArifmeticheskayaOtsenka();

        Student2 st3 = new Student2(15, "Dmytro", "Tsimokh", 5, 94.3f, 88.2f, 79.4f);
        st3.SredniyaArifmeticheskayaOtsenka();
    }
}
