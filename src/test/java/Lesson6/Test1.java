package Lesson6;

public class Test1 {
    int sum(int a, int b, int c) {
        return a + b + c;
    }
    int serednieAryfmetychne(int x, int y, int z){
        return sum(x,y,z)/3;
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        System.out.println(t1.sum(3,8,9));
        System.out.println(t1.serednieAryfmetychne(2,9,7));
    }
}
