package ch12.sec09;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
    public static void main(String[] args) {
        Date now = new Date(); //오늘 날짜와 시간

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("yy-M-d");
        System.out.println(sdf.format(now));
        sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초 ");
        System.out.println(sdf.format(now));
        sdf = new SimpleDateFormat("오늘은 E요일");
        System.out.println(sdf.format(now));
        sdf = new SimpleDateFormat("올해의 D번째 날");
        System.out.println(sdf.format(now));
        sdf = new SimpleDateFormat("이달의 d번째 날");
        System.out.println(sdf.format(now));
    }
}
