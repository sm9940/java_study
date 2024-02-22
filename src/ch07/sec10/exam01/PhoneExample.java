package ch07.sec10.exam01;

public class PhoneExample {
    public static void main(String[] args) {
        //abstract 클래스는 객체 생성 X
        //Phone phone = new Phone();

        SmartPhone smartPhone =new SmartPhone("길동");
        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();

    }
}
