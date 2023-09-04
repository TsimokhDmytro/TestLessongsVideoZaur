package Lesson11;

public class Employee {

    public String name;
    public double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double doubleZp(double a) {
        a = a * 2;
        return a;
    }

    public double doubleZp2() {
        return salary = salary * 2;
    }
    static class EmployeeTest {
        public static void main(String[] args) {
            Employee emp1 = new Employee("Pol", 4568.145);
            double d = emp1.doubleZp(emp1.salary);
            System.out.println(d);
            System.out.println(emp1.salary);
            emp1.doubleZp2();
            System.out.println(emp1.salary);
        }
    }

}



