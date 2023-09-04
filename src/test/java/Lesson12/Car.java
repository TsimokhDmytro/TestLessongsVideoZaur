package Lesson12;

public class Car {

    int engine;
    int numberOfDoors;

    Car(int engine, int numberOfDoors) {
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
    }

    static class Test {

        public static void main(String[] args) {
            Car car1 = new Car(4, 4);

            Car car2 = new Car(4, 3);

            if (car1.engine > car2.engine) {
                if (car1.numberOfDoors > car2.numberOfDoors) {
                    System.out.println("Engine and number of doors 1-st car more then 2-nd car");}
                else if (car1.numberOfDoors < car2.numberOfDoors) {
                    System.out.println("Engine 1-st car more then 2-nd car but number of doors less then 2-nd car");}
                else {
                    System.out.println("Engine 1-st car more then 2-nd car but number of doors are equals");}}
            else if (car1.engine == car2.engine){
            if (car1.numberOfDoors > car2.numberOfDoors) {
                System.out.println("Engine 1-st and 2-nd car are equals but number of doors 1-st car more then 2-d car");}
            else if (car1.numberOfDoors < car2.numberOfDoors) {
                System.out.println("Engine 1-st and 2-nd car are equals but number of doors 1-st car less then 2-nd car");}
            else {
                System.out.println("Engine and number of doors 1-st and 2-nd car are equals");}}
            else {
                if (car1.numberOfDoors > car2.numberOfDoors) {
                    System.out.println("Engine 1-st car less then 2-nd car but number of doors 1-st car more then 2-d car");
                } else if (car1.numberOfDoors < car2.numberOfDoors) {
                    System.out.println("Engine and number of doors 1-st car are less then 2-nd car");
                } else {
                    System.out.println("Engine 1-st car less then 2-nd car but number of doors 1-st and 2-d car are equals");}}
        }
    }
}