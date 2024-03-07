package ch14.sec04;

public class ThreadNameExample {
    public static void main(String[] args) {
        //스레드 이름 얻어오기
        Thread mainThread = Thread.currentThread(); //이 코드를 실행하는 스레드의 객체를 참조
        System.out.println(mainThread.getName()+"실행");

        //for문을 이용해서 스레드 3개 만들기
        for (int i = 0; i < 3; i++) {
            Thread threadA = new Thread(){ //Thread를 클래스를 상속하는 자식 클래스(이름X)
                @Override
                public void run() {
                    System.out.println(getName()+"실행"); //Thread 클래스의 getName()을 물려받아 사용
                }
            };
        threadA.start();
        }
        Thread chatThread= new Thread(){
            @Override
            public void run() {
                System.out.println(getName()+"실행");
            }
        };
        chatThread.setName("chat-thread");

        chatThread.start();
    }
}
