package ch05.sec03;

public class Reference {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = arr2; //메모리 상의 값(주소)을 복사한다

        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr3);

        //참조타입은 주소를 비교한다.
        System.out.println(arr1 == arr2);//false
        System.out.println(arr2 == arr3);//true
    }
}
