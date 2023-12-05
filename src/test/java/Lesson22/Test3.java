package Lesson22;

public class Test3 {
    public void salary(Employee e){
        e.salary=e.salary=100;
    }
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.name="Bred";
        doctor.age=29;
        doctor.experience=8;
        doctor.specialization="surgeon";
        doctor.eat();
        doctor.sleep();
        doctor.treat();

        Teacher teacher = new Teacher();
        teacher.name="Lesley";
        teacher.age=25;
        teacher.experience=2;
        teacher.numberOfStudents=30;
        teacher.eat();
        teacher.sleep();
        teacher.teach();

        Driver driver = new Driver();
        driver.name="Tim";
        driver.age=49;
        driver.experience=20;
        driver.nameOfCar="BWM";
        driver.eat();
        driver.sleep();
        driver.drive();
    }
}

class Employee{
    String name;
    int age;
    int experience;
    double salary;

    public void eat(){
        System.out.print("eat; ");
    }
    public void sleep(){
        System.out.print("sleep; ");
    }
}

class Doctor extends Employee{
    String specialization;

    public void treat(){
        System.out.println("treat");
    }
}

class Teacher extends Employee{
    int numberOfStudents;

    public void teach(){
        System.out.println("teach");
    }
}

class Driver extends Employee{
    String nameOfCar;

    public void drive(){
        System.out.println("drive");
    }
}