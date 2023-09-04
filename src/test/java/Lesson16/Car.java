package Lesson16;

public class Car {
    String color;
    String engine;

   public Car (String color, String engine){
        this.color=color;
        this.engine=engine;
    }
    public Car abc (String color){
        Car car4 = new Car(color, "V2");
        return car4;
    }

final static int a = 10;

//    public static void main(String[] args) {
//        a=20;
//    }

    class CarTest1 {
        final static Car car1 = new Car("green", "V6");

        public static void main(String[] args) {
            //        car1 = new Car("black", "V6");
            car1.color = "black";
            System.out.println(car1.color);
        }
    }

    class CarTest2{
        public static void main(String[] args) {
            Car car2 = new Car("red", "V6");
            Car car3 = car2.abc("blue");
            System.out.println(car3.color+ " " + car3.engine);
            System.out.println(car2.color+ " " + car2.engine);
        }
    }

}



