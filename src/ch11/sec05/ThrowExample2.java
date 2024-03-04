package ch11.sec05;

public class ThrowExample2 {
    public static void main(String[] args) throws ClassNotFoundException {
        //main 메소드에서 throws를 하면 JVM에서 예외를 처리해준다
        findClass();
    }
    public static void findClass()throws ClassNotFoundException{
        Class.forName("java.lang.String2");

    }
}
