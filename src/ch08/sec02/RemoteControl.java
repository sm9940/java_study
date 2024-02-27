package ch08.sec02;

public interface RemoteControl {
    //필드 상수 선언
    int MAX_VOLUME = 10; //public static final 생략되었다고 생각
    int MIN_VOLUME = 0;
    public void turnOn(); //abstract가 생략됨

}
