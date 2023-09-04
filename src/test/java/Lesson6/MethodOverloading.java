package Lesson6;

public class MethodOverloading {
    private void show(int i1){
        System.out.println(i1);
    }
    private void show(boolean b1){
        System.out.println(b1);
    }
    private void show(String s1){
        System.out.println(s1);
    }
    private void show(int a, String s){
        System.out.println("string: "+s +"\n"+ "int: "+a);
    }
    private void show(String a, int s){
        System.out.println("string: "+s +"\n"+ "int: "+a);
    }
   static class methodOverloadingTest{
        public static void main(String[] args) {
            MethodOverloading mO = new MethodOverloading();
            int a = 250;
            mO.show(a);
            boolean b = true;
            mO.show(b);
            String s = "Privet";
            mO.show(s);
            int a1 = 5698;
            String s1 = "Hello";
            mO.show(a1,s1);
            int a2 = 777;
            String s2 = "Hi";
            mO.show(s2, a2);
        }
    }
}
