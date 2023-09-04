package Lesson5;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class LearnCollection {

    @Test
    public void Coll (){
        List<Integer> ar1 = new ArrayList<>();
        ar1.add(1);
        List<Integer> ll2 = new LinkedList<>(ar1);
        System.out.println(ll2);





    }
}
