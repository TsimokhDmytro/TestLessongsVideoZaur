package Lesson19.HomeWork;

public class Test2 {

    public static String[] abc(String[]... array1) {
        int length = 0;
        for (String[] array2 : array1) {
            length += array2.length;
        }
        String target1[] = new String[length];
        int count = 0;
        for (String[] array2 : array1) {
            for (String s : array2) {
                target1[count] = s;
                count++;
            }
        }
        return target1;
    }

    public static void main(String[] args) {
        String[] target2 = abc(new String[]{"xxx", "vvv", "ddd", "aaa"}, new String[]{"iii", "ooo", "ppp", "nnn"},
                new String[]{"qqq", "eee", "ttt", "uuu"});
        for (String s1 : args) {
            for (int i = 0; i < target2.length; i++) {
                if (s1.equals(target2[i])) {
                    target2[i] = null;
                }
            }

        }
        for (String s1 : target2) {
            System.out.print(s1 + " ");
        }
        System.out.println();
    }
}
