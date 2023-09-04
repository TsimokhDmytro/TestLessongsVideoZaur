package Lesson5;

public class Test20 {
    int summaChisel(int a, int b, int c) {
        int result1 = a + b + c;
        return result1;
    }

    int avgChisel(int d, int e, int f) {
        int result2 = d + e + f;
        return result2;
    }

    static class Test21 {
        public static void main(String[] args) {
            Test20 t = new Test20();
            int resultSum = t.summaChisel(3, 6, 7);
            System.out.println("SumaChisel1: " + (resultSum));
            System.out.println("SumaChisel2: " + (t.summaChisel(4, 3, 16)));
            System.out.println("SredneArifmeticheskoeChislo: " + (t.avgChisel(36, 987, 1349)));
        }
    }
}
