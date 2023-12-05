package Lesson24;

public class Test1 {
    public static void main(String[] args) {

    }

}
class A{
    String s = "Hello";
    public void abc(){
        System.out.println("???");
    }
}
class B extends A{
    String s = "Bye-bye";
    public void abc(){
        System.out.println("!!!");
    }
}
class C extends B{
    public static void main(String[] args) {
        A c = new C();
        c.abc();
        System.out.println(c.s);
    }
}
