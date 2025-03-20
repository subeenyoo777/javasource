package io;

import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.Charset;

public class ReaderEx3 {
    public static void main(String[] args) {

        try (Reader reader = new FileReader("./ch10_io/src/io/FileEx1.java", Charset.forName("utf-8"));
                BufferedReader br = new BufferedReader(reader)) {

            int data = 0;
            String str = "";
            int i = 1;

            while ((str = br.readLine()) != null) {
                System.out.printf("%d %s\n", i++, str);
            }

            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
            br.readLine();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
