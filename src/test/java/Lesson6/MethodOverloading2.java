package Lesson6;

public class MethodOverloading2 {
    int sum(int i1, int i2){
        return i1+i2;
    }
    String sum (String s1, String s2){
        return s1+s2;
    }
    static class MethodOverloadingTest2{
        public static void main(String[] args) {
            MethodOverloading2 mO2 = new MethodOverloading2();
            int result1 = mO2.sum(46,56);
            System.out.println(result1);
            String result2 = mO2.sum("Hello my friend."," How are you?");
            System.out.println(result2);
        }
    }
}
