package ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";
        int location = subject.indexOf("프로그래밍");
        System.out.println(location);

        //subject에서 프로그래밍으로 시작하는 글자 추출하기
        String substring = subject.substring(3);
        System.out.println(substring);

        //문자열에서 '자바'라고 하는 글자가 있는지 확인
        location = subject.indexOf("자바");
        System.out.println(location);

        //indexOf는 찾는 글자가 없으면 무조건 -1을 준다
        if(location == -1) System.out.println("'자바'라고 하는 글자가 없습니다.");
        else System.out.println("'자바'라고 하는 글자가 있습니다.");

        //해당 글자를 포함하는지 true 혹은 false로 값을 준다.
        boolean result = subject.contains("자바");
        System.out.println(result);
        if (result) System.out.println("'자바'라는 글자가 있습니다");
        else System.out.println("'자바'라는 글자가 없습니다");
    }
}
