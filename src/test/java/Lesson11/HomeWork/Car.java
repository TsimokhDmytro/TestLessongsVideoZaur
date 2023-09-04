package Lesson11.HomeWork;

public class Car {
    public String color;
    public String engine;
    public int doorsCount;

    Car(String color, String engine, int doorsNumber) {
        this.color = color;
        this.engine = engine;
        this.doorsCount = doorsNumber;
    }

    static class CarTest {
        public static void changeDoorsNumber(Car car, int doorsNumber) {
            car.doorsCount = doorsNumber;
        }

        public static void swapColors(Car car1, Car car2) {
            String color = car1.color;
            car1.color = car2.color;
            car2.color = color;
        }

        public static void main(String[] args) {
            Car car1 = new Car("black", "v6", 3);
            System.out.println("Color of the is: " + car1.color + "; engine: " + car1.engine + "; the doors number: "
                    + car1.doorsCount);
            Car car2 = new Car("green", "v8", 4);
            System.out.println("Color of the car2 is: " + car2.color + "; engine: " + car2.engine + "; the doors " +
                    "number: " + car2.doorsCount);
            changeDoorsNumber(car1, 6);
            changeDoorsNumber(car2, 2);
            swapColors(car1, car2);
            System.out.println("Color of the is: " + car1.color + "; engine: " + car1.engine + "; the doors " +
                    "number: " + car1.doorsCount);
            System.out.println("Color of the car2 is: " + car2.color + "; engine: " + car2.engine + "; the doors " +
                    "number: " + car2.doorsCount);
        }
    }
}

