package ch09.sec03.exam02;

public class A {
    static class B{
        int field1 =1;
        static int field2 =2; //정적필드  jdk17 사용가능
        B() {
            System.out.println("B-생성자 실행");
        }
        void method1() {
            System.out.println("B-method1 실행");
        }
        //중첩클래스 정적메소드 jdk17부터 사용가능
        static void method2(){
            System.out.println("B-method2 실행");
        }
    }
}
