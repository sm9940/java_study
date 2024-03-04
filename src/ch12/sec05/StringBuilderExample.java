package ch12.sec05;

public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder()
                .append("DEF")
                .insert(0,"ABC")
                .delete(3,4)
                .toString();
        System.out.println("data: "+data);
        StringBuilder data2 = new StringBuilder();
        data2.append("가나다");
        data2.append("라마바사");
        data2.delete(1,3);
        System.out.println("data2:"+data2);
    }
}
