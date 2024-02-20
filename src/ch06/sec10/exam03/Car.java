package ch06.sec10.exam03;

public class Car {
    //인스턴스 필드
    int speed;
    static String color = "red";
    //인스턴스 메소드
    void run(){
        System.out.println(speed + "으로 달립니다");
        System.out.println(color);
    }
    //정적 메소드
    //정적 멤버들은 객체를 생성하지 않아도 클래스가 메모리로 로딩될때 자동으로 실행됨
    //인스턴스 멤버들은 객체를 생성해야 사용할 수 있으므로 static 메소드, static블록에서는
    //반드시 객체를 생성하고 사용해야함
    static void simulate(){
        Car myCar = new Car(); //클래스 내부에서 자기 자신을 객체로 생성가능
        myCar.speed =200;
        myCar.run();
//        System.out.println(myCar.speed + "으로 달립니다.");
//        System.out.println(color);
    }

    public static void main(String[] args) {
        //정적 메소드 호출 가능 -> 객체를 생성하지 않고 호출 가능
        simulate(); //Car.simulate(); 같은 Car 클래스에 있어서 클래스명은 생략 가능

        Car mycar =new Car();
        mycar.speed =60;
        mycar.run();
    }
}
