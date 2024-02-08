package ch03.sec11;

public class Conditional {
    public static void main(String[] args) {
        //점수로 A,B,C등급을 저장
        int score = 85;
        //삼항연산자 중첩(조건이 3개 이상일때)
        char grade = (score>90)? 'A': ((score>80)? 'B':'C');

        System.out.println("내 등급: "+ grade);


    }
}
