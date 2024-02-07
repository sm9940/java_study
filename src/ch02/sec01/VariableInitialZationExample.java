package ch02.sec01;

public class VariableInitialZationExample {
    public static void main(String[] args) {
        //변수 선언(메모리에 값이 할당 X)
        int value;

        value = 20; //메모리에 값이 할당된다
        //변수 선언과 동시에 메모리에 값이 할당
        int value2 = 10;

        System.out.println("value 값:" + value); // ctrl+d 라인복사
        System.out.println("value2 값:" + value2);
    }
}
