package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.Buffer;
import java.util.Scanner;

public class WriterEx1 {
    public static void main(String[] args) {

        // 키보드에서 입력을 받아들여 그 내용을 파일에 작성
        // 사용자가 q를 입력하면 입력 받는 걸 중지 > 그 내용을 파일에 작성
        Scanner sc = new Scanner(System.in);
        System.out.println("파일에 작성할 데이터를 입력해 주세요");
        System.out.println("중지하려면 q를 입력해 주세요");

        String data = "";
        String result = "";
        result += data;

        do {
            System.out.print(">>");
            data += sc.nextLine();

        } while (!data.equals("q"));

        try (FileWriter fw = new FileWriter("c:/temp/user/txt");
                BufferedWriter br = new BufferedWriter(fw)) {
            br.write(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
