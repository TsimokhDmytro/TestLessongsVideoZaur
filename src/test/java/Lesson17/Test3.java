package Lesson17;

public class Test3 {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("1234");
        StringBuilder sb2 =sb1.append(56);
        sb2= sb2.append(7).append(8);
//        StringBuilder sb2 = sb1.append("56");
//        sb2 = sb2.append("78").append("910");
//        System.out.println("sb1 = " + sb1);
//        System.out.println("sb2 = " + sb2);
//        System.out.println(sb1==sb2);
//        System.out.println(sb1.equals(sb2));
//        StringBuilder sb3 = new StringBuilder("1234");
//        System.out.println(sb1==sb3);
//        System.out.println(sb1.equals(sb3));
//        System.out.println(sb1==sb4);
        System.out.println(sb1);
        System.out.println(sb2);

        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));
    }
}
