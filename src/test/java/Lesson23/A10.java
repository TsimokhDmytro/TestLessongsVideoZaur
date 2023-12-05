package Lesson23;

public class A10 {
String s1 = "Hello";
static  double d1 = 3.14;
 int summa (int ...i){
    int result = 0;
    for(int a:i){
        result += a;
    }
    return result;
}
static void abc1(){
    System.out.println("Static method");
}
}
class B10 extends A10{
//    static String s1 = super.s1 +", dear friend";
    double d1 = super.d1;
    static void abc2(){
        System.out.println("Static method2");
    }
     int summa (int ...i){
        int result = super.summa(i);
        System.out.println("Summa: " + result);
        return result;
    }
    public void checkMethod1(){
        super.abc1();
    }
    public void checkMethod2(){
        this.abc2();
    }

    public static void main(String[] args) {
        B10 b10 = new B10();
        System.out.println(b10.s1);
//        System.out.println(super.s1);
        System.out.println(b10.d1);
        b10.summa(1,2,3);
        b10.checkMethod1();
        b10.checkMethod2();
    }
}
