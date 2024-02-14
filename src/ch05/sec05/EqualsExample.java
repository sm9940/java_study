package ch05.sec05;

public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "김대호"; //문자열 객체(홍길동이라는 데이터를 가지고 있음)

        String strVar2 = "김대호";

        String strVar3 = new String("김대호");

        String strVar4 = new String("김대호");

        System.out.println(strVar1);
        System.out.println(strVar3);

        if (strVar1 == strVar2) {//객체를 비교하는것은 주소를 비교하는 것이다.
           //String에서는 값이 동일 하다면 같은 객체를 공유합니다. 즉, 주소가 같습니다.
                    System.out.println("strVar1과 strVar2의 참조가 같음");
        } else {
            System.out.println("strVar1과 strVar2의 참조가 다름");
        }

        if(strVar1.equals(strVar2)){
            System.out.println("strVar1과 strVar2의 문자열이 같음");
        } else {
            System.out.println("strVar1과 strVar2의 문자열이 다름");
        }

        if (strVar3 == strVar4) {
            //String에서는 new String을 이용하면 다른 객체를 사용합니다.
            //즉, 주소가 같지 않습니다.
            System.out.println("strVar3과 strVar4의 참조가 같음");
        } else {
            System.out.println("strVar3과 strVar4의 참조가 다름");
        }
        if(strVar3.equals(strVar4)){
            System.out.println("strVar3과 strVar4의 문자열이 같음");
        } else {
            System.out.println("strVar3과 strVar4의 문자열이 다름");
        }
        if (strVar1 == strVar3) {
            //name1과 name2는 동일한 주소를 가지고 있지만
            //name1과 name3는 주소가 동일하지 않기 때문이다
            System.out.println("strVar1과 strVar3의 참조가 같음");
        } else {
            System.out.println("strVar1과 strVar3의 참조가 다름");
        }

        if(strVar1.equals(strVar3)){
            System.out.println("strVar1과 strVar3의 문자열이 같음");
        } else {
            System.out.println("strVar1과 strVar3의 문자열이 다름");
        }
    }
}
