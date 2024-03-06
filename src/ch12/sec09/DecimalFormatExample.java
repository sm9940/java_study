package ch12.sec09;

import java.text.DecimalFormat;

public class DecimalFormatExample {
    public static void main(String[] args) {
        DecimalFormat df;
        double num = 1234567.89;
        //정수 자리까지 표시
        df = new DecimalFormat("#,###");
        System.out.println(df.format(num));
        //소수 첫째자리까지 표시
        df = new DecimalFormat("#,###.00");
        System.out.println(df.format(num));
    }
}
