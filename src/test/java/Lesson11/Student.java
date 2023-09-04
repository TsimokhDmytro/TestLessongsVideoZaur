package Lesson11;

public class Student {
    public String name;
    public int course;
    public double grade;

    public Student (String name, int course, double grade){
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
    public static void swap(Student st1, Student st2){
        Student st3 = st1;
         st1 = st2;
         st2 = st3;
        System.out.println(st1.name);
        System.out.println(st2.name);
    }
    public static void changeName(Student st, String newName){
        st.name = newName;
    }

    public static void main(String[] args) {
        Student st1 = new Student("Mike", 4,4.15);
        System.out.println(st1.name);
        Student st2 = new Student("Ted", 3,3.15);
        System.out.println(st2.name);
        swap(st1,st2);
        System.out.println(st1.name);
        System.out.println(st2.name);
        changeName(st2, "Ilon");
        System.out.println(st2.name);
    }
}
