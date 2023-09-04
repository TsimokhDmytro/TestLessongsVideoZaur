package Lesson7;

public class Employee {
    Employee(int id1, String surname1, int age1) {
        this (id1,surname1,age1,0.0,null);
    }
    Employee(String surname2, int age2, String department2) {
        this (0,surname2,age2,0.0,null);
    }
    Employee(String surname3, int age3) {
        this (0,surname3,age3,0.0,null);
    }

    Employee(int id4, String surname4, int age4, double salary4, String department4) {
        surname = surname4;
        age = age4;
        id = id4;
        salary = salary4;
        department = department4;
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;

    static class EmployeeTest {
        public static void main(String[] args) {
            Employee emp1 = new Employee(45, "Tsimokh", 36);
            System.out.println(emp1.surname);
            Employee emp2 = new Employee("Musk", 46,"IT");
            System.out.println(emp2.surname + " " + emp2.age);
            Employee emp3 = new Employee("Tsukerberg", 48);
            System.out.println(emp3.surname);
            Employee emp4 = new Employee(45, "Bill", 68, 2020, "Politic");
            System.out.println(emp4.salary);
        }
    }
}
