package Lesson5;

class Car2 {
    private String color;
    private String engine;
    private int speed;

    private int gaz(int skorostPlus){
        speed +=skorostPlus;
        return speed;
    }

   private int tormoz (int skorostMinus){
        speed -=skorostMinus;
        return speed;
    }

    private void showInfoCar(){
        System.out.println("\n"+  "Color car: "+color+"\n"+"Type engine: "+engine+"\n"+"Speed: "+speed);
    }

    static class Car2Test {
         public static void main(String[] args) {
            Car2 c2 =  new Car2();
            c2.color = "green";
            c2.engine = "V8";
            c2.speed = 120;
            c2.showInfoCar();
            c2.gaz(20);
            c2.showInfoCar();
            c2.tormoz(80);
            c2.showInfoCar();

        }
    }
}
