package Lesson27;

import java.io.*;
public class Test3 {
    public static void main(String[] args) throws IOException {
        File file = new File("test9.txt");
        FileInputStream fis = new FileInputStream(file);
        fis.read();
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(100);
    }
}
