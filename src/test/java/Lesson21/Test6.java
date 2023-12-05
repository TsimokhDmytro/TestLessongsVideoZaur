package Lesson21;

public class Test6 {
    int abc (){
        return 5;
    }

   int abc2(int i){
        if (i>10){return 5;}
        else {return 0;}
    }

 void abc3(){
     System.out.println("Hello");
     return;
//     System.out.println();
 }
 void abc4(int i){
     if (i>2){
         return;
     }
 }

    public static void main(String[] args) {
        int a = new Test6().abc();
        //або
        new Test6().abc();
        System.out.println(new Test6().abc2(20));
        System.out.println(new Test6().abc2(7));

    }
}
