//package Lesson23;
//
//public class Test2 {
//    public static void main(String[] args) {
//        Doctor d1 = new Doctor();
//        Teacher t1 = new Teacher();
//        Driver dr1 = new Driver();
//        Employee e1 = new Employee();
//
//        Employee e2 = new Doctor();
//        Employee e3 = new Teacher();
//        Employee e4 = new Driver();
//        Employee e5 = new Employee();
//
//        System.out.println(e2.age);
//        System.out.println(e2.experience);
//        System.out.println(e2.name);
//        System.out.println(e2.salary);
//        e2.eat();
//        e2.sleep();
////        e2.specialization;
////        e2.treat();
//
//
////        Driver e6 = new Employee();
//
//    }
//}
//class Employee{
//    String name;
//    int age;
//    int experience;
//    double salary;
//
//    public void eat(){
//        System.out.print("eat; ");
//    }
//    public void sleep(){
//        System.out.print("sleep; ");
//    }
//}
//
//class Doctor extends Employee {
//    String specialization;
//
//    public void treat(){
//        System.out.println("treat");
//    }
//}
//
//class Teacher extends Employee {
//    int numberOfStudents;
//
//    public void teach(){
//        System.out.println("teach");
//    }
//}
//
//class Driver extends Employee {
//    String nameOfCar;
//
//    public void drive(){
//        System.out.println("drive");
//    }
//}