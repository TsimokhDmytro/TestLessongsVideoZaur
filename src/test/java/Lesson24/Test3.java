package Lesson24;

public class Test3 {
    public static void main(String[] args) {
//        Teacher t = new Teacher("John");
        Teacher t = new Teacher("John");
        t.eat();
        t.sleep();
        t.teach();
        t.help();
        t.putOutTheFire();

//        Driver d = new Driver("Entony");
        Driver d = new Driver("Entony");
        d.eat();
        d.sleep();
        d.drive();
        d.help();
        d.putOutTheFire();
        d.swim();
    }
}

class Employee {
//    Employee(String n){
//        this.name = n;
//    }
    double salary = 100.34;
//    String name;
    private String name;
    public String getName(){
        this.name = name;
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    int age;
    int experience;

    void eat() {
        System.out.println(name + " eats");
    }

    void sleep() {
        System.out.println(name + " sleeps");
    }
}

class Teacher extends Employee implements Help_able{

//    Teacher(String n){
//        super(n);
//    }
    int numberOfStudents;
    Teacher(String name){
        setName(name);
    }

    public void teach(){
        System.out.println(getName() + " teach");
    }

    @Override
    public void help() {
        System.out.println(getName() + " helps");
    }

    @Override
    public void putOutTheFire() {
        System.out.println(getName() + " puts out the fire");
    }
}

class Driver extends Employee implements Help_able,Swim_able {

//    super.name = "Antony";
//    Driver(String n){
//        super(n);
//    }
    String nameOfCar;
    Driver(String name){
        setName(name);
    }

    public void drive(){
        System.out.println(getName() + " drive");
    }
    @Override
    public void help() {
        System.out.println(getName() + " helps");
    }

    @Override
    public void putOutTheFire() {
        System.out.println(getName() + " puts out the fire");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " swim");
    }
}
interface Help_able{
    void help();
    abstract void putOutTheFire();
    public final static int a =10;
}
interface Swim_able{
    void swim();
}



