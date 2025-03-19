package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx2 {
    public static void main(String[] args) {
        // ~~Stream : 입력값 byte 형태로 처리(문자,이미지,동영상)
        InputStream in = System.in;
        OutputStream out = System.out;

        try {

            System.out.print("이름 : ");
            byte[] b = new byte[1024];
            int input = in.read(b);

            // String 객체 생성
            // enter : 캐리지리턴(13) + 라인피드(10)
            String name = new String(b, 0, input - 2);
            System.out.println(name);

            // out.write(input);

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
