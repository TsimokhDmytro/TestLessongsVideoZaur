package Lesson22.HomeWork;

public class Student3 {

    private StringBuilder name;
    private int course;
    private double grade;

    public StringBuilder getName() {
        StringBuilder name1 = new StringBuilder(name);
        return name1;
    }
    public int getCourse() {
        return course;
    }

    public double getGrade() {
        return grade;
    }


    public void setName(StringBuilder sb) {
        if (sb.length() > 3) {
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
        System.out.println("Student's name: " + getName()+"; " + "Student's coure: " + getCourse() +"; " + "Student's grade: " + getGrade());
    }
}

class TestStudent3 {
    public static void main(String[] args) {
        Student3 st3 = new Student3();
        StringBuilder sb1= new StringBuilder("Rehard");
        st3.setName(new StringBuilder(sb1));
        st3.setCourse(4);
        st3.setGrade(6.6);
        st3.showInfo();
    }
}
