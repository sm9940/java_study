package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        //ArrayList 정의 방법

        //E에 지정된  타입 객체만 저장
        List<Board> list = new ArrayList<Board>();
        List<Board> list2= new ArrayList<>();
        list.add(new Board("제목1","내용1","글쓴이1"));
        list.add(new Board("제목2","내용2","글쓴이2"));
        list.add(new Board("제목3","내용3","글쓴이3"));
        list2.add(new Board("제목1","내용1","글쓴이1"));

        Board board = list.get(2);
        System.out.println(board.getSubject()+" "+board.getWriter());
        System.out.println();
        list.remove(1);

        for (int i = 0; i < list.size(); i++) {
            Board b = list.get(i);
            System.out.println(b.getSubject()+" "+b.getWriter());
        }
        for (Board b : list){
            System.out.println(b.getSubject()+" "+b.getWriter());
        }
        //모든 타입의 객체 저장 가능(제네릭을 지정하지 않으면 디폴트 타입은 Object)
        List list3 = new ArrayList<>();
        list3.add(new Board("제목1","내용1","글쓴이1"));
        list3.add("문자열 객체");
        ArrayList list4 = new ArrayList();
        list4.add(new Board("제목1","내용1","글쓴이1"));
        list4.add("문자열 객체");
    }
}
