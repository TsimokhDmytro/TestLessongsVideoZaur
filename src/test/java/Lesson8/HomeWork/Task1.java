package Lesson8.HomeWork;

public class Task1 {
    
    public static double umnojenie(double a, double b, double c) {
        return a * b * c;
    }

    public static void delenie(int d, int f) {
        System.out.println("Celoe chiastnoe = " + d/f + ";" + "Ostatok = " + d%f);
    }
    static class Zadacha1Test {
        public static void main(String[] args) {
            System.out.println(umnojenie(78, 56, 87));
            Task1.delenie(22, 4);
            System.out.println(Task1.umnojenie(58, 44, 63));
            delenie(41, 6);
        }
    }
}


