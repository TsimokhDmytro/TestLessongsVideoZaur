package Lesson12.HomeWork;

import Lesson11.Student;

public class StudentTest {

    public static void compareStudents1(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Students are equal");
        } else {
            System.out.println("Students aren't equal");
        }
    }

    public static void compareStudents2(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade)
                    System.out.println("Students have equal names, course and grade");
                else
                    System.out.println("Students have equal names and courses, but grades are different");
            } else {
                System.out.println("Students have equal names, but courses are different");
            }
        } else {
            System.out.println("Students have a different names");
        }
    }


    public static void main(String[] args) {

        Student st1 = new Student("Mike", 4, 4.15);
        Student st2 = new Student("John", 4, 4.15);

        compareStudents1(st1, st2);
        compareStudents2(st1, st2);
    }
}

