package Lesson24;

public class TestOlenka {

    public int getIndex(int[] array, int a) {
        for (int i = 0; i < array.length; i++) {
            if (a <= array[i]) {
                return i;
            }
        }
        return array.length;
    }

    public StringBuilder getLastWordStringBuilder(StringBuilder sb1) {
        StringBuilder sb2 = new StringBuilder("");
        for (int i = sb1.length() - 1; i >= 0; i--) {
            if (sb1.charAt(i) == ' ') {
                break;
            }
            sb2.append(sb1.charAt(i));
        }
        return sb2.reverse();
    }

    public String getLastWordString(String s1) {
        String s2 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            if (s1.charAt(i) == ' ') {
                break;
            }
            s2 += s1.charAt(i);
        }
        String s3 = "";
        for (int i = s2.length() - 1; i >= 0; i--) {
            s3 += s2.charAt(i);
        }
        return s3;
    }

    public static void main(String[] args) {
        TestOlenka t = new TestOlenka();
        System.out.println(t.getIndex(new int[]{1, 2, 3, 5}, 4));
        System.out.println(t.getLastWordStringBuilder(new StringBuilder("Hello, my name is Dmytro. I am QA engineer")));
        System.out.println(t.getLastWordString("Hello, my name is Dmytro. I am QA engineer"));


    }
}



