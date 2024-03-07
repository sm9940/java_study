package ch09.sec02.exam02;

public class A {
    class B {
        //필드
        int field1 = 1;
        static int field2 = 2; //중첩클래스에서 사용하는 정적필드는 jdk17부터 가능
        //생성자
        B(){
            System.out.println("B-생성자 실행");
        }
        //메소드
        void method1(){
            System.out.println("B-method1 실행");
        }
        //중첩클래스에서 정적 메소드 jdk17부터 사용가능
        static void method2(){
            System.out.println("B-method2 실행");
        }
    }
    //A클래스의 인스턴스 메소드
    void useB(){
        B b = new B();
        System.out.println(b.field1); //b객체 인스턴스 필드 사용
        b.method1(); //b객체 인스턴스 메소드 사용

        System.out.println(B.field2);//B클래스의 정적 필드 사용
        B.method2();//B클래스의 정적 메소드 사용
    }
}
