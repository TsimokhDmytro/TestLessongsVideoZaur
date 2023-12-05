package Lesson24;

public class Test4 {
    public static void main(String[] args) {

    }
    class Employee{
        String name = "Mykola";
        int age;
        double salary;
        public void sleep(){
            System.out.println(name + " sleep");
        }
        public void eat(){
            System.out.println(name + " eat");
        }
    }
    class Teacher extends Employee implements Lesson24.Test4.Help_able {
        int numberOfStudents;
        public void teach(){
            System.out.println("teacher teachs");
        }
        public void help(){
            System.out.println("teacher helps");
        }
        public void putOutTheFire() {
            System.out.println("teacher put out the fire");
        }
    }
    class Driver extends Employee implements Lesson24.Test4.Help_able, Lesson24.Test4.Swim_able {
        String nameOfTheCar;
        public void drive(){
            System.out.println("drives");
        }
        public void help() {
            System.out.println("driver helps");
        }
        public void putOutTheFire() {
            System.out.println("driver put out the fire");
        }
        public void swim() {
            System.out.println("driver swims");
        }
    }
    interface Help_able{
        public abstract void help();
        void putOutTheFire();
    }
    interface Swim_able{
        void swim();
    }
}
