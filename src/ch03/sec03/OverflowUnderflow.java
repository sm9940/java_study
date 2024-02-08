package ch03.sec03;

public class OverflowUnderflow {
    public static void main(String[] args) {
        byte var1 = 125;
        for (int i= 0 ; i<5; i++){
            var1++; //오버플로우: 최댓값의 허용범위를 벗어나면 최솟값으로 간다.
            System.out.println("var1: " +var1);


        }
        System.out.println("==================");

        byte var2 =-125;
        for (int j = 0; j < 5; j++) {
            var2--;
            System.out.println("var2: "+var2);
        }
        //연산을 할 때, 언더플로우나 오버플로우가 일어나면 큰타입으로 변경 int를 애용하자
    }

}
