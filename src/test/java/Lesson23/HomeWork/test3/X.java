package Lesson23.HomeWork.test3;

public class X {
    public X() {
        System.out.println("X");
    }

    public X(int i) {
        System.out.println("X" + " " + i);
    }

    private boolean abc() {
        return false;
    }

    public static void main(String[] args) {
        X x = new Y(5);
        System.out.println(x.abc());
    }
}

class Y extends X {
    public Y(int i) {
        System.out.println("Y");
    }

    public boolean abc() {
        return true;
    }
}
