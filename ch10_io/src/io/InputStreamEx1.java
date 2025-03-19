package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// 추상클래스 : 클래스 + 추상메서드, 직접 객체 생성불가, 부모역할
// int read(), int read(byte[] b, int off, int len), int read(byte b[])     
// write(int b), write(byte b[], int off, int len), write(byte b[]),        

public class InputStreamEx1 {
    public static void main(String[] args) {
        // ~~Stream : 입력값 byte 형태로 처리(문자,이미지,동영상)
        InputStream in = System.in;
        OutputStream out = System.out;

        try {
            // 한바이트만 읽은 후 int 로 돌려줌(영어,숫자만 가능,한글 불가능)
            // int input = in.read(); // abc 입력
            // out.write(input); // a 출력
            // int input = 0;
            // while ((input = in.read()) != -1) {
            // out.write(input);
            // }

            byte[] b = new byte[1024];
            while (in.read(b) != -1) {
                out.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
