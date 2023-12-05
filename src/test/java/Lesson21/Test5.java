package Lesson21;

public class Test5 {

    public void abc(int i){
        System.out.println(i);
    }

    public static void main(String[] args) {
        char c = 'a';
        Test5 t5 = new Test5();
        t5.abc(c);
        System.out.println(c+100);
    }
}
