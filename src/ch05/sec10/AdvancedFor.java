package ch05.sec10;

public class AdvancedFor {
    public static void main(String[] args) {
        int[] scores = {95, 71, 84, 93, 87};
        int sum = 0;
        for(int score:scores){
            System.out.println(score);
            sum+=score;
        }
        System.out.println(sum);

        double avg = (double)sum/ scores.length;
        System.out.println("평균: " + avg);
    }
}
