package Lesson25;

public class Test8 implements Inteface1, Inteface2{
    public void abc(){
        System.out.println("OK");
    }
    public static void main(String[] args) {

Test8 t8 = new Test8();
//        ((Inteface2)t8).abc();
        t8.abc();
        System.out.println(((Inteface2)t8).a);
    }
}




    interface Inteface1{
    int a=5;
        void abc();
    }
    interface Inteface2{
        int a=10;
        void abc();
    }

