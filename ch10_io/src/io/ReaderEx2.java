package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

public class ReaderEx2 {
    // 문자 기반
    public static void main(String[] args) {

        try (Reader reader = new FileReader("c:/temp/file1.txt", Charset.forName("utf-8"));
                BufferedReader br = new BufferedReader(reader);
                Writer writer = new FileWriter("c:/temp/output2.txt");
                BufferedWriter bw = new BufferedWriter(writer)) {

            // int data = 0;
            String str = "";

            while ((str = br.readLine()) != null) {
                System.out.println(str);
                bw.write(str);
                bw.newLine();
            }

            br.readLine();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}