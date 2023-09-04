package Lesson16;

public class Test7 {
    public static void main(String[] args) {
        String s1 = "Hello world. ";
        String s2 = "Уррррраааа!!!";
        String s3 = s1.concat(s2).trim().replace("Uraaaaaa!!!", "Urrrraaa!!!").substring(6,10);
        System.out.println(s1.substring(s1.indexOf("w")));
        System.out.println(s3);


    }

}
