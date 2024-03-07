package ch14.sec03.exam02;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                //멀티스레드로 동시 실행 시키고 싶은 코드를 run() 메소드에 입력
                for (int i = 0; i < 5; i++) {
                    System.out.println("띵");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread.start();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep(); //비프문 발생
            Thread.sleep(500);
        }

    }
}
