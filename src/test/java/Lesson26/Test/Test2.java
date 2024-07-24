package Lesson26.Test;

public class Test2 {

}

class X {
    static String s = "";

    {
        s += "A";
    }

    static {
        s += "B";
    }

    {
        s += "C";
    }
}

class Z {
    public static void main(String[] args) {
        System.out.println(X.s);
        System.out.println(X.s);
        new X();
        new X();
        System.out.println(X.s);
    }
}

