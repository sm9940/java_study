package ch15.sec05.exam01;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);
        for (Integer score: scores){
            System.out.print(" "+score);
        }
        System.out.println();

        //특정 Integer 객체 가져오기
        System.out.println("가장 낮은 점수: "+scores.first());
        System.out.println("가장 높은 점수: "+scores.last());
        System.out.println("95점 아래 점수: " +scores.lower(95));
        System.out.println("95점 위의 점수: "+ scores.higher(95));
        System.out.println("95점이거나 바로 아래 점수: "+scores.floor(95));
        System.out.println("85점이거나 바로 위의 점수: "+scores.ceiling(85));

        NavigableSet<Integer> descendingScores = scores.descendingSet();
        for (Integer s : descendingScores){
            System.out.print(s+" ");
        }
        System.out.println();

        //범위 검색(80<= )
        //tailSet(fromElement, inclusive): 주어진 객체보다 높은 객체를 가지고 온다.
        NavigableSet<Integer> rangeSet = scores.tailSet(80,true);
        for(Integer s : rangeSet){
            System.out.print(s+" ");
        }
        System.out.println();

        //범위검색(80<=scores <90)
        //subSet(fromElement, fromInclusive, toElement,toInclusiv) :  시작과 끝으로 주어진 사이의 객체들을 구한다.
        NavigableSet<Integer> rangeSet1 = scores.subSet(80,true,90,false);
        for(Integer s : rangeSet1){
            System.out.print(s+" ");
        }
        System.out.println();
        //범위 검색 ( <= 87 ( 87이하 )
        NavigableSet<Integer> rangeSet2 = scores.headSet(87, true);
        for (Integer s : rangeSet2){
            System.out.print(s + " ");
        }
    }
}
