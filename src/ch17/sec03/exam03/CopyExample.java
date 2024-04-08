package ch17.sec03.exam03;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) {


        try {
            String originFileName= "C:/Temp/test.jpg"; //원본파일
            String targetFileName = "C:/Temp/test2.jpg"; //복사파일
            //입력 스트림을 이용해서 원본 파일 읽음
            InputStream is = new FileInputStream(originFileName);
            //출력스트림을 이용해서 복사 파일을 출력
            OutputStream os = new FileOutputStream(targetFileName);

            byte [] data = new byte[1024]; //1024 바이트씩 읽어오도록 지정

            while (true){
                int num = is.read(data);
                if(num == -1) break;
                os.write(data,0,num);

            }
            os.flush();
            os.close();
            is.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
