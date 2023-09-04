package Lesson4;

public class Student {

    int studentId;
    String name;
    String surname;
    int course;
    float avgMarkMath;
    float avgMarkEconomy;
    float avgMarkForeignLanguage;

    void showInfoStudent() {
        System.out.println("\n" + "Name: " + name + "\n" + "Surname: " + surname + "\n" + "Student ID: " + studentId + "\n" + "Course: " + course);
    }

    void showAvgMark(float a, float b, float c) {
        float avgMark = (a + b + c) / 3;
        System.out.println(String.format("AVG mark: " +"%.1f", avgMark));
    }

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "Petro";
        st1.surname = "Mush";
        st1.studentId = 50;
        st1.course = 4;
        float a1 = st1.avgMarkEconomy = 95.84f;
        float b1 = st1.avgMarkMath = 92.73f;
        float c1 = st1.avgMarkForeignLanguage = 73.91f;
        st1.showInfoStudent();
        st1.showAvgMark(a1, b1, c1);

        Student st2 = new Student();
        st2.name = "Vasyl";
        st2.surname = "Tsum";
        st2.studentId = 35;
        st2.course = 3;
        float a2 = st2.avgMarkEconomy = 81.02f;
        float b2 = st2.avgMarkMath = 96.55f;
        float c2 = st2.avgMarkForeignLanguage = 65.15f;
        st2.showInfoStudent();
        st2.showAvgMark(a2, b2, c2);

        Student st3 = new Student();
        st3.name = "Andriy";
        st3.surname = "Zir";
        st3.studentId = 16;
        st3.course = 2;
        float a3 = st3.avgMarkEconomy = 55.27f;
        float b3 = st3.avgMarkMath = 90.89f;
        float c3 = st3.avgMarkForeignLanguage = 62.96f;
        st3.showInfoStudent();
        st3.showAvgMark(a3, b3, c3);
    }
}