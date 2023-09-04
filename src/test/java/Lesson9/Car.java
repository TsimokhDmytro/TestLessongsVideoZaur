package Lesson9;

public class Car {
    String color;
    String engine;
    static int count;

    public Car (String color2, String engine2){
        count++;
        color=color2;
        engine=engine2;
    }

    public void infocolor(){
        System.out.println("Color the car is: " + color);
    }
    public void changeColor(String color3){
        System.out.println("Color the car was change to: " + color3);
        int price = 5000;
        color = color3;
        price +=1000;
    }
}
