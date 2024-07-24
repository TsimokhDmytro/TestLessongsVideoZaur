package Lesson26;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car("white", "v4");
//        Car c2 = null;
        Car c2 = new Car("white", "v4");
        Car c3 = new Car("black", "v8");
//        System.out.println(c1 == c2);
//        System.out.println(c1.equals(null));
//        System.out.println(c2.equals(c1));

//        System.out.println(c1.equals(c3));

        Car c4 = new Car("black", "v8");
        ArrayList<Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
//
//        System.out.println(list.contains(c4));
        System.out.println(list);

//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(c3);

//        System.out.println(c1.equals(c1));
//        System.out.println(c2.equals(c2));

    }

//    public boolean equals(Object obj) {
//        return (this == obj);
//    }

}

class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    //@Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Car){
//            return (color.equals(((Car) obj).color) && engine.equals(((Car) obj).engine));
//        }else{
//            return false;
//        }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car c2 = (Car) obj;
            return (color.equals(c2.color) && engine.equals(c2.engine));
//            return (color.equals(obj.color) && engine.equals(obj.engine));

        } else {
            return false;
        }
    }
@Override
    public String toString() {
        return "The car has color " + color + " and engine " + engine;
    }

//        public boolean equals(Car car) {
//        return (color.equals(car.color) && engine.equals(car.engine));
//    }
}

