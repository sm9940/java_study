package ch12.sec06;


public class BoxingUnBoxing {
    public static void main(String[] args) {
        //박싱(Boxing)  -> 포장 클래스에 값을 넣어주는것
        Integer obj = 100;
        System.out.println("value: "+obj);
        //언박싱(UnBoxing) -> 포장 클래스에 넣엇던 값을 다시 기본타입으로 바꿔주는 것
        int value = obj;
        System.out.println("value: "+value);

        //연산시 언박싱
        int result = obj + 100;
        System.out.println("result: "+ result);
    }
}
