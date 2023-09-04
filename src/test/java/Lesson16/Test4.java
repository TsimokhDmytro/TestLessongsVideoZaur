package Lesson16;

public class Test4 {
    static class Employee {

        double salary;
        boolean isManager;

        Employee(double salary, boolean isManager) {
            this.salary = salary;
            this.isManager = isManager;
        }

    }

     static class TestEmployee {
        public static void main(String[] args) {
            Employee emp1 = new Employee(945.6, true);
            System.out.println("He is a manager: " + emp1.isManager);
            System.out.println("Hi has salary: " + emp1.salary);
        }
    }
}




