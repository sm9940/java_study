package ch02.sec02;

public class ByteExample {
    public static void main(String[] args) {
        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = 30;
        byte var5 = 127; //2진수: 01111111 -> 맨 앞자리가 남는다
//      byte var6 = 128;//2진수: 10000000 제일 앞에는 항상 부호비트로 쓰이므로 사용 X

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
    }
}
