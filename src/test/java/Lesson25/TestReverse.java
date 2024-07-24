package Lesson25;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestReverse{
    public void reverseString(String s) {
        char[] arrayString = s.toCharArray();
        for (int i = 0, j = arrayString.length - 1; i < j; i++, j--) {
            char charI = arrayString[i];
            arrayString[i] = arrayString[j];
            arrayString[j] = charI;
        }
        System.out.println(new String(arrayString));
//        String reverseString = new String(arrayString);
    }
    @Test
    public void checkReverseString(){
        TestReverse r1 = new TestReverse();
        r1.reverseString("Hello my name is");

//        Integer i1 = new Integer(2);
//        Integer i2 = new Integer(2);
//        System.out.println(i1==i2);
//        System.out.println(i1.equals(i2));

        int [] arr1 = {2};
        int [] arr2 = {2};
        System.out.println(arr1==arr2);
        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(arr1.equals(arr2));
//        System.out.println(Arrays.equals(arr1,arr2));

        String s1 = new String("111");
        String s2 = new String("111");
//        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

    }
}
class T1 extends TestReverse{

}










