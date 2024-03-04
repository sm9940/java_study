package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String data1 ="홍길동&이수홍,박연수";
        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer st = new StringTokenizer(data2,"/");
        String[] arr = data1.split("&|,");
        for (String str : arr){
            System.out.println(str);
        }
        while (st.hasMoreTokens()){ //남아 있는 문자열이 잇는지 여부
            String token = st.nextToken(); //문자열을 하나씩 가져옴
            System.out.println(token);
        }
    }
}
