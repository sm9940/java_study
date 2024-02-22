package ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        //필드를 이용해 자동타입변환이 일어난다
        myCar.tire =new HankookTire(); //Tire tire =new HankookTire();

        myCar.run(); //tire.roll(); -> 오버라이드 된 메소드가 있으면 자식클래스에 있는 메소드로 실행
        myCar.tire = new KumhoTire();
        myCar.run(); //메소드에는 tire.roll()이라는 기능이 있기때문에 KumhoTire.roll()

        myCar.tire = new Tire();
        myCar.run();
    }
}
