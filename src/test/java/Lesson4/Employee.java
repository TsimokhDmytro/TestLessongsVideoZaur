package Lesson4;

public class Employee {
    Employee(int numId, String surname, int a, double sal, String dep) {
        this.id = numId;
        this.surname = surname;
        this.age = a;
        this.salary = sal;
        this.department = dep;
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;

    public void showInfoEmployee() {
        System.out.println("\n" + "Id employee: " + id + "\n" + "Surname: " + surname + "\n" + "Age: " + age + "\n" + String.format("Salary: " + "%.1f", salary) + "\n" + "Department: " + department);
    }

    public double salaryX2() {
        salary *= 2;
        System.out.println(String.format("New salary: " + "%.1f", salary));
        return salary;
    }

    static class EmployeeTest {
        public static void main(String[] args) {
            Employee firstEmployee = new Employee(38, "Musk", 48, 54659.7673, "SpaceX");
            firstEmployee.showInfoEmployee();
            firstEmployee.salaryX2();
            Employee secondEmployee = new Employee(38, "Bezos", 51, 35664.5824, "Amazon");
            secondEmployee.showInfoEmployee();
            secondEmployee.salaryX2();
        }
    }
}