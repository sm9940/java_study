package ch06.sec11.exam01;

public class Korean {
    //상수 필드 선언
    final String nation = "대한민국"; //첫번째 필드 초기화 방법
    final String ssn;

    //인스턴스 필드
    String name;
    //두번째 상수 필드 초기화 방법
    public Korean(String ssn, String name){
        this.ssn = ssn;
        this.name =name;
    }
}
