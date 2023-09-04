package Lesson12;

public class Car2 {

    int engine;
    int numberOfDoors;

    Car2(int engine, int numberOfDoors) {
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
    }
public static void compareCars(Car2 car1, Car2 car2){

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


    static class Test {

        public static void main(String[] args) {
            Car2 car1 = new Car2(4, 4);
            Car2 car2 = new Car2(4, 3);
            compareCars(car1,car2);

        }
    }
}