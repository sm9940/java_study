package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        //Random 클래스를 이용한 로또 당첨

        //1.번호 자동 선택
        int[]selectNumber = new int[6]; //선택번호 6개가 저장될 배열
        Random random = new Random(3);
        System.out.println("선택번호: ");
        for(int i =0; i< selectNumber.length; i++){
            selectNumber[i]=random.nextInt(45)+1;
            System.out.print(selectNumber[i]+" ");
        }
        System.out.println();

        //2. 당첨 번호 만들기
        int[] winningNumber = new int[6];
        random =new Random(5);
        System.out.println("당첨번호: ");
        for (int i = 0; i < winningNumber.length; i++) {
            winningNumber[i]=random.nextInt(45)+1;
            System.out.print(winningNumber[i]+" ");
        }
        System.out.println();
        //3. 당첨여부 알려주기
        Arrays.sort(selectNumber);
        Arrays.sort(winningNumber);
        System.out.println("정렬 후 배열");
        System.out.println(Arrays.toString(selectNumber));
        System.out.println(Arrays.toString(winningNumber));

        boolean result = Arrays.equals(selectNumber,winningNumber); //배열 값을 비교
        System.out.print("당첨여부:");
        if(result) System.out.println("1등 당첨!");
        else System.out.println("당첨되지 않았습니다.");

    }
}
