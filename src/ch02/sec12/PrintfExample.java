package ch02.sec12;

public class PrintfExample {
    public static void main(String[] args) {
        System.out.println("안녕하세요.");
        System.out.print("자바입니다.");
        // System.out.printf("이름: %1$s, 나이: %3$d, 일자: %2$d일", "이지은", 27, 10);

        int value = 123;
        System.out.printf("상품의 가격:%d원\n", value);
        System.out.printf("상품의 가격:%6d원\n", value);//정수 6자리, 왼쪽 공백
        System.out.printf("상품의 가격:%-6d원\n", value);//정수 6자리, 오른쪽 공백
        System.out.printf("상품의 가격:%06d원\n", value);//정수 6자리, 오른쪽 공백

        double area = 3.14159 * 10 * 10;
        
        //정수7자리 + 소수점 + 소수2자리, 왼쪽 공백
        System.out.printf("반지름이 %d인 원의 넓이 : %10.2f\n", 10, area);
        //정수7자리 + 소수점 + 소수2자리, 오른쪽 공백
        System.out.printf("반지름이 %d인 원의 넓이 : %-10.2f\n", 10, area);
        //정수7자리 + 소수점 + 소수2자리, 왼쪽 공백 0으로 채움
        System.out.printf("반지름이 %d인 원의 넓이 : %010.2f\n", 10, area);

        String name = "이지은";
        String job = "가수";
        System.out.printf("%6s|%-6s",name, job);

    }
}
