package ch05.sec07;

public class MultiDimesion {
    public static void main(String[] args) {
        //2차원배열 생성: 배열 안에 배열이 들어간 형태
        int[][] scores = {
                {80, 90, 96}, //1반 점수
                {76, 88} //2반 점수
        };

        //배열의 길이 출력
        System.out.println("학급의 수: " +scores.length);
        System.out.println("1반의 학생수: "+scores[0].length);
        System.out.println("2반의 학생수: "+scores[1].length);

        //1반에서 세번째 학생의 점수 읽기
        System.out.println("1반에서 세번째 학생의 점수: "+ scores[0][2]);
        //2반에서 두번째 학생의 점수 읽기
        System.out.println("2반에서 두번째 학생의 점수: "+ scores[1][1]);

        //1반의 평균 점수 구하기
        int class1Sum = 0;
        for (int i = 0; i <scores[0].length ; i++) {
          class1Sum+=scores[0][i];
        };
        double class1Avg = (double)class1Sum/scores[0].length;
        System.out.println("1반의 평균: "+ class1Avg);
        //2반의 평균 점수 구하기
        int class2Sum = 0;
        for (int i = 0 ; i<scores[1].length; i++){
            class2Sum += scores[1][i];
        }
        double class2Avg =(double)class2Sum/scores[1].length;
        System.out.println("2반의 평균: "+ class2Avg);
        //전체 학생의 평균 구하기
        int totalStudent = 0 ; //전체 학생수
        int totalSum = 0;
        for (int i = 0; i < scores.length ; i++) {//반의 갯수만큼 반복
            totalStudent += scores[i].length; //1반 , 2반의 전체 학생수를 더한다.
            for (int j = 0; j <scores[i].length ; j++) {//해당 반의 학생 수 만큼 반복
                totalSum +=scores[i][j];//학생 점수 합산

            }
        }

        double Avg = (double)totalSum/totalStudent;
        System.out.println("전체 학생의 평균: " +Avg);

    }
}
