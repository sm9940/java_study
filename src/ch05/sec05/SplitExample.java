package ch05.sec05;

public class SplitExample {
    public static void main(String[] args) {
        String board = "1,자바 학습, 참조타입 학습, 홍길동";

        String[] tokens = board.split(",");
        System.out.println(tokens[0]);
        System.out.println(tokens[1]);
        System.out.println(tokens[2]);
        System.out.println(tokens[3]);
        for (int i = 0; i <tokens.length ; i++) {
            System.out.println(tokens[i]);
        }
        for(String token : tokens){
            System.out.println(token);
        }
    }
}
