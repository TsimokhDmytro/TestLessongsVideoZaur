package Lesson22;

public class Test4 {

}

class Human4 {
    Human4(String n) {
        this(n, null);
    }

    Human4(String n, String s) {
        name = n;
        surname = s;
    }

    String name;
    String surname;
}

class Student4 extends Human4 {

    Student4(){
        this(5);
        System.out.println("Hello");
    }
    Student4(int i){
        super("Mike");
    }
    public static void main(String[] args) {

        Student4 st4 = new Student4();
    }
}
