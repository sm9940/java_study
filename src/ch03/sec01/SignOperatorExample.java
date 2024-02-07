package ch03.sec01;

public class SignOperatorExample {
    public static void main(String[] args) {
        int x = -100;
        x = -x;
        System.out.println("x: " + x);

        byte b = 100;
        int y =-b; //java는 부호를 붙이는 것도 연산을 하므로 자동타입 변환이 발생한다.
        System.out.println("y: " + y);
    }
}
