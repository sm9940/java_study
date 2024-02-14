package ch05.sec07;

public class MultiDimesion2 {
    public static void main(String[] args) {
        int[][] mathScores = new int[2][3];
        for (int i = 0; i < mathScores.length ; i++) {
            //행
            for (int j = 0; j < mathScores[i].length ; j++) {
                //열
                System.out.println("mathScores["+i+"]["+j+"]: "+mathScores[i][j]);
            }
        }
    }
}
