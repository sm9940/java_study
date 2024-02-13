package ch04.sec04;

public class SumFrom1To100 {
    public static void main(String[] args) {
        //1~100 까지의 합계 구하기
        int sum = 0 ;
        for (int i =1 ; i<=100 ; i++){
            sum += i;
        }
        System.out.println("1~100까지의 합계: " + sum);
    }
}
