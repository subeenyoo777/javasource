package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx3 {
    public static void main(String[] args) {
        int data = 0;
        byte b[] = new byte[1024];
        // try-with-resource : finally 에서 자원해제 하는 부분 자동화
        try (FileInputStream fis = new FileInputStream("c:/temp/img1.jpg");
                FileOutputStream fos = new FileOutputStream("c:/temp/output1.jpg");) {

            long start = System.currentTimeMillis();
            while ((data = fis.read(b)) != -1) {
                // char ch = (char) data;
                // System.out.print(ch);
                fos.write(b);
            }
            long end = System.currentTimeMillis();
            System.out.println("복사하는데 걸린 시간 : " + (end - start) + " ms");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
