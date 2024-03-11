package ch15.sec04.exam02;

import java.util.Hashtable;
import java.util.Map;

public class HashTagExample {
    public static void main(String[] args) throws InterruptedException {
        Map<String,Integer> map = new Hashtable<>();
        Thread threadA = new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <=1000 ; i++) {
                    map.put(String.valueOf(i),i);
                }
            }
        };
        Thread threadB= new Thread(){
            @Override
            public void run() {
                for (int i = 1001; i <=2000 ; i++) {
                    map.put(String.valueOf(i),i);
                }
            }
        };
        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();

        int size = map.size();
        System.out.println("총 엔트리 수: "+size);
    }
}
