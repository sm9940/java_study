package ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        //자동타입변환
        Parent parent = new Child();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();
        //자식클래스에 있는 필드와 메소드는 사용 불가
//        parent.field2 = "data2";
//        parent.method3();
        //자식 클래스에 있는 멤버를 사용하기 위해 강제타입변환 진행
        Child child = (Child)parent;

        child.field2 = "data2";
        child.method1();
        child.method2();
        child.method3();
    }
}
