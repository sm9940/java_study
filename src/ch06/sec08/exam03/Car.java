package ch06.sec08.exam03;

public class Car {
    //필드
    int gas; //기름량

    //메소드
    //1. 기름 주유
    void setGas(int gas){
        this.gas = gas;
    }
    //2. 기름양이 있는지 없는지 출력
    boolean isLeftGas(){
     if(this.gas == 0){
         System.out.println("기름이 없습니다");
         return false;
     }   else {
         System.out.println("기름이 있습니다");
         return true;
     }
    }
    //3. 자동차가 달리면서 기름을 소진하는 메소드
    void run(){
        while(true){
            if(this.gas>0){
                System.out.println("달립니다."+"(기름양:"+this.gas+")");
                //차가 달릴때마다 기름은 1씩 소진시킴
                this.gas -= 1;

            } else {//기름이 없으면
                System.out.println("멈춥니다."+"(기름양:"+this.gas+")");
                return; //void 메소드를 종료시키고 싶을때 사용
            }
        }
    }
}
