package Lesson22.HomeWork;

public class Student1 {

    private StringBuilder name;
    private int course;
    private double grade;


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


    public void setName(StringBuilder sb) {
        if (!sb.isEmpty() && sb.length() >= 3) {
            this.name = new StringBuilder(sb);
        }
    }


    public void setCourse(int c) {
        if (c >= 1 && c <= 4) {
            this.course = c;
        }
    }

    public void setGrade(double g) {
        if (g >= 1 && g <= 10) {
            grade = g;
        }
    }

    public void showInfo() {
        System.out.println(getName().append("!!!"));
        System.out.println(getCourse());
        System.out.println(getGrade());
    }
}

class TestStudent1 {
    public static void main(String[] args) {
        Student1 st1 = new Student1();
        st1.setName(new StringBuilder("Rehard"));
        st1.setCourse(3);
        st1.setGrade(7.5);
        st1.showInfo();
        System.out.println(st1.getName());
    }
}
