package ch05.sec04;

public class GarbageObj {
    public static void main(String[] args) {
        String hobby = "여행";
        hobby = null; //String 객체를 쓰레기 객체로 만듦

        String kind1 ="자동차";
        String kind2 =kind1; //주소의 복사
        kind1 = null;

    }
}
