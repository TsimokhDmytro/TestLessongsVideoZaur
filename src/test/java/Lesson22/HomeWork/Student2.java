package Lesson22.HomeWork;

public class Student2 {

    private StringBuilder name;
    private int course;
    private double grade;

    Student2(StringBuilder sb, int c, double g){
        this.name=setName(new StringBuilder(sb));
        this.course=setCourse(c);
        this.grade=setGrade(g);
    }

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }
    public int getCourse() {
        return course;
    }

    public double getGrade() {
        return grade;
    }

    public StringBuilder setName(StringBuilder sb) {
        if (sb.length() >= 3) {
            this.name = sb;
        }
        return name;
    }

    public int setCourse(int c) {
        if (c >= 1 && c <= 4) {
            this.course = c;
        }
        return course;
    }

    public double setGrade(double g) {
        if (g >= 1 && g <= 10) {
            grade = g;
        }
        return grade;
    }

    public void showInfo() {
        System.out.println(getName().append("!!!"));
        System.out.println(getCourse());
        System.out.println(getGrade());
    }
}

class TestStudent2 {
    public static void main(String[] args) {
        Student2 st2 = new Student2(new StringBuilder("John"), 3, 8.6);
        st2.showInfo();
        System.out.println(st2.getName());
    }
}
