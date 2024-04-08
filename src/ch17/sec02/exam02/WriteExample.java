package ch17.sec02.exam02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("C:/Temp/test2.db");
            byte[] array = {10,20,30};

            os.write(array,1,3);

            os.flush();
            os.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
