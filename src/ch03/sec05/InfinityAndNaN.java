package ch03.sec05;

public class InfinityAndNaN {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;
        double z = x / y;

        System.out.println("z: " + z);

        //infinty 혹은 NaN에 대처하는 방법

        //z라고 하는 숫자가 무한대냐? 혹은 숫자가 아니냐?
        if(Double.isInfinite(z) || Double.isNaN(z)){
            System.out.println("값 산출 불가");
        } else {
            System.out.println("값 산출 가능");
        }
    }
}
