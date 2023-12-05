package Lesson22;

public class Human3 {
    protected String name = "Jack";

//    protected String getName() {
//        return name;
//    }

//    protected void setName(String n) {
//        name = n;
//    }

    protected static int salary = 3500;


    protected void work() {
        System.out.println("work");
    }

    protected static void rest() {
        System.out.println("rest");
    }
}

class Student extends Human3 {

    public static void main(String[] args) {
        Human3 h3 = new Human3();
        System.out.println(h3.name);
        System.out.println(Human3.salary);
        h3.work();
        Human3.rest();

        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.rest();
    }
}
