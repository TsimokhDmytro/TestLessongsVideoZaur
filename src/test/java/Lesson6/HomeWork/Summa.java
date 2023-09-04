package Lesson6.HomeWork;

public class Summa {
    int a;
    int sumaChisel(){
        int sum = 0;
        System.out.println("Сума чисел: " + sum);
        return sum;
    }
    int sumaChisel(int a2){
        int sum = a2;
        System.out.println("Сума чисел: " + sum);
        return sum;
    }
    int sumaChisel(int a3, int b3){
        int sum = a3 + b3;
        System.out.println("Сума чисел: " + sum);
        return sum;
    }
    int sumaChisel(int a4, int b4, int c4){
        int result = a4+b4+c4;
        System.out.println("Сума чисел: " + result);
        return result;
    }
    int sumaChisel(int a5, int b5, int c5, int d5){
        int sum = a5+b5+c5+d5;
        System.out.println("Сума чисел: " + sum);
        return sum;
    }
    static class sumaChiselTest{
        public static void main(String[] args) {
            Summa suma = new Summa();
            suma.sumaChisel();
            suma.sumaChisel(5);
            suma.sumaChisel(20,100);
            suma.sumaChisel(250,300,400);
            suma.sumaChisel(45,78,69,87);
        }
    }
}
