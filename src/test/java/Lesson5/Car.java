package Lesson5;

public class Car {
    Car (String cvet, String motor){
        color = cvet;
        engine = motor;
        System.out.println("\n"+"Color the car: "+color+"\n"+"Engine the car: "+engine);
    }

    String color;
    String engine;

    static class CarTest{
        public static void main(String[] args) {
            Car c0 = new Car("red", "V8");
            Car c1 = new Car("yellow", "V6");
        }
    }
}
