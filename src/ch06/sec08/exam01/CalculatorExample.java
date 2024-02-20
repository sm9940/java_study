package ch06.sec08.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        //계산기 생성
        Calculator myCal = new Calculator();

        //계산기 전원 on
        myCal.powerOn();
        //메소드의 return 타입과 같게 결과를 받을 변수 타입을 같게 해준다
        int result1 = myCal.plus(5,6);
        System.out.println("result1: "+result1);
        int x = 10;
        int y = 4;
        double result2 = myCal.divide(x,y);
        System.out.println("result2: "+result2);
        int result3 = myCal.minus(6,5);
        System.out.println("result3: "+ result3);
        int result4 = myCal.multiple(6,5);
        System.out.println("result4: "+ result4);

        myCal.powerOff();

        System.out.println();

        myCal.innerMethod();
    }
}
