package ch06.sec06;

public class CarExample2 {
    public static void main(String[] args) {
        Car myCar1 = new Car(); //첫번째 자동차 생산
        myCar1.color ="white";
        myCar1.maxSpeed = 400;
        System.out.println("myCar1 색상: "+myCar1.color);
        System.out.println("myCar1 최대속도: "+myCar1.maxSpeed);
        Car myCar2 = new Car(); //두번째 자동차 생산
        myCar2.color = "gray";
        myCar2.model = "소나타";
        System.out.println("myCar2 색상: "+myCar2.color);
        System.out.println("myCar2 종류: "+myCar2.model);
        Car myCar3 = new Car(); //세번째 자동차 생산
        System.out.println("myCar3 색상: "+myCar3.color);
    }
}
