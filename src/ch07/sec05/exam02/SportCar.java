package ch07.sec05.exam02;

public class SportCar extends Car{
    @Override
    public void speedUp() {
        speed += 10;
    }
//    @Override
//    public final void stop(){ //final라 오버라이딩이 불가
//        System.out.println("차를 멈춤");
//        speed = 0 ;
//    }
}
