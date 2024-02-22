package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        //자동타입변환
        Parent parent = child ;
        //메소드 호출
        //자동타입변환이 일어나면 부모 클래스에 있는 필드와 메소드만 사용가능
        //단, 오버라이드된 메소드는 예외적으로 자식 클래스에 있는 메소드 호출 가능
        parent.method1();
        parent.method2();
//        parent.method3();

        parent.field1 = 2;
      //  parent.field2 = 2;
    }
}
