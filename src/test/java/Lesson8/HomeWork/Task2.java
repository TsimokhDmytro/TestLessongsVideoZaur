package Lesson8.HomeWork;

public class Task2 {

    static final double PI = 3.14;

    public double findAreaCircle(double radius) {
        double areaCircle = PI * radius * radius;
        return areaCircle;
    }

    public static double findCircleLength(double radius) {
        double circleLength = PI * 2 * radius;
        return circleLength;
    }

    public void getInfoCircle(double radius) {
        System.out.println("Radius circle = " + radius + "; Area circle = " + findAreaCircle(radius) +
                "; Length circle = " + findCircleLength(radius));
    }
}

