package Lesson21;

public class Test4 {
    public void abc (String s){
        System.out.println(s);
    }
     void abc (boolean b){
        System.out.println(b);
    }

    StringBuilder abc (StringBuilder sb){
        System.out.println(sb);
        return new StringBuilder("Bye");
    }
}
