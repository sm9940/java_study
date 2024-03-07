package ch09.sec02.exam01;

public class A {
    //인스턴스 멤버 클래스
    class  B{
        public void method2(){}
    }
    //필드(B객체 대입)
    B field = new B();

    //생성자(B 객체 생성)에서 사용
    public  A(){
        B b = new B();
    }
    //메소드 (B객체 생성)에서 사용
    void method(){
        B b = new B();
        b.method2();
    }

}
