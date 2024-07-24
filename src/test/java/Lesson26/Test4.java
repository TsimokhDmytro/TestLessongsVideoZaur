package Lesson26;

public class Test4 {
//    void abc(String s){
//        System.out.println("A");
//    }
//    void abc(String ...s){
//        System.out.println("B");
//    }
//    void abc(Object s){
//        System.out.println("C");
//    }
//    void abc(String s1, String s2){
//        System.out.println("D");
//    }
    void def(Long a){
        System.out.println("E");
    }
    void def(Long ... a){
        System.out.println("F");
    }
//    void def(long a){
//        System.out.println("G");
//    }
    void def(Object a){
        System.out.println("H");
    }
//    void def(Integer a){
//        System.out.println("I");
//    }

    public static void main(String[] args) {
        Test4 t = new Test4();
//        t.abc("ok", "Hello", "Bye");
//        t.def(50l);
        t.def(50);
    }
}
