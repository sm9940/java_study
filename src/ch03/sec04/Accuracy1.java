package ch03.sec04;

public class Accuracy1 {
    public static void main(String[] args) {
        //사과 1개를 1(1.0)로 보고 7조각(0.7)을 뺀 3조각(0.3)을 구하는 코드입니다.
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double result = apple - number * pieceUnit;
        System.out.println("사과 1개에서 남은 양:" + result
        );
    }
}
