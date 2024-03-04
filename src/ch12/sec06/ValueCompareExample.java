package ch12.sec06;

public class ValueCompareExample {
    public static void main(String[] args) {
        Integer obj1 = 300;
        Integer obj2 = 300;
        System.out.println(obj1 == obj2); //주소를 비교
        System.out.println(obj1.equals(obj2)); //실제 값을 비교

        //-128 ~ 127 사이의 숫자는 값 자체를 비교(Integer, Short , Byte)
        Integer obj3 = 10;
        Integer obj4 = 10;
        System.out.println(obj3 == obj4); //실제 값을 비교
        System.out.println(obj3.equals(obj4)); //실제 값을 비교
    }
}
