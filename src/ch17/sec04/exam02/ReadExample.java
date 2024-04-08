package ch17.sec04.exam02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReadExample {
    public static void main(String[] args) {
        Reader reader = null;
        try {
            //한문자씩 읽기
            reader = new FileReader("C:/Temp/test.txt");
            while (true){
                int data = reader.read();
                if(data == -1) break;
                System.out.println((char)data);
            }
            //문자배열로 읽기
            reader = new FileReader("C:/Temp/test.txt");
            char[] data = new char[100]; //100개의 문자열을 읽어온다.
            while (true){
                int num = reader.read(data);
                System.out.println("num: " + num);
                if(num ==-1) break;
                for (int i = 0 ; i<num; i++) {
                    System.out.println(data[i]);
                }
            }
            reader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
