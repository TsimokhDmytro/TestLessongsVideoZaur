//package Lesson25;
//
//public class Test1 {
//    public static void main(String[] args) {
//        EmployeeTest9 emp1 = new Teacher();
//        EmployeeTest9 emp2 = new Driver();
//        EmployeeTest9 emp3 = new Doctor();
////        Help_able h1 = new Teacher();
////        Help_able h2 = new Driver();
////        Help_able h3 = new Doctor();
////        emp1.work();
////        emp2.work();
////        emp3.work();
////        h1.help();
////        h2.help();
////        h3.help();
////        Employee[] array = {emp1, emp2, emp3};
//        int array2 [] = {1,2,3};
//        Object o = new Object();
////
//////        Driver [] array1 = {new Driver(), new Driver()};
//////        Employee [] array2 = {new Driver(), new Driver(), new Teacher(), new Driver()};
//////        Help_able [] array3 = {new Driver(), new Driver(), new Teacher(), new Driver()};
////
////        for (Employee emp : array) {
////            emp.work();
////        }
////        String s1 = null;
//        System.out.println(array2 instanceof Object);
//        System.out.println(null instanceof String);
//        System.out.println(o instanceof Teacher);
//    }
//}
//
//abstract class Employee {
//    public void sleep() {
//        System.out.println("Employee sleeps");
//    }
//
//    abstract void work();
//}
//
//class Teacher extends EmployeeTest9 implements Help_able {
//    @Override
//    void work() {
//        System.out.println("Teacher works");
//    }
//
//    @Override
//    public void help() {
//        System.out.println("Teacher helps");
//    }
//}
//
//class Driver extends EmployeeTest9 implements Help_able {
//    @Override
//    void work() {
//        System.out.println("Driver works");
//    }
//
//    @Override
//    public void help() {
//        System.out.println("Driver helps");
//    }
//}
//
//class Doctor extends EmployeeTest9 implements Help_able {
//    @Override
//    void work() {
//        System.out.println("Doctor works");
//    }
//
//    @Override
//    public void help() {
//        System.out.println("Doctor helps");
//    }
//}
//
//interface Help_able {
//    void help();
//}
