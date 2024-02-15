package ch06.sec07.exam02;

public class Korean {
    //필드(속성)
    String nation = "대한민국";
    String name;
    String ssn; //주민번호
    //생성자
    Korean(String name , String ssn){
        //this는 현재 객체를 가르킨다.
        //즉, 이 객체가 가지고 있는 필드를 의미한다.
        //생성자의 매개변수의 이름과 필드의 이름이 동일할때 사용한다.

        this.name = name; //n변수의 값을 name 필드에 넣어준다
        this.ssn = ssn; //s변수의 값을 ssn 필드에 넣어준다
    }
    //메소드 생략
}
