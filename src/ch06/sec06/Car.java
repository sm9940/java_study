package ch06.sec06;

public class Car {
    //객체의 속성과 기능은 설계도에 해당하는 class에 미리 작성해준다.

    //필드(객체의 속성)
    String company = "현대";
    int maxSpeed = 350;
    String model= "그랜저"; //자동차 모델
    boolean start = true; //시동여부
    int speed; //현재속도

    String color = "black";
    //생성자
    //메소드(객체의 기능)
    public void run(){
        System.out.println("차가 달립니다.");
    }
    public void stop(){
        System.out.println("차가 멈춥니다.");
    }
}
