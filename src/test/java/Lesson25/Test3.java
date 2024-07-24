package Lesson25;

public class Test3 {
    public static void main(String[] args) {
        Help_able1 h1 = new Doctor1();
        Employee1 emp1 = new Doctor1();
        Employee1 emp2 = new Teacher1();
        Employee1 emp3 = new Driver1();
//        Doctor1 d1 = (Doctor1) emp1;
//        System.out.println(((Doctor1) h1).specialization);
//        ((Doctor1) h1).help();
//        System.out.println(((Doctor1)emp1).specialization);
//        Driver1 d1 = (Driver1)emp2;
//        d1.drive();
//        Employee1 e1 = new Employee1();
//        Test3 t3 = new Test3();
//        System.out.println(e1==emp2);
//        System.out.println(e1==emp3);
//        System.out.println(e1==h1);
////        System.out.println(t3==e1);
        Employee1[] array = {emp1, emp2, emp3};
        for (Employee1 e : array) {
           if (e instanceof Driver1){
               System.out.println(((Driver1) e).nameOfCar);
               ((Driver1) e).drive();
           }
        }

//        System.out.println(emp3 instanceof Driver1);
    }
}


class Employee1 {
    String name;
    int age;
    int experience;
    double salary;

    public void eat() {
        System.out.print("eat; ");
    }

    public void sleep() {
        System.out.print("sleep; ");
    }
}

class Doctor1 extends Employee1 implements Help_able1 {
    public void help() {
        System.out.println("Doctor helps");
    }

    String specialization = "surgeon";

    public void treat() {
        System.out.println("treat");
    }
}

class Teacher1 extends Employee1 {
    int numberOfStudents;

    public void teach() {
        System.out.println("teach");
    }
}

class Driver1 extends Employee1 {
    String nameOfCar = "Mersedess";

    public void drive() {
        System.out.println("Driver drives");
    }
}

interface Help_able1 {
    void help();
}
