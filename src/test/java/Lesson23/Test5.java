package Lesson23;

public class Test5 {
    public static void main(String[] args) {
        Employee emp5 = new Employee();
        Teacher t5 = new Teacher();
        Employee e5 = new Teacher();
        emp5.sleep();
        e5.sleep();
        t5.sleep();
        System.out.println(e5.salary);
    }
}

class Employee {
    String name;
    int age;
    int experience;
    static double salary = 100;

//    final void sleep() {
//        System.out.println("Employee sleeps");
//    }
     void sleep() {
        System.out.println("Employee sleeps");
    }
}

class Teacher extends Employee {
    int numberOfStudents;
    static String salary = "200";

    void sleep() {
        System.out.println("Teacher sleeps");
    }


}
//final class A{}
//class B extends A{}
