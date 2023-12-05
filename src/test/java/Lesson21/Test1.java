package Lesson21;

public class Test1 {

    public static void main(String[] args) {
//        int a = 4;
//        System.out.println((a<4)?7:"hello");

        int b = 3;
        int c = 5;
        int d = (b>c) ? b++ : c++;
        System.out.println("b = " + b);
        System.out.println("c = " + c);

//        int e = (b<c)? 7: "Hello";
    }
}
