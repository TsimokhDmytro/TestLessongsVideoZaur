package Lesson7.HomeWork;

public class Employee {

    public void showId() {
        System.out.println("ID = " + id);
    }

    public void showSurname() {
        System.out.println("SURNAME = " + surname);
    }

    public void showSalary() {
        System.out.println("SALARY = " + salary);
    }

    public Employee(int id1) {
        id = id1;
    }

    Employee(String surname2) {
        surname = surname2;
    }

    private Employee(double salary3) {
        salary = salary3;
    }

    int id;
    public String surname;
    int age;
    private double salary;
    String department;

}