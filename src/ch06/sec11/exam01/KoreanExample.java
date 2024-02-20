package ch06.sec11.exam01;

import java.sql.SQLOutput;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 =new Korean("123456-1234567" ,"김자바");
        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        //final(상수) 필드는 값을 변경 X
//        k1.nation ="USA";
//        k1.ssn = "123-33-3333";
    }
}
