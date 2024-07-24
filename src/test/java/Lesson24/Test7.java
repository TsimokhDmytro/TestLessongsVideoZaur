package Lesson24;
import java.util.ArrayList;
public class Test7 {
    ArrayList <String> arrayList = new ArrayList<>();
    void checkList1 (){
        arrayList.get(1);
    }

}
interface I7{
    ArrayList <String> arrayList = new ArrayList<>();
    default void checkList(){
        arrayList.get(1);
    }
}


