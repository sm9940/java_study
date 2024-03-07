package ch09.sec03.exam01;

public class AExample {
    public static void main(String[] args) {
        //정적 멤버 클래스는 A객체 생성 없이 B객체 생성가능
       A.B b = new A.B();
    }
}
