package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x:" + x + ",y:" + y);

        //두 변수의 값을 교환하는 방법
        int temp = x; //임의의 변수 하나를 만들고 temp: 3
        x= y; //x:5
        y= temp; //y: 3
        System.out.println("값 교환 후 x:" + x + ",y:" + y);
    }
}
