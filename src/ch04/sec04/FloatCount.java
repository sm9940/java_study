package ch04.sec04;

public class FloatCount {
    public static void main(String[] args) {
        //반복문에서 초기화 식 타입에 실수형 X => 부동소수점은 연산이 정확하게 되지 않음
        for(float x = 0.1f; x <=1.0f; x+=0.1f){
            System.out.println(x);
        }
    }
}
