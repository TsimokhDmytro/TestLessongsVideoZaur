package Lesson7;

import Lesson7.HomeWork.Employee;

public class EmployeeTest2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(18);
//        Employee emp2 = new Employee("Tsimokh");
//        Employee emp3 = new Employee(4668.7);

//        System.out.println(emp1.id);
        System.out.println(emp1.surname);
//        System.out.println(emp1.salary);

//        System.out.println(emp2.id);
//        System.out.println(emp2.surname);
//        System.out.println(emp2.salary);

//        System.out.println(emp3.id);
//        System.out.println(emp3.surname);
//        System.out.println(emp3.salary);

        emp1.showId();
        emp1.showSurname();
        emp1.showSalary();

//        emp2.showId();
//        emp2.showSurname();
//        emp2.showSalary();

//        emp3.showId();
//        emp3.showSurname();
//        emp3.showSalary();

    }
}
