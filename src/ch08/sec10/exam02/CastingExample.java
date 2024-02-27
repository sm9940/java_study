package ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();
        vehicle.run();
        //자식 클래스에 메소드를 호출하기 위해 강제타입변환
        Bus bus =(Bus)vehicle;
        bus.run();
        bus.checkFare();
    }
}
