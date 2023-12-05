package Lesson24;
public class Test2 {
    public static void main(String args[]) {
        Figure f = new Priamokytnuk();
//        Figure f2 = new Shistykutnyk();
//        Figura f = new Figure();
        f.showInfo();
        f.perymetr();
        f.ploscha();
//        f.abc();
        System.out.println("Kilkist storin: " + f.kilkistStorin);
    }
}
 abstract class Figure {
//    Figure (int kilkistStorin){
//        this.kilkistStorin = kilkistStorin;
//    }
    int kilkistStorin = 0;
   abstract public void perymetr();
   abstract public void ploscha();
   public void showInfo(){
       System.out.println("This is figure");
   }
}
abstract class Kvadrat extends Figure {
//    Kvadrat (int kilkistStorin){
//        super(kilkistStorin);
//        this.kilkistStorin = kilkistStorin;
//    }
    int kilkistStorin = 4;
    int storona1 = 10;
    public void perymetr(){
        System.out.println("Perymetr kvadrata is: " + storona1*kilkistStorin);
    }
//    public abstract void perymetr();
    public void ploscha(){
        System.out.println("Ploscha kvadrata is: " + storona1*storona1);
    }
   abstract public void halfPerymetr();
}
class Priamokytnuk extends Figure {
    int kilkistStorin = 4;
    int storona1 = 8;
    int storona2 = 5;
    public void perymetr(){
        System.out.println("Perymetr priamokytnuka is: " + 2*(storona1 + storona2));
    }
    public void ploscha(){
        System.out.println("Ploscha priamokytnuka is: " + storona1*storona2);
    }
    public void abc(){
        System.out.println("It is method for Priamokytnuk only");
    }
}
class Kolo extends Figure {
    int kilkistStorin = 0;
    int radius = 3;
    public void perymetr(){
        System.out.println("Dovzhyna okryzhnosti is: " + 2*3.14*radius);
    }
    public void ploscha(){
        System.out.println("Ploscha kola is: " + 3.14*(radius*radius));
    }
}
abstract class Shistykutnyk extends Figure {
    public void showInfo2(){
        System.out.println("This is shistykutnyk");
    }
}
