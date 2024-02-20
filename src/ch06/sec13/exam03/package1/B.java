package ch06.sec13.exam03.package1;

public class B {
    //객체를 생성해서 사용하기 위해 쓰는 메소드
    public void method(){
        A a = new A();
        //다른 클래스내에 있는 필드에 접근하기
        a.field1 =1;
        a.field2 =1; //같은 패키지에 있기때문에 접근 가능
       // a.field3 =1; //다른 클래스에 있기때문에 접근 X

        //다른 클래스내에 있는 메소드에 접근하기
        a.method1();
        a.method2(); //같은 패키지에 있기때문에 접근 가능
       // a.method3(); //다른 클래스에 있기때문에 접근
    }
}
