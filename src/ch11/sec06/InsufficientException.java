package ch11.sec06;

public class InsufficientException extends Exception{
    //생성자
    public InsufficientException(){}
    public InsufficientException(String message){
        super(message); //예외 메세지로 만들어 주기 위해 - >  예외 객체의 공통 메소드인 getMessage()의 리턴값으로 사용하기 위해

    }
}
