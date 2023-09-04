package Lesson17.HomeWork;

public class EqualsTest {

    static StringBuilder sb1 = new StringBuilder("Hello");
    static StringBuilder sb2 = new StringBuilder("Bay-Bay");
    static StringBuilder sb3 = sb2;

    public static boolean equalsBuilder1(Object obj1, Object obj2){
        if (obj1==obj2){
            return true;
        } else{
                return false;
            }
        }

    public static boolean equalsBuilder2(Object obj1, Object obj2){
        if (obj1.equals(obj2)){
            return true;
        } else{
            return false;
        }
    }

    public static void main (String[] args){
        System.out.println(equalsBuilder1(sb1, sb2));
        System.out.println(equalsBuilder1(sb2, sb3));

        System.out.println(equalsBuilder2(sb1, sb2));
        System.out.println(equalsBuilder2(sb2, sb3));
    }
}


