package Lesson19;

public class Test5 {

    public static void main(String[] args) {
        String students []= new String[]{"John", "Miki", "Lesli"};
        String exams []= new String[]{"Math", "Economy", "Philosophy"};
        for (String s:students) {
            for (String e:exams) {
                if (e=="Philosophy"){
                    break;
                }
                System.out.println(s + " - " + e);
            }
        }
    }
}
