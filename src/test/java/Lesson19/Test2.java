package Lesson19;

public class Test2 {

    public static void summ(String s, int ... a){
        int summ = 0;
        for (int i = 0; i < a.length; i++) {
            summ +=a[i];
        }
        System.out.println("Summa " + s + ": " + summ);
    }

    public static void length(int a, int ... b){
        System.out.println(b.length);
    }

    public static void method1(int [] ... array){
        System.out.println(array[0].length);
    }


    public static void main(String[] args) {
        summ("чисел",new int []{3,6,5});
        summ("чисел",15,30,20);
        summ("чисел",15,30, 3,8);
        length(10);
        method1(new int[]{1,2,3,5});
        method1(new int[]{1,6,8},new int[]{9,8});

//        summ(new int []{15,30});
//        summ(new int []{15,30,20});
//        summ(new int []{15,30,3,8});
    }
}
