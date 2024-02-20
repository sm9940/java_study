package ch06.sec10.exam02;

public class Television {
    //정적필드는 일반적으로 선언과 동시에 초기값을 준다.
    static String company = "LG";
    static String model = "LCD";
    static String info;

    //복잡한 초기화 작업이 필요한 경우
    static {
        info= company+ "_" +model;
    }
}
